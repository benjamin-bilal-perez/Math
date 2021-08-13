package matrix;

public class Matrix3x3 {
    private double rows = 3;
    private double columns = 3;

    private double[][] elements;

    public Matrix3x3() {
        elements = new double[3][3];
    }

    public Matrix3x3(double pos0, double pos1, double pos2, double pos3, double pos4,
                     double pos5, double pos6, double pos7, double pos8) {
        elements = new double[][]{{pos0, pos1, pos2},{pos3, pos4, pos5},{pos6, pos7, pos8}};
    }

    public void sum(Matrix3x3 matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                elements[i][j] += matrix.getElements()[i][j];
            }
        }
    }

    public void subtraction(Matrix3x3 matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                elements[i][j] -= matrix.getElements()[i][j];
            }
        }
    }

    public void multiply(Matrix3x3 matrix) {
        // Hacerlo directamente con la fórmula
        int provisionalRes = 0;
        double[][] matrixRes = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for (int x = 0; x < rows; x++) {
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < rows; j++) {
                    matrixRes[x][i] += elements[x][j]*matrix.elements[j][i];
                    // System.out.println(elements[x][j] + " x " + matrix.getElements()[j][i]);
                }
            }
        }

        elements = matrixRes;
    }

    public void scalarMult(double scalar) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                elements[i][j] *= scalar;
            }
        }
    }

    public void division(Matrix3x3 matrix) {

    }

    public void scalarDivision(double scalar) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                elements[i][j] /= scalar;
            }
        }
    }

    private void checkBounds(int posX, int posY) {
        if (posX < 0 || posX > 2 || posY < 0 || posY > 2) {
            throw new IndexOutOfBoundsException("Rango inválido: x: " +  posX + ", y: " + posY);
        }
    }

    public void set(int posX, int posY, double value) {
        checkBounds(posX, posY);
        elements[posX][posY] = value;
    }

    public double get(int posX, int posY) {
        checkBounds(posX, posY);
        return elements[posX][posY];
    }


    // Getter setter rows
    public double getRows() {
        return rows;
    }
    public void setRows(double newRows) {
        rows = newRows;
    }

    // Getter setter columns
    public double getColumns() {
        return columns;
    }
    public void setColumns(double newColumns) {
        columns = newColumns;
    }

    // Getter setter elements
    public double[][] getElements() {
        return elements;
    }/*
    public void setElements(double[][] newElements) {
        // controlar el límite
        elements = newElements;
    }*/
}
