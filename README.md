# Geometric Shape Hierarchy Program

Welcome to the Geometric Shape Hierarchy program, written in Java with a GUI implemented using JavaFX!

This program defines a hierarchy of geometric shapes, with an abstract class called MyShape at the top of the hierarchy. MyShape defines the properties and behavior that all shapes have in common.

The abstract class MyBoundedShape extends MyShape and defines the properties and behavior of shapes with an area. The classes MyLine, MyOval, and MyRectangle represent the specific shapes of line, ellipse, and rectangle, respectively.

All shapes in the hierarchy are represented by 4 numbers (y1, x1), (y2, x2) and a color (of type Color). They also have a method that allows them to draw themselves using a GraphicsContext parameter. In the case of a line, the values represent the starting and ending points of the line. In the case of a rectangle or ellipse, (y1, x1) represents the upper left corner of the shape, and (y2, x2) represents the width and height of the shape.

The oval and rectangle shapes also have a property that indicates whether the shape is filled or empty.

Each class includes a constructor that receives the shape data and initializes it accordingly.

## To use the Geometric Shape Hierarchy program:

1. Download the program files and open them in a Java development environment with support for JavaFX.
2. Compile and run the program.
3. Follow the prompts on the screen to create and manipulate the various geometric shapes.
4. The program will display the shapes on the screen and allow you to change their properties.
