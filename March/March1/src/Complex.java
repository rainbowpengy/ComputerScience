/**
 * @author Jarod Klion on 1/22/2016.
 */
public class Complex {
    private double real;
    private double imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double real) {
        this.real = real;
        this.imag = 0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }


    public double abs() {
        Complex comp = new Complex(real, imag);
        return Math.hypot(comp.real, comp.imag);
    }

    //Result of (a+bi) + (c+di) = (a+c) + (b+d)i
    public Complex add(Complex other) {
        return new Complex(real + other.real, imag + other.imag);
    }

    public Complex add(double complex) {
        return new Complex(real  + complex, imag);
    }

    public String toString() {
        return real + " + " + imag + "i";
    }

    //Result of (a+bi) * (c+di) = (ac - bd) + (ad + bc)i
    public Complex multiply(Complex other) {
        double newReal = (real * other.real) - (imag * other.imag);
        double newImag = (real * other.imag) + (imag * other.real);
        return new Complex(newReal, newImag);
    }

    //Result of (a+bi) * (di) = (ad)i - (bd)
    public Complex multiply(double complex) {
        double newReal = (real * complex);
        double newImag = (imag * complex);
        return new Complex(newReal, newImag);
    }

    public double getReal() {
        return real;
    }

    public double getComplex() {
        return imag;
    }

    public boolean equals(Object x) {
        if(x instanceof Complex) {
            Complex other = (Complex)x;
            return (Math.abs(real - other.real) < 0.00000000 && (Math.abs(imag - other.imag)) < 0.000000000);
        }
        return false;
    }
}
