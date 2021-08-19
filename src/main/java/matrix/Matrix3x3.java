package matrix;

import vector.Vector3;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix3x3 {
    private double[][] elements;

    public Matrix3x3() {
        elements = new double[3][3];
    }

    public Matrix3x3(double pos0, double pos1, double pos2, double pos3, double pos4,
                     double pos5, double pos6, double pos7, double pos8) {
        elements = new double[][]{{pos0, pos1, pos2},{pos3, pos4, pos5},{pos6, pos7, pos8}};
    }

    public void sum(Matrix3x3 matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                elements[i][j] += matrix.get(i, j);
            }
        }
    }

    public void subtraction(Matrix3x3 matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                elements[i][j] -= matrix.get(i, j);
            }
        }
    }

    public void multiply(Matrix3x3 matrix) {
        double[][] result = {{0.0,0.0,0.0},{0.0,0.0,0.0},{0.0,0.0,0.0}};
        result[0][0] =
                (elements[0][0]*matrix.elements[0][0])+
                (elements[0][1]*matrix.elements[1][0])+
                (elements[0][2]*matrix.elements[2][0]);
        result[0][1] =
                (elements[0][0]*matrix.elements[0][1]) +
                (elements[0][1]*matrix.elements[1][1]) +
                (elements[0][2]*matrix.elements[2][1]);
        result[0][2] =
                (elements[0][0]*matrix.elements[0][2]) +
                (elements[0][1]*matrix.elements[1][2]) +
                (elements[0][2]*matrix.elements[2][2]);
        result[1][0] =
                (elements[1][0]*matrix.elements[0][0]) +
                (elements[1][1]*matrix.elements[1][0]) +
                (elements[1][2]*matrix.elements[2][0]);
        result[1][1] =
                (elements[1][0]*matrix.elements[0][1]) +
                (elements[1][1]*matrix.elements[1][1]) +
                (elements[1][2]*matrix.elements[2][1]);
        result[1][2] =
                (elements[1][0]*matrix.elements[0][2]) +
                (elements[1][1]*matrix.elements[1][2]) +
                (elements[1][2]*matrix.elements[2][2]);
        result[2][0] =
                (elements[2][0]*matrix.elements[0][0]) +
                (elements[2][1]*matrix.elements[1][0]) +
                (elements[2][2]*matrix.elements[2][0]);
        result[2][1] =
                (elements[2][0]*matrix.elements[0][1]) +
                (elements[2][1]*matrix.elements[1][1]) +
                (elements[2][2]*matrix.elements[2][1]);
        result[2][2] =
                (elements[2][0]*matrix.elements[0][2]) +
                (elements[2][1]*matrix.elements[1][2]) +
                (elements[2][2]*matrix.elements[2][2]);
        elements = result;
    }

    public void scalarMult(double scalar) {
        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) { // columns
                elements[i][j] *= scalar;
            }
        }
    }

    public void division(Matrix3x3 matrix) {
        // Determinant different to cero?
        double deter = 0.0;

        deter = ((matrix.get(0,0)*matrix.get(1,1)*matrix.get(2,2))+
                    (matrix.get(2,0)*matrix.get(0,1)*matrix.get(1,2))+
                    (matrix.get(1,0)*matrix.get(0,2)*matrix.get(2,1))-
                    (matrix.get(0,2)*matrix.get(1,1)*matrix.get(2,0))-
                    (matrix.get(0,0)*matrix.get(1,2)*matrix.get(2,1))-
                    (matrix.get(1,0)*matrix.get(0,1)*matrix.get(2,2)));

        if (deter == 0) {
            throw new UnsupportedOperationException("Impossible operation, no invertible matrix");
        }

        System.out.println("Determinant: " + deter);

        // Now I will transpose it
        Matrix3x3 transposeM = new Matrix3x3();

        transposeM = transpose(matrix.elements);

        Double adjunctMatrix[][] = new Double[][] {{0.0, 0.0, 0.0},{0.0, 0.0, 0.0},{0.0, 0.0, 0.0}};
        // double[] newElements = {};
        Double newElements[] = new Double[0];
        double[][] elementsDeter;

        // Adjunct matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (x == i) {
                            break;
                        } else if (y == j) {
                            continue;
                        }

                        // Double arr[] = {};
                        // System.out.println("Array:"+ Arrays.toString(arr));
                        ArrayList<Double> arrayList = new ArrayList<Double>(Arrays.asList(newElements));
                        arrayList.add(transposeM.elements[x][y]);
                        newElements = arrayList.toArray(newElements);
                        // System.out.println("Array after adding element: "+Arrays.toString(newElements));

                    }
                }
                elementsDeter = new double[][]{{newElements[0], newElements[1]},
                        {newElements[2], newElements[3]}};
                /*for (int w = 0; w < newElements.length; w++) {
                    System.out.println(newElements[w]);
                    // total++;
                }
                System.out.println("---------------");*/
                adjunctMatrix[i][j] = Math.pow(-1, i+j)*determinant(elementsDeter);
                newElements = new Double[0];
            }
        }

        // Adjunt matrix
        for (int i = 0; i < adjunctMatrix.length; i++) {
            for (int j = 0; j < adjunctMatrix[i].length; j++) {
                System.out.println(adjunctMatrix[i][j]);
            }
        }

        // Scalar division, divided by the determinant of the matrix
        for (int i = 0; i < adjunctMatrix.length; i++) {
            for (int j = 0; j < adjunctMatrix[i].length; j++) {
                adjunctMatrix[i][j] /= deter;
            }
        }

        // "Testing" the result
        System.out.println("----------");
        System.out.println("Adjunt divided by determinant (inverse)");
        for (int i = 0; i < adjunctMatrix.length; i++) {
            for (int j = 0; j < adjunctMatrix[i].length; j++) {
                System.out.println(adjunctMatrix[i][j]);
            }
        }

        System.out.println("----------");

        Matrix3x3 adjunt = new Matrix3x3(adjunctMatrix[0][0],adjunctMatrix[0][1],adjunctMatrix[0][2],
                adjunctMatrix[1][0],adjunctMatrix[1][1],adjunctMatrix[1][2],
                adjunctMatrix[2][0],adjunctMatrix[2][1],adjunctMatrix[2][2]);

        multiply(adjunt);

    }

    private double determinant(double[][] matrix) { // 2x2
        return (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);
    }

    private Matrix3x3 transpose(double[][] matrix) {
        Matrix3x3 transposeM = new Matrix3x3();

        transposeM.set(0,0,matrix[0][0]);
        transposeM.set(0,1,matrix[1][0]);
        transposeM.set(0,2,matrix[2][0]);
        transposeM.set(1,0,matrix[0][1]);
        transposeM.set(1,1,matrix[1][1]);
        transposeM.set(1,2,matrix[2][1]);
        transposeM.set(2,0,matrix[0][2]);
        transposeM.set(2,1,matrix[1][2]);
        transposeM.set(2,2,matrix[2][2]);

        return transposeM;
    }

    public void scalarDivision(double scalar) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                elements[i][j] /= scalar;
            }
        }
    }

    public boolean equals(Object object) {
        Matrix3x3 matrix = (Matrix3x3) object;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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

        for (int i = 0; i < 3; i++) {
            matrixStr += "{";
            for (int j = 0; j < 3; j++) {
                matrixStr += elements[i][j] + ",";
            }
            // matrixStr = matrixStr.split("");

            matrixStr = matrixStr.substring(0, matrixStr.length()-1)+"}, ";
        }
        matrixStr = matrixStr.substring(0, matrixStr.length()-2)+"}";

        return matrixStr;
    }

    private void checkBounds(int posX, int posY) {
        if (posX < 0 || posX > 2 || posY < 0 || posY > 2) {
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

    // Getter elements
    public double[][] getElements() {
        return elements;
    }
}