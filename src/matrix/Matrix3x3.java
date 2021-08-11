package matrix;

public class Matrix3x3 {
    private double rows = 3;
    private double columns = 3;



    private double[][] elements;

    public Matrix3x3() {
        elements = new double[3][3];
    }

    public Matrix3x3(int pos0, int pos1, int pos2, int pos3, int pos4,
                     int pos5, int pos6, int pos7, int pos8) {
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

    // Test it!
    public /*double[][]*/ void multiply(Matrix3x3 matrix) {
        int provisionalRes = 0;
        double[][] matrixRes = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for (int x = 0; x < rows; x++) {
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.println("---" + elements[j][i] + "---" + matrix.getElements()[x][i]);
                    matrixRes[x][i] += elements[j][i]*matrix.getElements()[x][i];
                    System.out.println(elements[j][i] + " x " + matrix.getElements()[x][i]);
                }
            }
        }

        elements = matrixRes;
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
    }
    public void setElements(double[][] newElements) {
        elements = newElements;
    }
}
