package matrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Matrix4x4Test {

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
        assertEquals(new Matrix4x4(-0.888888888888889,0.4722222222222223,-1.083333333333333,1.6388888888888893,
                1.3333333333333335,2.916666666666667,5.25,-5.583333333333333,
                2.888888888888889,1.5277777777777781,6.583333333333334,-6.1388888888888875,
                4.777777777777778,2.8055555555555554,11.416666666666668,-11.527777777777779), matrix1);

        matrix3.division(matrix4);
        assertEquals(new Matrix4x4(1.1135175504107542,2.109783420463032,-2.563106796116505,1.0791635548917102,
                -0.6975354742345035,-0.4772218073188944,2.2233009708737863,-0.6706497386109037,
                0.9148618371919345,1.667662434652726,-2.0776699029126213,1.4406273338312174,
                -1.1090365944734877,-1.2501867064973857,2.5145631067961167,-0.20761762509335324), matrix3);

        matrix5.division(matrix6);
        assertEquals(new Matrix4x4(-1.9389830508474577,-0.6203389830508477,-3.8677966101694907,3.8,
                -1.290677966101695,-1.5864406779661018,1.161864406779661,-0.20000000000000007,
                0.5254237288135595,0.4915254237288137,0.3050847457627115,0.0,
                0.38898305084745766,0.4203389830508475,-0.7822033898305092,1.6000000000000005), matrix5);
    }

    @Test
    public void scalarDivision() {
        Matrix4x4 matrix1 = new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,8,7,4,6,9,7);
        Matrix4x4 matrix2 = new Matrix4x4(1,-1,2,-2,0,4,0,-2,7,4,5,8,7,4,5,6);
        Matrix4x4 matrix3 = new Matrix4x4(5,-3,2,3,4,5,8,9,9,1,4,5,6,8,9,7);

        matrix1.scalarDivision(1);
        assertEquals(new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,8,7,4,6,9,7), matrix1);

        matrix2.scalarDivision(6);
        assertEquals(new Matrix4x4(0.16666666666666666,-0.16666666666666666,0.3333333333333333,-0.3333333333333333,
                0,0.6666666666666666,0,-0.3333333333333333,
                1.1666666666666667,0.6666666666666666,0.8333333333333334,1.3333333333333333,
                1.1666666666666667,0.6666666666666666,0.8333333333333334,1), matrix2);

        matrix3.scalarDivision(-4);
        assertEquals(new Matrix4x4(-1.25,0.75,-0.5,-0.75,
                -1.0,-1.25,-2.0,-2.25,
                -2.25,-0.25,-1.0,-1.25,
                -1.5,-2.0,-2.25,-1.75), matrix3);
    }

    @Test
    public void equals() {
        Matrix4x4 matrix1 = new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,8,4,6,9,7,8);

        assertEquals(false, matrix1.equals(new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,8,4,6,9,7,1)));
        assertEquals(false, matrix1.equals(new Matrix4x4(3,5,1,2,-1,9,1,0,1,5,8,4,6,9,7,8)));
        assertEquals(false, matrix1.equals(new Matrix4x4(3,5,1,-2,-1,9,1,0,6,5,8,4,6,9,7,8)));
        assertEquals(true, matrix1.equals(new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,8,4,6,9,7,8)));
    }

    @Test
    public void toStringTest() {
        Matrix4x4 matrix1 = new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,8,7,4,6,9,7);
        Matrix4x4 matrix2 = new Matrix4x4(1,-1,2,-2,0,4,0,-2,7,4,5,8,7,4,5,6);
        Matrix4x4 matrix3 = new Matrix4x4(5,-3,2,3,4,5,8,9,9,1,4,5,6,8,9,7);

        assertEquals("{{3.0,5.0,1.0,2.0}, {-1.0,9.0,1.0,0.0}, {6.0,5.0,8.0,7.0}, {4.0,6.0,9.0,7.0}}",
                matrix1.toString());

        assertEquals("{{1.0,-1.0,2.0,-2.0}, {0.0,4.0,0.0,-2.0}, {7.0,4.0,5.0,8.0}, {7.0,4.0,5.0,6.0}}",
                matrix2.toString());

        assertEquals("{{5.0,-3.0,2.0,3.0}, {4.0,5.0,8.0,9.0}, {9.0,1.0,4.0,5.0}, {6.0,8.0,9.0,7.0}}",
                matrix3.toString());
    }

    @Test
    public void get() {
        Matrix4x4 matrix1 = new Matrix4x4(3,5,1,2,-1,9,1,0,6,5,8,7,4,6,9,7);

        assertEquals(3, matrix1.get(0,0), 0.0);
        assertEquals(0, matrix1.get(1,3), 0.0);

        Throwable exception = assertThrows(
                IndexOutOfBoundsException.class, () -> {
                    matrix1.get(1,4);
                });

        assertEquals("Invalid range: x: 1, y: 4", exception.getMessage());
    }
}
