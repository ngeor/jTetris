package jtetris.common.graphics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link Color}.
 * Created by ngeor on 16/06/17.
 */
@SuppressWarnings("MagicNumber")
public class ColorTest {
    @Test
    public void create() {
        final int red = 1;
        final int green = 2;
        final int blue = 3;

        Color color = new Color(red, green, blue);
        assertEquals(red, color.getRed(), "red");
        assertEquals(green, color.getGreen(), "green");
        assertEquals(blue, color.getBlue(), "blue");
    }

    @Test
    public void testToString() {
        Color color = new Color(100, 150, 200);
        assertEquals("Color R: 100 G: 150 B: 200", color.toString());
    }

    @Test
    public void testEquals() {
        Color color1 = new Color(100, 200, 250);
        Color color2 = new Color(100, 200, 250);
        assertTrue(color1.equals(color2));
    }

    @Test
    public void darker() {
        Color color = new Color(128, 192, 255).darker();
        Color expected = new Color(128 * 0.7, 192 * 0.7, 255 * 0.7);
        assertEquals(expected, color);
    }
}
