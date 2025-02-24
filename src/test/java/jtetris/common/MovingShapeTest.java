package jtetris.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link MovingShape}.
 * Created by ngeor on 16/6/2017.
 */
@SuppressWarnings("MagicNumber")
public class MovingShapeTest {
    @Test
    public void create() {
        Shape shapeDefinition = mock(Shape.class);
        MovingShape movingShape = new MovingShape(shapeDefinition, 1, 2);
        assertEquals(shapeDefinition, movingShape.getShapeDefinition());
        assertEquals(1, movingShape.getRow());
        assertEquals(2, movingShape.getColumn());
    }

    @Test
    public void moveLeft() {
        Shape shapeDefinition = mock(Shape.class);
        MovingShape movingShape = new MovingShape(shapeDefinition, 1, 2);

        // act
        MovingShape newShape = movingShape.moveLeft();

        // assert
        assertEquals(2, movingShape.getColumn());
        assertEquals(1, newShape.getColumn());
    }

    @Test
    public void moveRight() {
        Shape shapeDefinition = mock(Shape.class);
        MovingShape movingShape = new MovingShape(shapeDefinition, 1, 2);

        // act
        MovingShape newShape = movingShape.moveRight();

        // assert
        assertEquals(2, movingShape.getColumn());
        assertEquals(3, newShape.getColumn());
    }

    @Test
    public void moveDown() {
        Shape shapeDefinition = mock(Shape.class);
        MovingShape movingShape = new MovingShape(shapeDefinition, 1, 2);

        // act
        MovingShape newShape = movingShape.moveDown();

        // assert
        assertEquals(1, movingShape.getRow());
        assertEquals(2, newShape.getRow());
    }

    @Test
    public void rotate() {
        Shape shapeDefinition = mock(Shape.class);
        MovingShape movingShape = new MovingShape(shapeDefinition, 1, 2);

        // act
        MovingShape newShape = movingShape.rotate();

        // assert
        assertEquals(shapeDefinition, movingShape.getShapeDefinition());
        assertThat(newShape.getShapeDefinition()).isInstanceOf(ShapeRotation.class);
    }
}
