package shapes;

/**
 * Represents a circle geometric shape with a specified radius.
 * The circle's area is calculated using the formula: π * radius².
 * This class is immutable - all fields are final and cannot be modified after construction.
 *
 * @author Adrian Alemany
 * @version 1.0
 */
public final class Circle extends AbstractShape {

    /** The minimum allowed radius value. */
    private static final double MIN_RADIUS = 0.0;

    /** The radius of the circle, must be greater than 0. */
    private final double myRadius;

    /**
     * Constructs a new Circle with the specified radius.
     * Package-private constructor to enforce creation through ShapeFactory.
     *
     * @param theRadius the radius of the circle
     * @throws IllegalArgumentException if the radius is less than or equal to zero
     */
    /* default */
    Circle(final double theRadius) {
        super();
        if (theRadius <= MIN_RADIUS) {
            throw new IllegalArgumentException("radius not positive: " + theRadius);
        }
        myRadius = theRadius;
    }

    /** {@inheritDoc} */
    @Override
    public double area() {
        return Math.PI * myRadius * myRadius;
    }

    /** {@inheritDoc} */
    @Override
    public String name() {
        return "Circle";
    }

    /** Returns the radius of this circle. */
    public double getRadius() {
        return myRadius;
    }
}
