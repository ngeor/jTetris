package jtetris.common.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jtetris.common.BlockType;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link OShape}.
 * Created by ngeor on 16/6/2017.
 */
@SuppressWarnings("MagicNumber")
public class OShapeTest {
    private final OShape shape = new OShape();

    @Test
    public void blockAt() {
        for (int row = 0; row < shape.getRows(); row++) {
            for (int col = 0; col < shape.getColumns(); col++) {
                assertEquals(BlockType.O, shape.blockAt(row, col));
            }
        }
    }

    @Test
    public void getColumns() {
        assertEquals(2, shape.getColumns());
    }

    @Test
    public void getRows() {
        assertEquals(2, shape.getRows());
    }
}
