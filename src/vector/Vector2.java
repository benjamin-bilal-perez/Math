package vector;

import java.util.Vector;

public class Vector2 {

    private double x;
    private double y;

    public Vector2() {
        x = 0;
        y = 0;
    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double module() {
        return Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
    }

    public Vector2 sum(Vector2 vector) {
        Vector2 vecResult = new Vector2(x+vector.getX(), y+vector.getY());
        return vecResult;
    }

    public Vector2 numMult(double scalar) {
        Vector2 vecResult = new Vector2(x*scalar, y*scalar);
        return vecResult;
    }

    public Vector2 deny() {
        Vector2 vecResult = new Vector2(x*-1, y*-1);
        return vecResult;
    }

    public Vector2 scalarProduct(Vector2 vector) {
        Vector2 vecResult = new Vector2(x*vector.getX(), y*vector.getY());
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


}
