package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.lang.Cloneable;

/*
An abstract class that defines shapes
 */
abstract class MyShape implements Cloneable {
    final static int MAX_SIZE = 200;
    private double x1, y1, x2, y2;
    private Color color;

    public MyShape(double firstX, double firstY, double secondX, double secondY, Color color) {
        setX1(firstX);
        setY1(firstY);
        setX2(secondX);
        setY2(secondY);
        setColor(color);
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public Color getColor() {
        return color;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /*
    Overriding Object's "equals" method that verifies that two forms are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyShape) {
            return ((MyShape) obj).getX1() == this.x1 && ((MyShape) obj).getY1() == this.y1 &&
                    ((MyShape) obj).getX2() == this.x2 && ((MyShape) obj).getY2() == this.y2
                    && ((MyShape) obj).getColor().equals(this.color);
        }
        return false;
    }

    /*
    An abstract method for drawing the shape
     */
    abstract void drawMe(GraphicsContext input);

    /*
    An abstract method for creating a clone for a shape
     */
    @Override
    abstract protected Object clone() throws CloneNotSupportedException;
}
