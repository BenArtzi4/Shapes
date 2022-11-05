package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.Random;

public class ShapeController
{

    @FXML
    public Canvas cnv;

    public GraphicsContext gc;

    public void initialize() throws CloneNotSupportedException
    {
        gc = cnv.getGraphicsContext2D();

        // Creating two shapes from any shape with random sizes
        MyLine l1 = new MyLine(randomNumber(), randomNumber(), randomNumber(), randomNumber(), Color.RED);
        MyLine l2 = new MyLine(randomNumber(), randomNumber(), randomNumber(), randomNumber(), Color.RED);
        MyRectangle r1 = new MyRectangle(randomNumber(), randomNumber(), randomNumber(), randomNumber(), Color.RED, true);
        MyRectangle r2 = new MyRectangle(randomNumber(), randomNumber(), randomNumber(), randomNumber(), Color.RED, true);
        MyOval o1 = new MyOval(randomNumber(), randomNumber(), randomNumber(), randomNumber(), Color.RED, true);
        MyOval o2 = new MyOval(randomNumber(), randomNumber(), randomNumber(), randomNumber(), Color.RED, true);

        // Create an ArrayList object and adding the shapes to it
        ArrayList<MyShape> shapes1 = new ArrayList<MyShape>();
        shapes1.add(l1);
        shapes1.add(l2);
        shapes1.add(r1);
        shapes1.add(r2);
        shapes1.add(o1);
        shapes1.add(o2);


        /*
        Adding to the  second ArrayList clones of the shapes that in the first one
         */
        ArrayList<MyShape> shapes2 = new ArrayList<MyShape>();
        for (MyShape shape : shapes1)
        {
            shapes2.add((MyShape) (shape.clone()));
        }

        /*
        Changing the properties of the shapes according to the instructions
         */
        for (MyShape myShape : shapes2)
        {
            myShape.setX1(myShape.getX1()+10);
            myShape.setY1(myShape.getY1()+10);
            myShape.setColor(Color.GREEN);
            if (myShape instanceof MyBoundedShape)
            {
                ((MyBoundedShape) myShape).setFill(false);
            }
        }

        /*
        Drawing the shapes in arraylists
         */
        for (MyShape myShape : shapes1)
        {
            myShape.drawMe(gc);
        }

        for (MyShape myShape : shapes2)
        {
            myShape.drawMe(gc);
        }
    }

    /*
    Random number draw between 0 and 200
     */
    public double randomNumber()
    {
        Random rd = new Random();
        double rangeMin = 0;
        double rangeMax = 200;
        return rangeMin + (rangeMax - rangeMin) * rd.nextDouble();
    }
}