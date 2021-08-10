package vector;

public class Vector3 {

    private double x;
    private double y;
    private double z;

    //  point A has coordinates
    private double[] aCoor;

    //  point B has coordinates
    private double[] bCoor;

    //  point C has coordinates
    private double[] cCoor;


    public Vector3() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector3(double[] aCoor, double[] bCoor, double[] cCoor) {
        this.aCoor = aCoor;
        this.bCoor = bCoor;
        this.cCoor = cCoor;

        x = aCoor[0]-bCoor[0];
        y = aCoor[1]-bCoor[1];
        z = aCoor[1]-bCoor[1];
    }

    public void sum(Vector3 vector) {

        x = x + vector.getX();
        y = y + vector.getY();
        z = z + vector.getZ();
    }

    public void numMult(double scalar) {
        x = x*scalar;
        y = y*scalar;
        z = z*scalar;
    }

    public void deny() {
        x = x*-1;
        y = y*-1;
        z = z*-1;
    }

    public void scalarProduct(Vector3 vector) {
        x = x*vector.getX();
        y = y*vector.getY();
        z = z*vector.getZ();
    }

    public void crossProduct(Vector3 vector) {
        // A × B = (AyBz – AzBy) î + (AxBz – AzBx) ĵ + (AxBy –  AyBx) k
        x = (y*vector.getZ())-(z*vector.getY());
        y = (x*vector.getZ())-(z*vector.getX());
        z = (x*vector.getY())-(y*vector.getX());
    }

    // Getter setter x
    public double getX() {
        return x;
    }
    public void setX(double newX) {
        x = newX;
    }

    // Getter setter y
    public double getY() {
        return y;
    }
    public void setY(double newY) {
        y = newY;
    }

    // Getter setter z
    public double getZ() {
        return z;
    }
    public void setZ(double newZ) {
        z = newZ;
    }
}
