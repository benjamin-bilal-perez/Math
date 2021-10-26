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

    public void sum(Vector2 vector) {
        x = x + vector.getX();
        y = y + vector.getY();
    }

    public void numMult(double num) {
        x = x * num;
        y = y * num;
    }

    public void deny() {
        x = x * -1;
        y = y * -1;
    }

    public void scalarProduct(Vector2 vector) {
        x = x * vector.getX();
        y = y * vector.getY();
    }
    
    public boolean equals(Object object) {
        Vector2 vector = (Vector2)object;

        if (x == vector.getX() && y == vector.y) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
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