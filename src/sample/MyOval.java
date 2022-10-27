package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class MyOval extends MyBoundedShape
{


    public MyOval(double firstX, double firstY, double height, double width, Color color, boolean fill) {
        super(firstX, firstY, height, width, color, fill);
    }


    void drawMe(GraphicsContext input)
    {
        input.strokeOval(this.getX1(), this.getY1(), this.getX2(), this.getY2());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyOval)) {
            return false;
        }
        return super.equals(obj);
    }
}
