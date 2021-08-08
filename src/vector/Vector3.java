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

    public Vector3 numMult(double scalar) {
        Vector3 vecResult = new Vector3(x*scalar, y*scalar, z*scalar);
        return vecResult;
    }

    public Vector3 deny() {
        Vector3 vecResult = new Vector3(x*-1, y*-1, z*-1);
        return vecResult;
    }

    public Vector3 scalarProduct(Vector3 vector) {
        Vector3 vecResult = new Vector3(x*vector.getX(), y*vector.getY(), z*vector.getY());
        return vecResult;
    }

    public Vector3 crossProduct(Vector3 vector) {
        // A × B = (AyBz – AzBy) î + (AxBz – AzBx) ĵ + (AxBy –  AyBx) k
        Vector3 vecResult = new Vector3(
                ((y*vector.getZ())-(z*vector.getY())),
                ((x*vector.getZ())-(z*vector.getX())),
                ((x*vector.getY())-(y*vector.getX())));

        return vecResult;
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
