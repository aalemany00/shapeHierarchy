package shapes;

/**
 * Represents a square geometric shape with equal sides.
 * The square's area is calculated using the formula: side * side.
 * This class is immutable - all fields are final and cannot be modified after construction.
 *
 * @author Adrian Alemany
 * @version 1.0
 */
public final class Square extends AbstractShape {

    /** The minimum valid length for a square side (exclusive). */
    private static final double MIN_LENGTH = 0.0;

    /** The length of each side of the square, must be greater than 0. */
    private final double myLength;

    /**
     * Constructs a new Square with the specified side length.
     * Package-private constructor to enforce creation through ShapeFactory.
     *
     * @param theLength the length of each side of the square
     * @throws IllegalArgumentException if the length is less than or equal to zero
     */
    /* default */ Square(final double theLength) {
        super();
        if (theLength <= MIN_LENGTH) {
            throw new IllegalArgumentException("length not positive: " + theLength);
        }
        myLength = theLength;
    }

    /**
     * Calculates and returns the area of this square.
     * The area is computed using the formula: side * side.
     *
     * @return the area of the square
     */
    @Override
    public double area() {
        return myLength * myLength;
    }

    /**
     * Returns the name of this shape.
     *
     * @return the string "Return"
     */
    @Override
    public String name() {
        return "Square";
    }

    /**
     * Returns the side length of this square.
     *
     * @return the length of each side of the square
     */
    public double getLength() {
        return myLength;
    }
}