package vector;

public class Vector3 {

    private double x;
    private double y;
    private double z;

    public Vector3() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void sum(Vector3 vector) {
        this.x = this.x + vector.getX();
        this.y = this.y + vector.getY();
        this.z = this.z + vector.getZ();
    }

    public Vector3 numMult(double scalar) {
        Vector3 vecResult = new Vector3(this.x*scalar, this.y*scalar, this.z*scalar);
        return vecResult;
    }

    public Vector3 deny() {
        Vector3 vecResult = new Vector3(this.x*-1, this.y*-1, this.z*-1);
        return vecResult;
    }

    public Vector3 scalarProduct(Vector3 vector) {
        Vector3 vecResult = new Vector3(this.x*vector.getX(), this.y*vector.getY(), this.z*vector.getY());
        return vecResult;
    }

    public Vector3 crossProduct(Vector3 vector) {
        // A × B = (AyBz – AzBy) î + (AxBz – AzBx) ĵ + (AxBy –  AyBx) k
        Vector3 vecResult = new Vector3(
                ((this.y*vector.getZ())-(this.z*vector.getY())),
                ((this.x*vector.getZ())-(this.z*vector.getX())),
                ((this.x*vector.getY())-(this.y*vector.getX())));

        return vecResult;
    }

    // Getter setter x
    public double getX() {
        return x;
    }
    public void setX(double newX) {
        this.x = newX;
    }

    // Getter setter y
    public double getY() {
        return y;
    }
    public void setY(double newY) {
        this.y = newY;
    }

    // Getter setter z
    public double getZ() {
        return z;
    }
    public void setZ(double newZ) {
        this.z = newZ;
    }
}
