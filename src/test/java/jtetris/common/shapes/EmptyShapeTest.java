package jtetris.common.shapes;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link EmptyShape}.
 * Created by ngeor on 16/6/2017.
 */
public class EmptyShapeTest {
    private final EmptyShape shape = new EmptyShape();

    @Test
    public void blockAt() {
        assertThatThrownBy(() -> shape.blockAt(0, 0)).isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    public void getColumns() {
        assertEquals(0, shape.getColumns());
    }

    @Test
    public void getRows() {
        assertEquals(0, shape.getRows());
    }
}
