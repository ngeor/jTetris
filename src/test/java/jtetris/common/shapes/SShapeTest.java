package jtetris.common.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jtetris.common.BlockType;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link SShape}.
 * Created by ngeor on 16/6/2017.
 */
@SuppressWarnings("MagicNumber")
public class SShapeTest {
    private final SShape shape = new SShape();

    @Test
    public void blockAt() {
        char[][] expected = new char[][] {
            {' ', 'S', 'S'},
            {'S', 'S', ' '}
        };

        for (int row = 0; row < shape.getRows(); row++) {
            for (int col = 0; col < shape.getColumns(); col++) {
                BlockType expectedBlockType = expected[row][col] == ' ' ? BlockType.Empty : BlockType.S;
                assertEquals(expectedBlockType, shape.blockAt(row, col));
            }
        }
    }

    @Test
    public void getColumns() {
        assertEquals(3, shape.getColumns());
    }

    @Test
    public void getRows() {
        assertEquals(2, shape.getRows());
    }
}
