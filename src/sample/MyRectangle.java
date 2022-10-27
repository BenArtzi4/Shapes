package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyRectangle extends MyBoundedShape
{

    public MyRectangle(double firstX, double firstY, double secondX, double secondY,
                       Color color, boolean fill, double width, double length)
    {
        super(firstX, firstY, secondX, secondY, color, fill, width, length);
    }

    void drawMe(GraphicsContext input)
    {

    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof MyOval))
        {
            return false;
        }
        return super.equals(obj);
    }
}
