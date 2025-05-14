package mycompany;

/**
 * Division class to perform basic division operation.
 */
public class Division {

    /**
     * Divides a by b.
     *
     * @param a the numerator
     * @param b the denominator
     * @return the result of a / b
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
}
