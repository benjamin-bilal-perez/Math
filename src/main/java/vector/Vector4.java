package vector;

public class Vector4 {
    private double x;
    private double y;
    private double z;
    private double w;

    public Vector4() {
        x = 0;
        y = 0;
        z = 0;
        w = 0;
    }

    public Vector4(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public void sum(Vector4 vector) {
        x = x + vector.getX();
        y = y + vector.getY();
        z = z + vector.getZ();
        w = w + vector.getW();
    }

    public void numMult(double scalar) {
        x = x*scalar;
        y = y*scalar;
        z = z*scalar;
        w = w*scalar;
    }

    public void deny() {
        x = x*-1;
        y = y*-1;
        z = z*-1;
        w = w*-1;
    }

    public double module() {
        return Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2))+(Math.pow(z, 2))+(Math.pow(w, 2)));
    }

    public void scalarProduct(Vector4 vector) {
        x = x*vector.getX();
        y = y*vector.getY();
        z = z*vector.getZ();
        w = w*vector.getW();
    }

    public boolean equals(Object object) {
        Vector4 vector = (Vector4)object;

        if (x == vector.getX() && y == vector.getY() && z == vector.getZ() && w == vector.getW()) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y + ", " + "z: " + z + ", w: " + w;
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

    // Getter setter w
    public double getW() {
        return w;
    }
    public void setW(double newW) {
        w = newW;
    }
}
