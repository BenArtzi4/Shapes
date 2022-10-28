package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
A class representing an rectangle and inherits from the Area Shapes class
 */
public class MyRectangle extends MyBoundedShape
{

    public MyRectangle(double firstX, double firstY, double height, double width,
                       Color color, boolean fill)
    {
        super(firstX, firstY, height, width, color, fill);
    }

    /*
    TODO: Add fill or not fill uses in draw the shape
     */

    void drawMe(GraphicsContext input)
    {
        if (!this.getFill())
        {
            input.setFill(Color.WHITE);
        }
        else
        {
            input.setFill(this.getColor());
        }
        input.fillRect(this.getX1(), this.getY1(), this.getX2(), this.getY2());
        input.strokeRect(this.getX1(), this.getY1(), this.getX2(), this.getY2());
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof MyRectangle))
        {
            return false;
        }
        return super.equals(obj);
    }

    /*
     A method for creating an identical ellipse and return it
    */
    @Override
    public Object clone() {
        return new MyRectangle(this.getX1(), this.getY1(), this.getX2(), this.getY2(), this.getColor(), this.getFill());
    }
}
