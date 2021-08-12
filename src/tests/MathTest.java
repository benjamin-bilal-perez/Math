package tests;

import matrix.Matrix3x3;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class MathTest {

    @Test
    public void test() {
        Matrix3x3 matrix1 = new Matrix3x3(1,2,0,3,2,-1,5,1,-2);
        Matrix3x3 matrix2 = new Matrix3x3(3,4,0,1,0,-2,-1,2,1);
        double[][] result = {{5, 4, -4}, {12, 10, -5}, {18, 16, -4}};

        matrix1.multiply(matrix2);

        assertThat(matrix1.getElements(), CoreMatchers.is(result));
    }
}
