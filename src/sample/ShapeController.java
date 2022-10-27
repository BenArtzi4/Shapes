package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Random;

public class ShapeController {

    @FXML
    public Canvas cnv;

    public GraphicsContext gc;

    public void initialize()
    {
        gc = cnv.getGraphicsContext2D();
        MyLine l1 = new MyLine(randomNumber(), randomNumber(), randomNumber(), randomNumber(), Color.RED);
        MyLine l2 = new MyLine(randomNumber(), randomNumber(), randomNumber(), randomNumber(), Color.RED);
        MyRectangle r1 = new MyRectangle(randomNumber(), randomNumber(), randomNumber(), randomNumber(), Color.RED, true);
        MyRectangle r2 = new MyRectangle(randomNumber(), randomNumber(), randomNumber(), randomNumber(), Color.RED, true);
        MyRectangle o1 = new MyRectangle(randomNumber(), randomNumber(), randomNumber(), randomNumber(), Color.RED, true);
        MyRectangle o2 = new MyRectangle(randomNumber(), randomNumber(), randomNumber(), randomNumber(), Color.RED, true);

        // Create an ArrayList object
        ArrayList<MyShape> shapes1 = new ArrayList<MyShape>();
        shapes1.add(l1);
        shapes1.add(l2);
        shapes1.add(r1);
        shapes1.add(r2);
        shapes1.add(o1);
        shapes1.add(o2);

        ArrayList<MyShape> shapes2 = new ArrayList<MyShape>();
        shapes2.add(l1);
        shapes2.add(l2);
        shapes2.add(r1);
        shapes2.add(r2);
        shapes2.add(o1);
        shapes2.add(o2);




    }

    public double randomNumber()
    {
        Random rd = new Random();
        double rangeMin = 0;
        double rangeMax = 220;

        return rangeMin + (rangeMax - rangeMin) * rd.nextDouble();
    }

}
