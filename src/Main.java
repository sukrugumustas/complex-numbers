public class Main {

    public static void main(String[] args) {
        ComplexNumber[] cnArray = new ComplexNumber[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Complex Number " + (i + 1) + "\n");
            cnArray[i] = Number.createComplexNumber();
            System.out.println();
        }
        Number.scanner.close();
        System.out.println("----------------------------------- OPERATIONS -----------------------------------\n");
        System.out.println("--------------------------------- Minimum/Maximum --------------------------------");
        System.out.println("The minimum complex number is " + Number.minimum(cnArray).toString() + " and the maximum is " + Number.maximum(cnArray).toString() + ".\n");
        System.out.println("-------------------------------- Absolute Values ---------------------------------");
        Number.absoluteValues(cnArray);
        System.out.println("\n------------------------------------ Additions -----------------------------------");
        Number.addComplexNumbers(cnArray);
        System.out.println("\n---------------------------------- Subtractions ----------------------------------");
        Number.subtractComplexNumbers(cnArray);
        System.out.println("\n--------------------------------- Multiplications --------------------------------");
        Number.multiplyComplexNumbers(cnArray);
        System.out.println("\n----------------------------------- Divisions ------------------------------------");
        Number.divideComplexNumbers(cnArray);
    }
}