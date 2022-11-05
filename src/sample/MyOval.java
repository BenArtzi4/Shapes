package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
A class representing an oval and inherits from the Area Shapes class
 */
public class MyOval extends MyBoundedShape
{
    public MyOval(double firstX, double firstY, double height, double width, Color color, boolean fill) {
        super(firstX, firstY, height, width, color, fill);
    }

    /*
    A method that draws the oval
    */
    void drawMe(GraphicsContext input)
    {

        // TODO: parameters of oval aren't good
        if (this.getFill())
        {
            input.setFill(this.getColor());
            input.fillOval(this.getX1(), this.getY1(), this.getX2(), this.getY2());
        }
        input.strokeOval(this.getX1(), this.getY1(), this.getX2(), this.getY2());
    }


    /*
    A method that checks whether the height and length of the ovals are equal
    */
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof MyOval)) {
            return false;
        }
        return super.equals(obj);
    }

    /*
    A method for creating an identical Oval and return it
     */
    @Override
    public Object clone() {
        return new MyOval(this.getX1(), this.getY1(), this.getX2(), this.getY2(), this.getColor(), this.getFill());
    }
}
