import matrix.Matrix3x3;
import matrix.Matrix4x4;
import vector.Vector2;

public class ProvisionalMain {
    public static void main(String[] args) {
        /*Vector2 vector1 = new Vector2(3, 5);
        Vector2 vector2 = new Vector2(4, 6);

        // Vector module
        System.out.println(vector1.module());

        // Vectors sum
        Vector2 vectorSum = new Vector2();
        vectorSum = vector1.sum(vector2);

        System.out.println("Vectors sum");
        System.out.println(vectorSum.getX());
        System.out.println(vectorSum.getY());
        System.out.println("---------");

        // Number multiplication
        Vector2 vectorScMu = new Vector2();
        vectorScMu = vector2.numMult(2);

        System.out.println("Scalar multiplication");
        System.out.println(vectorScMu.getX());
        System.out.println(vectorScMu.getY());
        System.out.println("---------");

        // Deny a vector
        Vector2 denVector = new Vector2();
        denVector = vector2.deny();

        System.out.println("Deny a vector");
        System.out.println(denVector.getX());
        System.out.println(denVector.getY());
        System.out.println("---------");

        // Scalar product
        Vector2 scalarProductVector = new Vector2();
        scalarProductVector = vector1.scalarProduct(vector2);

        System.out.println("Scalar product");
        System.out.println(scalarProductVector.getX());
        System.out.println(scalarProductVector.getY());
        System.out.println("---------");

        // Equal vector
        System.out.println("Equal vector");
        vector1.equals(vector2);
        System.out.println("---------");*/


        Matrix3x3 matrix1 = new Matrix3x3(1,-1,2,-2,0,4,0,-2,7);
        Matrix3x3 matrix2 = new Matrix3x3(4,5,9,3,6,2,3,5,7);

        // boolean equals = matrix1.equals(matrix2);

        // System.out.println(equals);

        matrix1.division(matrix2);









    }
}
