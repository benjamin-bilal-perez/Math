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

    @Test
    public void numMult() {
        double num = 3;
        Vector2 vector1 = new Vector2(4, 3);

        vector1.numMult(num);

        assertEquals(12, vector1.getX(), 0);
        assertEquals(9, vector1.getY(), 0);
    }

    @Test
    public void deny() {
        Vector2 vector1 = new Vector2(4, 3);

        vector1.deny();

        assertEquals(-4, vector1.getX(), 0);
        assertEquals(-3, vector1.getY(), 0);
    }

    @Test
    public void scalarProduct() {
        Vector2 vector1 = new Vector2(4, 3);
        Vector2 vector2 = new Vector2(9, 2);

        vector1.scalarProduct(vector2);

        assertEquals(36, vector1.getX(), 0);
        assertEquals(6, vector1.getY(), 0);
    }

    @Test
    public void equals() {
        Vector2 vector1 = new Vector2(4, 3);
        Vector2 vector2 = new Vector2(4, 3);

        assertEquals(vector1.equals(vector2), true);
    }

    // How to test the toString method?
}
