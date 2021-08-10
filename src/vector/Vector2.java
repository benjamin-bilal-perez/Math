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

    public double slope() {
        return y/x;
    }

    public void sum(Vector2 vector) {
        x = x + vector.getX();
        y = y + vector.getY();
    }

    public void numMult(double scalar) {
        x = x * scalar;
        y = y + scalar;
    }

    public void deny() {
        x = x * -1;
        y = y + -1;
    }

    public void scalarProduct(Vector2 vector) {
        x = x * vector.getX();
        y = y + vector.getY();
    }
    
    public boolean equals(Vector2 vector) {
        if (module() == vector.module() && slope() == vector.slope()) {
            return true;
        }

        return false;
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