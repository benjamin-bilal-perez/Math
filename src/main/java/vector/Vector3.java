package vector;

public class Vector3 {

    private double x;
    private double y;
    private double z;

    public Vector3() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double module() {
        return Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2))+(Math.pow(z, 2)));
    }

    // Correct?
    public double slope() {
        return y/x;
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

    public boolean equals(Vector3 vector) {
        if (vector.getX() == x && vector.getY() == y && vector.getZ() == z) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        // x: 1, y: 5, z: 9
        return "x: " + x + ", y: " + y + ", " + "z: " + z;
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
