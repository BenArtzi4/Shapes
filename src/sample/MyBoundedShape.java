package sample;


import javafx.scene.paint.Color;

abstract class MyBoundedShape extends MyShape
{
    private boolean fill;
    private double width;
    private double length;


    public MyBoundedShape(double firstX, double firstY, double secondX, double secondY, Color color, boolean fill, double width, double length )
    {
        super(firstX, firstY, secondX, secondY, color);
        this.fill = fill;
        this.width = width;
        this.length = length;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof MyBoundedShape))
        {
            return false;
        }

        return this.length == ((MyBoundedShape) obj).getLength() && this.width == ((MyBoundedShape) obj).getWidth();
    }

}
