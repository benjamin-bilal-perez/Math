package matrix;

public class Matrix3x3 {
    private double rows = 3;
    private double columns = 3;

    private double[][] elements;

    public Matrix3x3() {
        elements = new double[3][3];
    }

    public Matrix3x3(double[][] elements) {
        this.elements = elements;
    }

    public void sum(Matrix3x3 matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                elements[i][j] += matrix.getElements()[i][j];
            }
        }
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
