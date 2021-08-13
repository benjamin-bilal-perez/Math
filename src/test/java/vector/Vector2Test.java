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
    public void testScalarProduct() {
    }
}
