package shapes;

/**
 * Represents a triangle geometric shape with a specified height and base.
 * The triangle's area is calculated using the formula: (height * base) / 2.
 * This class is immutable - all fields are final and cannot be modified after construction.
 *
 * @author Adrian Alemany
 * @version 1.0
 */
public final class Triangle extends AbstractShape {

    /** The height of the triangle, must be greater than 0. */
    private final double myHeight;

    /** The base of the triangle, must be greater than 0. */
    private final double myBase;

    /**
     * Constructs a new Triangle with the specified height and base.
     * Package-private constructor to enforce creation through ShapeFactory.
     *
     * @param theHeight the height of the triangle
     * @param theBase the base length of the triangle
     * @throws IllegalArgumentException if either the height or base
     * is less than or equal to zero
     */
    /* default */ Triangle(final double theHeight, final double theBase) {
        super();
        if (theHeight <= 0.0 || theBase <= 0.0) {
            throw new IllegalArgumentException("one of the sides is not positive: "
                    + theHeight + ", " + theBase);
        }
        myHeight = theHeight;
        myBase = theBase;
    }

    /**
     * Calculates and returns the area of this triangle.
     * The area is computed using the formula: (height * base) / 2.
     *
     * @return the area of the triangle
     */
    @Override
    public double area() {
        return myHeight * myBase / 2;
    }

    /**
     * Returns the name of this shape.
     *
     * @return the string "Triangle"
     */
    @Override
    public String name() {
        return "Triangle";
    }

    /**
     * Returns the height of this triangle.
     *
     * @return the height of the triangle
     */
    public double getHeight() {
        return myHeight;
    }

    /**
     * Returns the base length of this triangle.
     *
     * @return the base of the triangle
     */
    public double getBase() {
        return myBase;
    }
}
