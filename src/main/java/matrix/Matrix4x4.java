package matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix4x4 {
    private double[][] elements;

    public Matrix4x4() {
        elements = new double[4][4];
    }

    public Matrix4x4(double pos0, double pos1, double pos2, double pos3, double pos4,
                     double pos5, double pos6, double pos7, double pos8, double pos9,
                     double pos10, double pos11, double pos12, double pos13, double pos14,
                     double pos15) {
        elements = new double[][]{{pos0, pos1, pos2, pos3},{pos4, pos5, pos6, pos7},
                {pos8, pos9, pos10, pos11}, {pos12, pos13, pos14, pos15}};
    }

    public void sum(Matrix4x4 matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                elements[i][j] += matrix.get(i, j);
            }
        }
    }

    public void subtraction(Matrix4x4 matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                elements[i][j] -= matrix.get(i, j);
            }
        }
    }

    public void multiply(Matrix4x4 matrix) {
        double[][] result = {{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0}};

        result[0][0] =
                (elements[0][0]*matrix.elements[0][0])+
                (elements[0][1]*matrix.elements[1][0])+
                (elements[0][2]*matrix.elements[2][0])+
                (elements[0][3]*matrix.elements[3][0]);
        result[0][1] =
                (elements[0][0]*matrix.elements[0][1]) +
                (elements[0][1]*matrix.elements[1][1]) +
                (elements[0][2]*matrix.elements[2][1]) +
                (elements[0][3]*matrix.elements[3][1]);
        result[0][2] =
                (elements[0][0]*matrix.elements[0][2]) +
                (elements[0][1]*matrix.elements[1][2]) +
                (elements[0][2]*matrix.elements[2][2]) +
                (elements[0][3]*matrix.elements[3][2]);
        result[0][3] =
                (elements[0][0]*matrix.elements[0][3]) +
                (elements[0][1]*matrix.elements[1][3]) +
                (elements[0][2]*matrix.elements[2][3]) +
                (elements[0][3]*matrix.elements[3][3]);
        result[1][0] =
                (elements[1][0]*matrix.elements[0][0]) +
                (elements[1][1]*matrix.elements[1][0]) +
                (elements[1][2]*matrix.elements[2][0]) +
                (elements[1][3]*matrix.elements[3][0]);
        result[1][1] =
                (elements[1][0]*matrix.elements[0][1]) +
                (elements[1][1]*matrix.elements[1][1]) +
                (elements[1][2]*matrix.elements[2][1]) +
                (elements[1][3]*matrix.elements[3][1]);
        result[1][2] =
                (elements[1][0]*matrix.elements[0][2]) +
                (elements[1][1]*matrix.elements[1][2]) +
                (elements[1][2]*matrix.elements[2][2]) +
                (elements[1][3]*matrix.elements[3][2]);
        result[1][3] =
                (elements[1][0]*matrix.elements[0][3]) +
                (elements[1][1]*matrix.elements[1][3]) +
                (elements[1][2]*matrix.elements[2][3]) +
                (elements[1][3]*matrix.elements[3][3]);
        result[2][0] =
                (elements[2][0]*matrix.elements[0][0]) +
                (elements[2][1]*matrix.elements[1][0]) +
                (elements[2][2]*matrix.elements[2][0]) +
                (elements[2][3]*matrix.elements[3][0]);
        result[2][1] =
                (elements[2][0]*matrix.elements[0][1]) +
                (elements[2][1]*matrix.elements[1][1]) +
                (elements[2][2]*matrix.elements[2][1]) +
                (elements[2][3]*matrix.elements[3][1]);
        result[2][2] =
                (elements[2][0]*matrix.elements[0][2]) +
                (elements[2][1]*matrix.elements[1][2]) +
                (elements[2][2]*matrix.elements[2][2]) +
                (elements[2][3]*matrix.elements[3][2]);
        result[2][3] =
                (elements[2][0]*matrix.elements[0][3]) +
                (elements[2][1]*matrix.elements[1][3]) +
                (elements[2][2]*matrix.elements[2][3]) +
                (elements[2][3]*matrix.elements[3][3]);
        result[3][0] =
                (elements[3][0]*matrix.elements[0][0]) +
                (elements[3][1]*matrix.elements[1][0]) +
                (elements[3][2]*matrix.elements[2][0]) +
                (elements[3][3]*matrix.elements[3][0]);
        result[3][1] =
                (elements[3][0]*matrix.elements[0][1]) +
                (elements[3][1]*matrix.elements[1][1]) +
                (elements[3][2]*matrix.elements[2][1]) +
                (elements[3][3]*matrix.elements[3][1]);
        result[3][2] =
                (elements[3][0]*matrix.elements[0][2]) +
                (elements[3][1]*matrix.elements[1][2]) +
                (elements[3][2]*matrix.elements[2][2]) +
                (elements[3][3]*matrix.elements[3][2]);
        result[3][3] =
                (elements[3][0]*matrix.elements[0][3]) +
                (elements[3][1]*matrix.elements[1][3]) +
                (elements[3][2]*matrix.elements[2][3]) +
                (elements[3][3]*matrix.elements[3][3]);

        elements = result;
    }

    public void scalarMult(double scalar) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                elements[i][j] *= scalar;
            }
        }
    }

    private double determinant3x3(Matrix3x3 matrix) {
        return ((matrix.get(0,0)*matrix.get(1,1)*matrix.get(2,2))+
                (matrix.get(2,0)*matrix.get(0,1)*matrix.get(1,2))+
                (matrix.get(1,0)*matrix.get(0,2)*matrix.get(2,1))-
                (matrix.get(0,2)*matrix.get(1,1)*matrix.get(2,0))-
                (matrix.get(0,0)*matrix.get(1,2)*matrix.get(2,1))-
                (matrix.get(1,0)*matrix.get(0,1)*matrix.get(2,2)));
    }

    private double determinant4x4(Matrix4x4 matrix) {
        return (matrix.get(0,0)*determinant3x3(new Matrix3x3(matrix.get(1,1),matrix.get(1,2),matrix.get(1,3),
                matrix.get(2,1),matrix.get(2,2),matrix.get(2,3),
                matrix.get(3,1),matrix.get(3,2),matrix.get(3,3)))
                -
                matrix.get(0,1)*determinant3x3(new Matrix3x3(matrix.get(1,0),matrix.get(1,2),matrix.get(1,3),
                        matrix.get(2,0),matrix.get(2,2),matrix.get(2,3),
                        matrix.get(3,0),matrix.get(3,2),matrix.get(3,3)))
                +
                matrix.get(0,2)*determinant3x3(new Matrix3x3(matrix.get(1,0),matrix.get(1,1),matrix.get(1,3),
                        matrix.get(2,0),matrix.get(2,1),matrix.get(2,3),
                        matrix.get(3,0),matrix.get(3,1),matrix.get(3,3)))
                -
                matrix.get(0,3)*determinant3x3(new Matrix3x3(matrix.get(1,0),matrix.get(1,1),matrix.get(1,2),
                        matrix.get(2,0),matrix.get(2,1),matrix.get(2,2),
                        matrix.get(3,0),matrix.get(3,1),matrix.get(3,2)))
        );
    }

    private Double[][] adjunctMatrix(Matrix4x4 matrix) {
        Double adjunctMatrix[][] = new Double[4][4];
        // double[] newElements = {};
        Double newElements[] = new Double[0];
        double[][] elementsDeter;

        // Adjunct matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int x = 0; x < 4; x++) {
                    for (int y = 0; y < 4; y++) {
                        if (x == i) {
                            break;
                        } else if (y == j) {
                            continue;
                        }

                        ArrayList<Double> arrayList = new ArrayList<Double>(Arrays.asList(newElements));
                        arrayList.add(matrix.elements[x][y]);
                        newElements = arrayList.toArray(newElements);
                    }
                }
                elementsDeter = new double[][]{{newElements[0], newElements[1], newElements[2]},
                        {newElements[3], newElements[4], newElements[5]},
                        {newElements[6], newElements[7], newElements[8]}};
                adjunctMatrix[i][j] = Math.pow(-1, i+j)*determinant3x3(new Matrix3x3(
                        elementsDeter[0][0],elementsDeter[0][1],elementsDeter[0][2],
                        elementsDeter[1][0],elementsDeter[1][1],elementsDeter[1][2],
                        elementsDeter[2][0],elementsDeter[2][1],elementsDeter[2][2]));
                newElements = new Double[0];
            }
        }

        return adjunctMatrix;
    }

    private Matrix4x4 transpose(double[][] matrix) {
        Matrix4x4 transposeM = new Matrix4x4();

        transposeM.set(0,0,matrix[0][0]);
        transposeM.set(0,1,matrix[1][0]);
        transposeM.set(0,2,matrix[2][0]);
        transposeM.set(0,3,matrix[3][0]);

        transposeM.set(1,0,matrix[0][1]);
        transposeM.set(1,1,matrix[1][1]);
        transposeM.set(1,2,matrix[2][1]);
        transposeM.set(1,3,matrix[3][1]);

        transposeM.set(2,0,matrix[0][2]);
        transposeM.set(2,1,matrix[1][2]);
        transposeM.set(2,2,matrix[2][2]);
        transposeM.set(2,3,matrix[3][2]);

        transposeM.set(3,0,matrix[0][3]);
        transposeM.set(3,1,matrix[1][3]);
        transposeM.set(3,2,matrix[2][3]);
        transposeM.set(3,3,matrix[3][3]);

        return transposeM;
    }

    public void division(Matrix4x4 matrix) {
        // Determinant different to zero?
        double deter = determinant4x4(matrix);

        // System.out.println("Determinant: " + deter);

        if (deter == 0) {
            throw new UnsupportedOperationException("Impossible operation, no invertible matrix");
        }

        // Now I will transpose it
        Matrix4x4 transposeM = new Matrix4x4();

        transposeM = transpose(matrix.elements);

        System.out.println("Transpose: " + transposeM);

        Double adjunctMatrix[][] = new Double[4][4];
        adjunctMatrix = adjunctMatrix(transposeM);

        System.out.println("adjunct: ");
        for (int i = 0; i < adjunctMatrix.length; i++) {
            for (int j = 0; j < adjunctMatrix[i].length; j++) {
                System.out.print(adjunctMatrix[i][j]+", ");
            }
        }

        // Other idea to avoid the code replication?
        // Scalar division, divided by the determinant of the matrix
        for (int i = 0; i < adjunctMatrix.length; i++) {
            for (int j = 0; j < adjunctMatrix[i].length; j++) {
                adjunctMatrix[i][j] /= deter;
            }
        }

        Matrix4x4 adjunct = new Matrix4x4(adjunctMatrix[0][0],adjunctMatrix[0][1],adjunctMatrix[0][2],adjunctMatrix[0][3],
                adjunctMatrix[1][0],adjunctMatrix[1][1],adjunctMatrix[1][2],adjunctMatrix[1][3],
                adjunctMatrix[2][0],adjunctMatrix[2][1],adjunctMatrix[2][2],adjunctMatrix[2][3],
                adjunctMatrix[3][0],adjunctMatrix[3][1],adjunctMatrix[3][2],adjunctMatrix[3][3]);

        multiply(adjunct);
    }

    /*private double determinant(double[][] matrix) { // 2x2
        return (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);
    }*/

    public void scalarDivision(double scalar) {
        for (int i = 0; i < 4; i++) { // rows
            for (int j = 0; j < 4; j++) { // columns
                elements[i][j] /= scalar;
            }
        }
    }

    public boolean equals(Object object) {
        Matrix4x4 matrix = (Matrix4x4) object;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (elements[i][j] != matrix.get(i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public String toString() {
        String matrixStr = "{";

        for (int i = 0; i < 4; i++) {
            matrixStr += "{";
            for (int j = 0; j < 4; j++) {
                matrixStr += elements[i][j] + ",";
            }
            // matrixStr = matrixStr.split("");

            matrixStr = matrixStr.substring(0, matrixStr.length()-1)+"}, ";
        }
        matrixStr = matrixStr.substring(0, matrixStr.length()-2)+"}";

        return matrixStr;
    }


    private void checkBounds(int posX, int posY) {
        if (posX < 0 || posX > 3 || posY < 0 || posY > 3) {
            throw new IndexOutOfBoundsException("Invalid range: x: " +  posX + ", y: " + posY);
        }
    }

    // Getter and setter
    public double get(int posX, int posY) {
        checkBounds(posX, posY);
        return elements[posX][posY];
    }

    public void set(int posX, int posY, double value) {
        checkBounds(posX, posY);
        elements[posX][posY] = value;
    }
}
