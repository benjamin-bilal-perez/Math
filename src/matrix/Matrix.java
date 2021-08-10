package matrix;

public class Matrix {
    private double rows;
    private double columns;

    public Matrix() {
        this.rows = 0;
        this.columns = 0;
    }

    public Matrix(double rows, double columns) {
        this.rows = rows;
        this.columns = columns;
    }



    // Getter setter rows
    public double getRows() {
        return rows;
    }
    public void setRows(double newRows) {
        this.rows = newRows;
    }

    // Getter setter columns
    public double getColumns() {
        return columns;
    }
    public void setColumns(double newColumns) {
        this.columns = newColumns;
    }
}
