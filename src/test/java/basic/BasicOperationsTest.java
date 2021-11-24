package basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicOperationsTest {
    @Test
    public void sum() {
        BasicOperations operation1 = new BasicOperations(7.0, 6.0);
        BasicOperations operation2 = new BasicOperations(24.0, 53.0);
        BasicOperations operation3 = new BasicOperations(-9.0, 18.0);
        BasicOperations operation4 = new BasicOperations(-1.0, -24.0);

        operation1.sum();
        operation2.sum();
        operation3.sum();
        operation4.sum();

        assertEquals(13, operation1.getResult(), 0);
        assertEquals(77, operation2.getResult(), 0);
        assertEquals(9, operation3.getResult(), 0);
        assertEquals(-25, operation4.getResult(), 0);
    }

    @Test
    public void subtraction() {
        BasicOperations operation1 = new BasicOperations(7.0, 6.0);
        BasicOperations operation2 = new BasicOperations(24.0, 53.0);
        BasicOperations operation3 = new BasicOperations(-9.0, 18.0);
        BasicOperations operation4 = new BasicOperations(-1.0, -24.0);

        operation1.subtraction();
        operation2.subtraction();
        operation3.subtraction();
        operation4.subtraction();

        assertEquals(1, operation1.getResult(), 0);
        assertEquals(-29, operation2.getResult(), 0);
        assertEquals(-27, operation3.getResult(), 0);
        assertEquals(23, operation4.getResult(), 0);
    }

    @Test
    public void multiplication() {
        BasicOperations operation1 = new BasicOperations(7.0, 6.0);
        BasicOperations operation2 = new BasicOperations(24.0, 53.0);
        BasicOperations operation3 = new BasicOperations(-9.0, 18.0);
        BasicOperations operation4 = new BasicOperations(-1.0, -24.0);

        operation1.multiplication();
        operation2.multiplication();
        operation3.multiplication();
        operation4.multiplication();

        assertEquals(42, operation1.getResult(), 0);
        assertEquals(1272, operation2.getResult(), 0);
        assertEquals(-162, operation3.getResult(), 0);
        assertEquals(24, operation4.getResult(), 0);
    }

    @Test
    public void division() {
        BasicOperations operation1 = new BasicOperations(6.0, 2.0);
        BasicOperations operation2 = new BasicOperations(7.0, 6.0);
        BasicOperations operation3 = new BasicOperations(24.0, 53.0);
        BasicOperations operation4 = new BasicOperations(18.0, -9.0);
        BasicOperations operation5 = new BasicOperations(-24.0, -1.0);

        operation1.division();
        operation2.division();
        operation3.division();
        operation4.division();
        operation5.division();

        assertEquals(3, operation1.getResult(), 0);
        assertEquals(1.1666666666666667, operation2.getResult(), 0);
        assertEquals(0.4528301886792453, operation3.getResult(), 0);
        assertEquals(-2, operation4.getResult(), 0);
        assertEquals(24, operation5.getResult(), 0);
    }
}
