package vector;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Vector3Test {

    @Test
    public void sum() {
        Vector3 vector1 = new Vector3(4, 3, 7);
        Vector3 vector2 = new Vector3(9, 2, 6);

        vector1.sum(vector2);

        assertEquals(new Vector3(13, 5, 13), vector1);
    }

    @Test
    public void numMult() {
        double num = 3;
        Vector3 vector1 = new Vector3(4, 3, 7);

        vector1.numMult(num);

        assertEquals(12, vector1.getX(), 0);
        assertEquals(9, vector1.getY(), 0);
        assertEquals(21, vector1.getZ(), 0);
    }

    @Test
    public void deny() {
        Vector3 vector1 = new Vector3(4, 3, 7);

        vector1.deny();

        assertEquals(-4, vector1.getX(), 0);
        assertEquals(-3, vector1.getY(), 0);
        assertEquals(-7, vector1.getZ(), 0);
    }

    @Test
    public void scalarProduct() {
        Vector3 vector1 = new Vector3(4, 3, 7);
        Vector3 vector2 = new Vector3(9, 2, 6);

        vector1.scalarProduct(vector2);

        assertEquals(36, vector1.getX(), 0);
        assertEquals(6, vector1.getY(), 0);
        assertEquals(42, vector1.getZ(), 0);
    }

    @Test
    public void equals() {
        Vector3 vector1 = new Vector3(4, 3, 7);
        Vector3 vector2 = new Vector3(4, 3, 7);

        assertEquals(true, vector1.equals(vector2));
    }

    // Correct?
    @Test
    public void toStringTest() {
        Vector3 vector1 = new Vector3(4, 3, 7);

        assertEquals("x: 4.0, y: 3.0, z: 7.0", vector1.toString());
    }

}
