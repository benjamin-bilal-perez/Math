package matrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Matrix4x4Test {

    @Test
    public void equals() {
        Matrix4x4 matrix1 = new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,9,7,3,6,8,1);
        Matrix4x4 matrix2 = new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,9,7,3,6,8,1);

        assertEquals(matrix1.equals(matrix2), true);
    }

    @Test
    public void sum() {
        Matrix4x4 matrix1 = new Matrix4x4(3,5,1,2,-1,9,1,0,6,7,6,5,3,5,9,5);
        Matrix4x4 matrix2 = new Matrix4x4(1,-1,2,-2,0,4,0,-2,7,4,7,5,6,8,9,3);

        Matrix4x4 matrix3 = new Matrix4x4(5,-3,2,3,4,5,8,9,9,6,9,5,4,5,6,7);
        Matrix4x4 matrix4 = new Matrix4x4(2,3,-9,3,4,0,8,7,6,4,7,6,3,4,8,2);

        Matrix4x4 matrix5 = new Matrix4x4(8,5,-6,-7,5,7,-6,1,3,7,5,3,6,9,5,8);
        Matrix4x4 matrix6 = new Matrix4x4(-7,8,1,6,8,-9,6,-2,9,1,5,6,5,2,3,3);

        matrix1.sum(matrix2);
        assertEquals(new Matrix4x4(4,4,3,0,-1,13,1,-2,13,11,13,10,9,13,18,8), matrix1);

        matrix3.sum(matrix4);
        assertEquals(new Matrix4x4(7,0,-7,6,8,5,16,16,15,10,16,11,7,9,14,9), matrix3);

        matrix5.sum(matrix6);
        assertEquals(new Matrix4x4(1,13,-5,-1,13,-2,0,-1,12,8,10,9,11,11,8,11), matrix5);
    }

    @Test
    public void subtraction() {
        Matrix4x4 matrix1 = new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,8,7,4,6,9,7);
        Matrix4x4 matrix2 = new Matrix4x4(1,-1,2,-2,0,4,0,-2,7,4,5,8,7,4,5,6);

        Matrix4x4 matrix3 = new Matrix4x4(5,-3,2,3,4,5,8,9,9,1,4,5,6,8,9,7);
        Matrix4x4 matrix4 = new Matrix4x4(2,3,-9,3,4,0,8,7,6,5,4,8,9,6,5,5);

        Matrix4x4 matrix5 = new Matrix4x4(8,5,-6,-7,5,7,-6,1,3,1,5,4,8,9,7,8);
        Matrix4x4 matrix6 = new Matrix4x4(-7,8,1,6,8,-9,6,-2,9,4,5,6,9,8,5,7);

        matrix1.subtraction(matrix2);
        assertEquals(new Matrix4x4(2,6,-1,4,-1,5,1,2,-1,1,3,-1,-3,2,4,1), matrix1);

        matrix3.subtraction(matrix4);
        assertEquals(new Matrix4x4(3,-6,11,0,0,5,0,2,3,-4,0,-3,-3,2,4,2), matrix3);

        matrix5.subtraction(matrix6);
        assertEquals(new Matrix4x4(15,-3,-7,-13,-3,16,-12,3,-6,-3,0,-2,-1,1,2,1), matrix5);
    }

    @Test
    public void multiply() {
        Matrix4x4 matrix1 = new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,8,7,4,6,9,7);
        Matrix4x4 matrix2 = new Matrix4x4(1,-1,2,-2,0,4,0,-2,7,4,5,8,7,4,5,6);

        Matrix4x4 matrix3 = new Matrix4x4(5,-3,2,3,4,5,8,9,9,1,4,5,6,8,9,7);
        Matrix4x4 matrix4 = new Matrix4x4(2,3,-9,3,4,0,8,7,6,5,4,8,9,6,5,5);

        Matrix4x4 matrix5 = new Matrix4x4(8,5,-6,-7,5,7,-6,1,3,1,5,4,8,9,7,8);
        Matrix4x4 matrix6 = new Matrix4x4(-7,8,1,6,8,-9,6,-2,9,4,5,6,9,8,5,7);

        matrix1.multiply(matrix2);
        assertEquals(new Matrix4x4(24,29,21,4,6,41,3,-8,111,74,87,84,116,84,88,94), matrix1);

        matrix3.multiply(matrix4);
        assertEquals(new Matrix4x4(37,43,-46,25,157,106,81,156,91,77,-32,91,161,105,81,181), matrix3);

        matrix5.multiply(matrix6);
        assertEquals(new Matrix4x4(-133,-61,-27,-47,-24,-39,22,-13,68,67,54,74,151,75,137,128), matrix5);
    }

    @Test
    public void scalarMult() {
        Matrix4x4 matrix1 = new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,8,7,4,6,9,7);
        Matrix4x4 matrix2 = new Matrix4x4(1,-1,2,-2,0,4,0,-2,7,4,5,8,7,4,5,6);
        Matrix4x4 matrix3 = new Matrix4x4(5,-3,2,3,4,5,8,9,9,1,4,5,6,8,9,7);

        matrix1.scalarMult(1);
        assertEquals(new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,8,7,4,6,9,7), matrix1);

        matrix2.scalarMult(6);
        assertEquals(new Matrix4x4(6,-6,12,-12,0,24,0,-12,42,24,30,48,42,24,30,36), matrix2);

        matrix3.scalarMult(-7);
        assertEquals(new Matrix4x4(-35,21,-14,-21,-28,-35,-56,-63,-63,-7,-28,-35,-42,-56,-63,-49), matrix3);
    }

    @Test
    public void division() {
        Matrix4x4 matrix1 = new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,8,7,4,6,9,7);
        Matrix4x4 matrix2 = new Matrix4x4(1,-1,2,-2,0,4,0,-2,7,4,5,8,7,4,5,6);

        Matrix4x4 matrix3 = new Matrix4x4(5,-3,2,3,4,5,8,9,9,1,4,5,6,8,9,7);
        Matrix4x4 matrix4 = new Matrix4x4(2,3,-9,3,4,0,8,7,6,5,4,8,9,6,5,5);

        Matrix4x4 matrix5 = new Matrix4x4(8,5,-6,-7,5,7,-6,1,3,1,5,4,8,9,7,8);
        Matrix4x4 matrix6 = new Matrix4x4(-7,8,1,6,8,-9,6,-2,9,4,5,6,9,8,5,7);

        matrix1.division(matrix2);
        assertEquals(new Matrix4x4(49,23,-27,19,8.5,-9,16,7.5,1,1,1,1,1,1,1,1), matrix1);

        /*matrix3.division(matrix4);
        assertEquals(new Matrix3x3(1.6344086021505375,-6.849462365591398,2.78494623655914,
                -0.5913978494623656,1.5376344086021505,-0.053763440860215284,
                -0.7419354838709677,2.129032258064516,0.38709677419354793), matrix3);

        matrix5.division(matrix6);
        assertEquals(new Matrix3x3(-1.5,2,0.5,4,-1,0,-1,1,0), matrix5);*/
    }

    /*@Test
    public void scalarDivision() {
        Matrix3x3 matrix1 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);
        Matrix3x3 matrix2 = new Matrix3x3(1,-1,2,-2,0,4,0,-2,7);
        Matrix3x3 matrix3 = new Matrix3x3(12,20,-8,19,-36,40,13,27,-80);

        matrix1.scalarDivision(1);
        assertEquals(new Matrix3x3(3,5,1,2,-1,9,1,0,6), matrix1);

        matrix2.scalarDivision(6);
        assertEquals(new Matrix3x3(0.16666666666666666,-0.16666666666666666,0.3333333333333333,
                -0.3333333333333333,0,0.6666666666666666,
                0,-0.3333333333333333,1.1666666666666667), matrix2);

        matrix3.scalarDivision(-4);
        assertEquals(new Matrix3x3(-3,-5,2,-4.75,9,-10,-3.25,-6.75,20), matrix3);
    }

    @Test
    public void equalsTest() {
        Matrix3x3 matrix1 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);

        assertEquals(false, matrix1.equals(new Matrix3x3(-3,5,4,3,-1,9,1,0,6)));
        assertEquals(false, matrix1.equals(new Matrix3x3(-3,-5,-1,-2,1,-9,-1,-0,-6)));
        assertEquals(false, matrix1.equals(new Matrix3x3(3,5,1,2,-1,9,1,1,6)));
        assertEquals(true, matrix1.equals(new Matrix3x3(3,5,1,2,-1,9,1,0,6)));
    }

    @Test
    public void toStringTest() {
        Matrix3x3 matrix1 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);
        Matrix3x3 matrix2 = new Matrix3x3(1,-1,2,-2,0,4,0,-2,7);
        Matrix3x3 matrix3 = new Matrix3x3(12,20,-8,19,-36,40,13,27,-80);

        assertEquals("{{3.0,5.0,1.0}, {2.0,-1.0,9.0}, {1.0,0.0,6.0}}", matrix1.toString());

        assertEquals("{{1.0,-1.0,2.0}, {-2.0,0.0,4.0}, {0.0,-2.0,7.0}}", matrix2.toString());

        assertEquals("{{12.0,20.0,-8.0}, {19.0,-36.0,40.0}, {13.0,27.0,-80.0}}", matrix3.toString());
    }

    @Test
    public void get() {
        Matrix3x3 matrix1 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);

        assertEquals(3, matrix1.get(0,0), 0.0);
        assertEquals(9, matrix1.get(1,2), 0.0);

        Throwable exception = assertThrows(
                IndexOutOfBoundsException.class, () -> {
                    matrix1.get(1,3);
                });

        assertEquals("Invalid range: x: 1, y: 3", exception.getMessage());
    }*/

}
