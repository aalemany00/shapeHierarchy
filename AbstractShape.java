package shapes;

import java.text.DecimalFormat;
import java.util.Objects;

/**
 * An abstract base class for all geometric shapes.
 * This class provides common functionality for shapes including comparison based on
 * name and area, string representation, and equality checking.
 * Concrete subclasses must implement the {@code area()} and {@code name()} methods
 * to define their specific geometric properties.
 *
 * Shapes are ordered first by name (alphabetically), then by area (numerically)
 * when names are equal, as defined by the {@link Comparable} interface.
 *
 * @author Adrian Alemany
 * @version 1.0
 */
public abstract class AbstractShape implements Comparable<AbstractShape> {

    /**
     * Constructs a new AbstractShape.
     * This constructor is provided for subclass instantiation.
     */
    protected AbstractShape() {
        // Constructor for subclasses
    }

    /**
     * Calculates and returns the area of this shape.
     *
     * @return the area of the shape
     */
    public abstract double area();

    /**
     * Returns the name of this shape.
     *
     * @return the name of the shape (e.g., "Circle", "Square", "Rectangle", "Triangle")
     */
    public abstract String name();

    /**
     * Returns a string representation of this shape in the format:
     * "Name: [shape name], Area: [area value]"
     * The area is formatted to two decimal places.
     *
     * @return a formatted string describing the shape's name and area
     */
    @Override
    public String toString() {
        final DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return "Name: " + name() + ", Area: " + decimalFormat.format(area());
    }

    /**
     * Compares this shape with another shape for ordering.
     * Shapes are compared first by name (alphabetically), and if names are equal,
     * then by area (numerically in ascending order).
     *
     * @param theOtherShape the shape to be compared
     * @return a negative integer if this shape comes before the other shape,
     * zero if they are equal, or a positive integer if this shape comes after
     * @throws NullPointerException if theOtherShape is null
     */
    @Override
    public int compareTo(final AbstractShape theOtherShape) {
        int result = this.name().compareTo(theOtherShape.name());
        if (result == 0) {
            result = Double.compare(this.area(), theOtherShape.area());
        }
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this shape.
     * Two shapes are considered equal if they are of the exact same class,
     * have the same name, and the same area.
     *
     * @param theOtherObject the reference object with which to compare
     * @return {@code true} if this shape is equal to the other object; {@code false} otherwise
     */
    @Override
    public boolean equals(final Object theOtherObject) {
        boolean result = false;

        if (this == theOtherObject) {
            result = true;
        } else if (theOtherObject != null && this.getClass() == theOtherObject.getClass()) {
            final AbstractShape otherShape = (AbstractShape) theOtherObject;
            result = Double.compare(this.area(), otherShape.area()) == 0
                    && this.name().equals(otherShape.name());
        }

        return result;
    }

    /**
     * Returns a hash code value for this shape based on its name and area.
     *
     * @return a hash code value for this shape
     */
    @Override
    public int hashCode() {
        return Objects.hash(name(), area());
    }
}
