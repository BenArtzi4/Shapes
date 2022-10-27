package sample;

import javafx.scene.paint.Color;

public class MyLine extends MyShape
{
    public MyLine(double firstX, double firstY, double secondX, double secondY, Color color)
    {
        super(firstX, firstY, secondX, secondY, color);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof  MyLine))
        {
            return false;
        }
        return calculateDistance(this) == calculateDistance((MyLine) obj);
    }


}
