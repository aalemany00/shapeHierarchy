package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import shapes.AbstractShape;
import shapes.ShapeFactory;



/**
 * A test driver class for demonstrating the creation, sorting, and display of various shapes.
 * This class creates multiple shape objects using the ShapeFactory, sorts them using their
 * natural ordering, and outputs the results.
 *
 * @author Adrian Alemany
 * @version 1.0
 */
public final class ShapeTester {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private ShapeTester() {
        // Utility class - no instantiation allowed
    }

    /**
     * The main entry point of the program. Creates a collection of 20 shapes including
     * 5 circles, 5 squares, 5 rectangles, and 5 triangles (with duplicates), prints them
     * before sorting, sorts them according to their natural ordering (by name, then area),
     * and prints the sorted collection.
     *
     * @param theArgs command-line arguments (not used in this application)
     */
    public static void main(final String[] theArgs) {
        final List<AbstractShape> shapes = new ArrayList<>();

        // Create 5 Circles (with 2 duplicates)
        shapes.add(ShapeFactory.createCircle(1.0));
        shapes.add(ShapeFactory.createCircle(2.0));
        shapes.add(ShapeFactory.createCircle(3.0));
        shapes.add(ShapeFactory.createCircle(2.0));  // duplicate
        shapes.add(ShapeFactory.createCircle(1.0));  // duplicate

        // Create 5 Squares (with 2 duplicates)
        shapes.add(ShapeFactory.createSquare(2.0));
        shapes.add(ShapeFactory.createSquare(3.5));
        shapes.add(ShapeFactory.createSquare(1.5));
        shapes.add(ShapeFactory.createSquare(2.0));  // duplicate
        shapes.add(ShapeFactory.createSquare(3.5));  // duplicate

        // Create 5 Rectangles (with 2 duplicates)
        shapes.add(ShapeFactory.createRectangle(3.0, 4.0));
        shapes.add(ShapeFactory.createRectangle(2.5, 3.5));
        shapes.add(ShapeFactory.createRectangle(5.0, 2.0));
        shapes.add(ShapeFactory.createRectangle(3.0, 4.0));  // duplicate
        shapes.add(ShapeFactory.createRectangle(2.5, 3.5));  // duplicate

        // Create 5 Triangles (with 2 duplicates)
        shapes.add(ShapeFactory.createTriangle(4.6, 3.0));
        shapes.add(ShapeFactory.createTriangle(5.0, 4.0));
        shapes.add(ShapeFactory.createTriangle(3.5, 2.5));
        shapes.add(ShapeFactory.createTriangle(4.6, 3.0));  // duplicate
        shapes.add(ShapeFactory.createTriangle(5.0, 4.0));  // duplicate

        // Print shapes before sorting
        System.out.println("Shapes before Sorting:");
        System.out.println("======================");
        for (final AbstractShape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println();

        // Sort the shapes
        Collections.sort(shapes);

        // Print shapes after sorting
        System.out.println("Shapes after Sorting:");
        System.out.println("=====================");
        for (final AbstractShape shape : shapes) {
            System.out.println(shape);
        }
    }
}
