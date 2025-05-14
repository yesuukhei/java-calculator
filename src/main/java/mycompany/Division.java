package mycompany;

public class Division {
 public double divide(double a, double b) {
    if (b == 0) {
        throw new IllegalArgumentException("Ened aldaa zaslaa.");
    }
    return a / b;
 }
}
