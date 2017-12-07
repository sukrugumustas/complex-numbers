public class ComplexNumber implements Number {
    private double real;
    private double imaginary;

    public ComplexNumber() {
        real = 0;
        imaginary = 0;
    }

    private ComplexNumber(double real) {
        this.real = real;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double absv() {
        return Math.hypot(real, imaginary);
    }

    public ComplexNumber add(ComplexNumber complexnumber) {
        return new ComplexNumber(real + complexnumber.getReal(), imaginary + complexnumber.getImaginary());
    }

    public ComplexNumber subtract(ComplexNumber complexnumber) {
        return new ComplexNumber(real - complexnumber.getReal(), imaginary - complexnumber.getImaginary());
    }

    public ComplexNumber multiply(ComplexNumber complexnumber) {
        double newReal, newImaginary;
        newReal = real * complexnumber.getReal() - imaginary * complexnumber.getImaginary();
        newImaginary = real * complexnumber.getImaginary() + imaginary * complexnumber.getReal();
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber complexnumber) {
        if (real == complexnumber.getReal() && imaginary == complexnumber.getImaginary()) {
            return new ComplexNumber(1);
        }
        double newReal, newImaginary, divider;
        divider = Math.pow(complexnumber.absv(), 2);
        newReal = (real * complexnumber.getReal() + imaginary * complexnumber.getImaginary()) / divider;
        newImaginary = ((real * complexnumber.getImaginary() * -1) + imaginary * complexnumber.getReal()) / divider;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber compareToMinimum(ComplexNumber complexnumber) {
        if (this == complexnumber || this.absv() <= complexnumber.absv()) {
            return this;
        }
        return complexnumber;
    }

    public ComplexNumber compareToMaximum(ComplexNumber complexNumber) {
        if (this == complexNumber || this.absv() > complexNumber.absv()) {
            return this;
        }
        return complexNumber;
    }

    public String toString() {
        if (this.real != 0 && this.imaginary != 0) {
            if (this.imaginary < 0) {
                return this.real + " " + this.imaginary + "i";
            } else {
                return this.real + " + " + this.imaginary + "i";
            }
        } else if (this.real == 0 && this.imaginary != 0) {
            return this.imaginary + "i";
        } else if (this.real != 0 && this.imaginary == 0) {
            return Double.toString(this.real);
        } else {
            return "0";
        }
    }
}