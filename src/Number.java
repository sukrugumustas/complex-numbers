import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public interface Number {
    Scanner scanner = new Scanner(System.in);
    double absv();
    static void addComplexNumbers(ComplexNumber[] cnArray) {
        int length = cnArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                System.out.println("The addition of " + cnArray[i].toString() + " and " + cnArray[j].toString() + " is " + cnArray[i].add(cnArray[j]).toString() + ".");
            }
        }
    }

    static void subtractComplexNumbers(ComplexNumber[] cnArray) {
        int length = cnArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                System.out.println("The subtraction of " + cnArray[i].toString() + " and " + cnArray[j].toString() + " is " + cnArray[i].subtract(cnArray[j]).toString() + ".");
            }
        }
    }

    static void multiplyComplexNumbers(ComplexNumber[] cnArray) {
        int length = cnArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                System.out.println("The multiplication of " + cnArray[i].toString() + " and " + cnArray[j].toString() + " is " + cnArray[i].multiply(cnArray[j]).toString() + ".");
            }
        }
    }

    static void divideComplexNumbers(ComplexNumber[] cnArray) {
        int length = cnArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                System.out.println("The division of " + cnArray[i].toString() + " and " + cnArray[j].toString() + " is " + cnArray[i].divide(cnArray[j]).toString() + ".");
            }
        }
    }

    static void absoluteValues(ComplexNumber[] cnArray) {
        for (ComplexNumber x : cnArray) {
            System.out.println("The absolute value of " + x.toString() + " is " + x.absv() + ".");
        }
    }

    @NotNull
    static ComplexNumber createComplexNumber() {
        String real = "", imaginary = "";
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.print("Please enter the real part of complex number: ");
                real = scanner.nextLine();
                if (!isDouble(real)) {
                    --i;
                }
            } else {
                System.out.print("Please enter the imaginary part of complex number: ");
                imaginary = scanner.nextLine();
                if (!isDouble(imaginary)) {
                    --i;
                }
            }
        }
        return new ComplexNumber(Double.parseDouble(real), Double.parseDouble(imaginary));
    }

    static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (Exception ex) {
            System.out.println("You can only enter decimals!");
            return false;
        }
    }

    static ComplexNumber minimum(ComplexNumber[] cnArray) {
        int length = cnArray.length;
        ComplexNumber temp = cnArray[0];
        for (int i = 1; i < length; i++) {
            if (temp.compareToMinimum(cnArray[i]) != temp) {
                temp = cnArray[i];
            }
        }
        return temp;
    }

    static ComplexNumber maximum(ComplexNumber[] cnArray) {
        int length = cnArray.length;
        ComplexNumber temp = cnArray[0];
        for (int i = 1; i < length; i++) {
            if (temp.compareToMaximum(cnArray[i]) != temp) {
                temp = cnArray[i];
            }
        }
        return temp;
    }

}