package sample;


import javafx.scene.paint.Color;

/*
An abstract class that represents shapes that have an area
 */
abstract class MyBoundedShape extends MyShape {
    private boolean fill;

    public MyBoundedShape(double firstX, double firstY, double height, double width, Color color, boolean fill) {
        super(firstX, firstY, height, width, color);
        this.fill = fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public boolean getFill() {
        return fill;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyBoundedShape)) {
            return false;
        }
        return this.getX2() == ((MyBoundedShape) obj).getX2() && this.getY2() == ((MyBoundedShape) obj).getY2();
    }

}
