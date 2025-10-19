package shapes;

/**
 * Represents a rectangle geometric shape with a specified length and width.
 * The rectangle's area is calculated using the formula: length * width.
 * This class is immutable - all fields are final and cannot be modified after construction.
 *
 * @author Adrian Alemany
 * @version 1.0
 */
public final class Rectangle extends AbstractShape {

    /** The length of the rectangle, must be greater than 0. */
    private final double myLength;

    /** The width of the rectangle, must be greater than 0. */
    private final double myWidth;

    /**
     * Constructs a new Rectangle with the specified length and width.
     * Package-private constructor to enforce creation through ShapeFactory.
     *
     * @param theLength the length of the rectangle
     * @param theWidth the width of the rectangle
     * @throws IllegalArgumentException if either the length or width
     * is less than or equal to zero
     */
    /* default */ Rectangle(final double theLength, final double theWidth) {
        super();
        if (theLength <= 0.0 || theWidth <= 0.0) {
            throw new IllegalArgumentException("one of the sides is not positive: "
                    + theLength + ", " + theWidth);
        }
        myLength = theLength;
        myWidth = theWidth;
    }

    /**
     * Calculates and returns the area of this rectangle.
     * The area is computed using the formula: length * width.
     *
     * @return the area of the rectangle
     */
    @Override
    public double area() {
        return myLength * myWidth;
    }

    /**
     * Returns the name of this shape.
     *
     * @return the string "Rectangle"
     */
    @Override
    public String name() {
        return "Rectangle";
    }

    /**
     * Returns the length of this rectangle.
     *
     * @return the length of the rectangle
     */
    public double getLength() {
        return myLength;
    }

    /**
     * Returns the width of this rectangle.
     *
     * @return the width of the rectangle
     */
    public double getWidth() {
        return myWidth;
    }
}
