package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
A method that draws a line defined by the two points between which it lies
 */
public class MyLine extends MyShape
{
    public MyLine(double firstX, double firstY, double secondX, double secondY, Color color)
    {
        super(firstX, firstY, secondX, secondY, color);
    }

    /*
    A method that checks if the length of the lines is equal
     */
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof  MyLine))
        {
            return false;
        }
        return calculateDistance(this) == calculateDistance((MyLine) obj);
    }

    @Override
    void drawMe(GraphicsContext input)
    {
        input.setStroke(this.getColor());
        input.strokeLine(this.getX1(), this.getY1(), this.getX2(), this.getY2());
    }

    @Override
    public Object clone() {
        return new MyLine(this.getX1(), this.getY1(), this.getX2(), this.getY2(), this.getColor());
    }

    /*
    A method for calculating the distance between two points
     */
    private double calculateDistance(MyLine l1) {
        // TODO: check that the method returns double
        System.out.println("This is the distance: " + Math.sqrt((l1.getX1() - l1.getX2()) * (l1.getX1() - l1.getX2()) + (l1.getY1() - l1.getY2()) * (l1.getY1() - l1.getY2())));
        return Math.sqrt((l1.getX1() - l1.getX2()) * (l1.getX1() - l1.getX2()) + (l1.getY1() - l1.getY2()) * (l1.getY1() - l1.getY2()));
    }
}
