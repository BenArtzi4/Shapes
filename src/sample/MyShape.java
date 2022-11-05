package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.lang.Cloneable;

/*
An abstract class that defines shapes
 */
abstract class MyShape implements Cloneable
{
    private double x1, y1, x2, y2;
    private Color color;

    public MyShape(double firstX, double firstY, double secondX, double secondY, Color color)
    {
        setX1(firstX);
        setY1(firstY);
        setX2(secondX);
        setY2(secondY);
        setColor(color);
    }

    /*
    Getters
     */
    public double getX1()
    {
        return x1;
    }

    public double getY1()
    {
        return y1;
    }

    public double getX2()
    {
        return x2;
    }

    public double getY2()
    {
        return y2;
    }

    public Color getColor()
    {
        return color;
    }

    /*
    Setters
     */
    public void setX1(double x1)
    {
        this.x1 = x1;
    }

    public void setY1(double y1)
    {
        this.y1 = y1;
    }

    public void setX2(double x2)
    {
        this.x2 = x2;
    }

    public void setY2(double y2)
    {
        this.y2 = y2;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    /*
    Overriding Object's "equals" method that verifies that two forms are equal
     */
    @Override
    public abstract boolean equals(Object obj);

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
