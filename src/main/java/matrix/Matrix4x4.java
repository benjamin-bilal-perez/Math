package matrix;

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
        elements[0][0] =
                (elements[0][0]*matrix.elements[0][0])+
                (elements[0][1]*matrix.elements[1][0])+
                (elements[0][1]*matrix.elements[2][0])+
                (elements[0][3]*matrix.elements[3][0]);
        elements[0][1] =
                (elements[0][0]*matrix.elements[0][1]) +
                (elements[0][1]*matrix.elements[1][1]) +
                (elements[0][2]*matrix.elements[2][1]) +
                (elements[0][3]*matrix.elements[3][1]);
        elements[0][2] =
                (elements[0][0]*matrix.elements[0][2]) +
                (elements[0][1]*matrix.elements[1][2]) +
                (elements[0][2]*matrix.elements[2][2]) +
                (elements[0][3]*matrix.elements[3][2]);
        elements[0][3] =
                (elements[0][0]*matrix.elements[0][3]) +
                (elements[0][1]*matrix.elements[1][3]) +
                (elements[0][2]*matrix.elements[2][3]) +
                (elements[0][3]*matrix.elements[3][3]);
        elements[1][0] =
                (elements[1][0]*matrix.elements[0][0]) +
                (elements[1][1]*matrix.elements[1][0]) +
                (elements[1][2]*matrix.elements[2][0]) +
                (elements[1][3]*matrix.elements[3][0]);
        elements[1][1] =
                (elements[1][0]*matrix.elements[0][1]) +
                (elements[1][1]*matrix.elements[1][1]) +
                (elements[1][2]*matrix.elements[2][1]) +
                (elements[1][3]*matrix.elements[3][1]);
        elements[1][2] =
                (elements[1][0]*matrix.elements[0][2]) +
                (elements[1][1]*matrix.elements[1][2]) +
                (elements[1][2]*matrix.elements[2][2]) +
                (elements[1][3]*matrix.elements[3][2]);
        elements[1][3] =
                (elements[1][0]*matrix.elements[0][3]) +
                (elements[1][1]*matrix.elements[1][3]) +
                (elements[1][2]*matrix.elements[2][3]) +
                (elements[1][3]*matrix.elements[3][3]);
        elements[2][0] =
                (elements[2][0]*matrix.elements[0][0]) +
                (elements[2][1]*matrix.elements[1][0]) +
                (elements[2][2]*matrix.elements[2][0]) +
                (elements[2][3]*matrix.elements[3][0]);
        elements[2][1] =
                (elements[2][0]*matrix.elements[0][1]) +
                (elements[2][1]*matrix.elements[1][1]) +
                (elements[2][2]*matrix.elements[2][1]) +
                (elements[2][3]*matrix.elements[3][1]);
        elements[2][2] =
                (elements[2][0]*matrix.elements[0][2]) +
                (elements[2][1]*matrix.elements[1][2]) +
                (elements[2][2]*matrix.elements[2][2]) +
                (elements[2][3]*matrix.elements[3][2]);
        elements[2][3] =
                (elements[2][0]*matrix.elements[0][3]) +
                (elements[2][1]*matrix.elements[1][3]) +
                (elements[2][2]*matrix.elements[2][3]) +
                (elements[2][3]*matrix.elements[3][3]);
        elements[3][0] =
                (elements[3][0]*matrix.elements[0][0]) +
                (elements[3][1]*matrix.elements[1][0]) +
                (elements[3][2]*matrix.elements[2][0]) +
                (elements[3][3]*matrix.elements[3][0]);
        elements[3][1] =
                (elements[3][0]*matrix.elements[0][1]) +
                (elements[3][1]*matrix.elements[1][1]) +
                (elements[3][2]*matrix.elements[2][1]) +
                (elements[3][3]*matrix.elements[3][1]);
        elements[3][2] =
                (elements[3][0]*matrix.elements[0][2]) +
                (elements[3][1]*matrix.elements[1][2]) +
                (elements[3][2]*matrix.elements[2][2]) +
                (elements[3][3]*matrix.elements[3][2]);
        elements[3][3] =
                (elements[3][0]*matrix.elements[0][3]) +
                (elements[3][1]*matrix.elements[1][3]) +
                (elements[3][2]*matrix.elements[2][3]) +
                (elements[3][3]*matrix.elements[3][3]);
    }

    public void scalarMult(double scalar) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                elements[i][j] *= scalar;
            }
        }
    }

    public void division(Matrix4x4 matrix) {

    }

    public void scalarDivision(double scalar) {
        for (int i = 0; i < 4; i++) { // rows
            for (int j = 0; j < 4; j++) { // columns
                elements[i][j] /= scalar;
            }
        }
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
