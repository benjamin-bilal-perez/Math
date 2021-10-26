package calculator;

import matrix.Matrix3x3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class consoleCatcherTest {
    @Test
    public void sum() {
        Matrix3x3 matrix1 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);
        Matrix3x3 matrix2 = new Matrix3x3(1,-1,2,-2,0,4,0,-2,7);

        matrix5.sum(matrix6);
        assertEquals(new Matrix3x3(1,13,-5,-1,13,-2,0,-1,12), matrix5);
    }
}