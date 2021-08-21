package vector;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Vector2Test {

    @Test
    public void testSum() {
        Vector2 vector1 = new Vector2(4, 3);
        Vector2 vector2 = new Vector2(9, 2);

        vector1.sum(vector2);

        assertEquals(new Vector2(13, 5), vector1);
    }

    /*public void numMult(double scalar) {
        x = x * scalar;
        y = y + scalar;
    }*/

    @Test
    public void numMult() {
        double num = 3;
        Vector2 vector1 = new Vector2(4, 3);

        vector1.numMult(num);

        assertEquals(12, vector1.getX());
        assertEquals(9, vector1.getY());

    }
}
