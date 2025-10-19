package shapes;

/**
 * A factory class for creating various geometric shape objects.
 * This class provides static factory methods for instantiating different types of shapes
 * including circles, squares, rectangles, and triangles. Using a factory pattern centralizes
 * object creation and provides a clean API for shape instantiation.
 *
 * @author Adrian Alemany
 * @version 1.0
 */
public final class ShapeFactory {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private ShapeFactory() {
        // Utility class - no instantiation allowed
    }

    /**
     * Creates and returns a new Circle object with the specified radius.
     *
     * @param theRadius the radius of the circle
     * @return a new Circle instance with the given radius
     * @throws IllegalArgumentException if the radius is negative or zero
     */
    public static Circle createCircle(final double theRadius) {
        return new Circle(theRadius);
    }

    /**
     * Creates and returns a new Square object with the specified side length.
     *
     * @param theLength the length of each side of the square
     * @return a new Square instance with the given side length
     * @throws IllegalArgumentException if the length is negative or zero
     */
    public static Square createSquare(final double theLength) {
        return new Square(theLength);
    }

    /**
     * Creates and returns a new Rectangle object with the specified dimensions.
     *
     * @param theLength the length of the rectangle
     * @param theWidth the width of the rectangle
     * @return a new Rectangle instance with the given dimensions
     * @throws IllegalArgumentException if the length or width is negative or zero
     */
    public static Rectangle createRectangle(final double theLength, final double theWidth) {
        return new Rectangle(theLength, theWidth);
    }

    /**
     * Creates and returns a new Triangle object with the specified height and base.
     *
     * @param theHeight the height of the triangle
     * @param theBase the base length of the triangle
     * @return a new Triangle instance with the given dimensions
     * @throws IllegalArgumentException if the height or base is negative or zero
     */
    public static Triangle createTriangle(final double theHeight, final double theBase) {
        return new Triangle(theHeight, theBase);
    }
}
