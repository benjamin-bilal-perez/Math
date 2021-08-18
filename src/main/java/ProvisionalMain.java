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


        Matrix3x3 matrix1 = new Matrix3x3(3,5,1,2,-1,9,1,0,6);
        // Matrix3x3 matrix2 = new Matrix3x3(8,7,5,0,4,2,-3,5,1);
        Matrix3x3 matrix2 = new Matrix3x3(8,3,-4,14,7,-8,4,2,-2);

        // boolean equals = matrix1.equals(matrix2);

        // System.out.println(equals);

        matrix1.division(matrix2);

        System.out.println("Final result:");

        for (int i = 0; i < matrix1.getElements().length; i++) {
            for (int j = 0; j < matrix1.getElements()[i].length; j++) {
                System.out.println(matrix1.get(i,j));
            }
            System.out.println("----------------");
        }

        // int total = 0;
        /*Double newElements[] = new Double[] {0.0, 3.0, 1.0};

        for (int i = 0; i < newElements.length; i++) {
            System.out.println(newElements[i]);
            // total++;
        }*/


        // System.out.println("Total: " + total);


    }
}
