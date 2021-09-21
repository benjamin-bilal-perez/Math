package matrix;

import org.junit.Test;
import vector.Vector2;

import static org.junit.Assert.assertEquals;

public class Matrix3x3Test {

    @Test
    public void equals() {
        Matrix3x3 matrix1 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);
        Matrix3x3 matrix2 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);

        assertEquals(matrix1.equals(matrix2), true);
    }

    @Test
    public void sum() {
        Matrix3x3 matrix1 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);
        Matrix3x3 matrix2 = new Matrix3x3(1,-1,2,-2,0,4,0,-2,7);

        Matrix3x3 matrix3 = new Matrix3x3(5,-3,2,3,4,5,8,9,9);
        Matrix3x3 matrix4 = new Matrix3x3(2,3,-9,3,4,0,8,7,6);

        Matrix3x3 matrix5 = new Matrix3x3(8,5,-6,-7,5,7,-6,1,3);
        Matrix3x3 matrix6 = new Matrix3x3(-7,8,1,6,8,-9,6,-2,9);

        matrix1.sum(matrix2);
        assertEquals(new Matrix3x3(4,4,3,0,-1,13,1,-2,13), matrix1);

        matrix3.sum(matrix4);
        assertEquals(new Matrix3x3(7,0,-7,6,8,5,16,16,15), matrix3);

        matrix5.sum(matrix6);
        assertEquals(new Matrix3x3(1,13,-5,-1,13,-2,0,-1,12), matrix5);
    }

    @Test
    public void subtraction() {
        Matrix3x3 matrix1 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);
        Matrix3x3 matrix2 = new Matrix3x3(1,-1,2,-2,0,4,0,-2,7);

        Matrix3x3 matrix3 = new Matrix3x3(5,-3,2,3,4,5,8,9,9);
        Matrix3x3 matrix4 = new Matrix3x3(2,3,-9,3,4,0,8,7,6);

        Matrix3x3 matrix5 = new Matrix3x3(8,5,-6,-7,5,7,-6,1,3);
        Matrix3x3 matrix6 = new Matrix3x3(-7,8,1,6,8,-9,6,-2,9);

        matrix1.subtraction(matrix2);
        assertEquals(new Matrix3x3(2,6,-1,4,-1,5,1,2,-1), matrix1);

        matrix3.subtraction(matrix4);
        assertEquals(new Matrix3x3(3,-6,11,0,0,5,0,2,3), matrix3);

        matrix5.subtraction(matrix6);
        assertEquals(new Matrix3x3(15,-3,-7,-13,-3,16,-12,3,-6), matrix5);
    }

    @Test
    public void multiply() {
        Matrix3x3 matrix1 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);
        Matrix3x3 matrix2 = new Matrix3x3(1,-1,2,-2,0,4,0,-2,7);

        Matrix3x3 matrix3 = new Matrix3x3(5,-3,2,3,4,5,8,9,9);
        Matrix3x3 matrix4 = new Matrix3x3(2,3,-9,3,4,0,8,7,6);

        Matrix3x3 matrix5 = new Matrix3x3(8,5,-6,-7,5,7,-6,1,3);
        Matrix3x3 matrix6 = new Matrix3x3(-7,8,1,6,8,-9,6,-2,9);

        matrix1.multiply(matrix2);
        assertEquals(new Matrix3x3(-7,-5,33,4,-20,63,1,-13,44), matrix1);

        matrix3.multiply(matrix4);
        assertEquals(new Matrix3x3(17,17,-33,58,60,3,115,123,-18), matrix3);

        matrix5.multiply(matrix6);
        assertEquals(new Matrix3x3(-62,116,-91,121,-30,11,66,-46,12), matrix5);
    }

    @Test
    public void scalarMult() {
        Matrix3x3 matrix1 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);
        Matrix3x3 matrix2 = new Matrix3x3(1,-1,2,-2,0,4,0,-2,7);
        Matrix3x3 matrix3 = new Matrix3x3(5,-3,2,3,4,5,8,9,9);

        matrix1.scalarMult(1);
        assertEquals(new Matrix3x3(3,5,1,2,-1,9,1,0,6), matrix1);

        matrix2.scalarMult(6);
        assertEquals(new Matrix3x3(6,-6,12,-12,0,24,0,-12,42), matrix2);

        matrix3.scalarMult(-7);
        assertEquals(new Matrix3x3(-35,21,-14,-21,-28,-35,-56,-63,-63), matrix3);
    }

    @Test
    public void division() {
        Matrix3x3 matrix1 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);
        Matrix3x3 matrix2 = new Matrix3x3(1,-1,2,-2,0,4,0,-2,7);

        Matrix3x3 matrix3 = new Matrix3x3(5,-3,2,3,4,5,8,9,9);
        Matrix3x3 matrix4 = new Matrix3x3(2,3,-9,3,4,0,8,7,6);

        Matrix3x3 matrix5 = new Matrix3x3(4,5,7,2,1,0,1,2,3);
        Matrix3x3 matrix6 = new Matrix3x3(1,1,1,2,3,4,3,1,1);

        matrix1.division(matrix2);
        assertEquals(new Matrix3x3(49,23,-27,19,8.5,-9,16,7.5,-8), matrix1);

        matrix3.division(matrix4);
        assertEquals(new Matrix3x3(1.6344086021505375,-6.849462365591398,2.78494623655914,
                -0.5913978494623656,1.5376344086021505,-0.053763440860215284,
                -0.7419354838709677,2.129032258064516,0.38709677419354793), matrix3);

        matrix5.division(matrix6);
        assertEquals(new Matrix3x3(-1.5,2,0.5,4,-1,0,-1,1,0), matrix5);
    }


}
