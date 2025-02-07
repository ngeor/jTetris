package jtetris.common.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jtetris.common.BlockType;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link JShape}.
 * Created by ngeor on 16/6/2017.
 */
@SuppressWarnings("MagicNumber")
public class JShapeTest {
    private final JShape shape = new JShape();

    @Test
    public void blockAt() {
        char[][] expected = new char[][] {
            {' ', 'J'},
            {' ', 'J'},
            {'J', 'J'}
        };

        for (int row = 0; row < shape.getRows(); row++) {
            for (int col = 0; col < shape.getColumns(); col++) {
                BlockType expectedBlockType = expected[row][col] == ' ' ? BlockType.Empty : BlockType.J;
                assertEquals(expectedBlockType, shape.blockAt(row, col));
            }
        }
    }

    @Test
    public void getColumns() {
        assertEquals(2, shape.getColumns());
    }

    @Test
    public void getRows() {
        assertEquals(3, shape.getRows());
    }
}
