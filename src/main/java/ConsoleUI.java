import java.util.Scanner;

public class ConsoleUI {

    private final Scanner scanner = new Scanner(System.in);


    public int getMenuChoice() {
        System.out.println("\n 🧮 Geometry Calculator 🧮 ");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle ");
        System.out.println("0. Exit");

        return readInt();
    }

    public double[] getParameterForShape(int choice) {

        try {
            switch (choice) {
                case 1 -> {
                    System.out.println("Insert radius number:");
                    return new double[]{readDouble()};

                }

                case 2 -> {
                    System.out.println("Insert width number:");
                    double w = readDouble();
                    System.out.println("Insert height number:");
                    double h = readDouble();
                    return new double[]{w, h};
                }
                case 3 -> triangle();
                case 4 -> {
                }
                default -> printError("Invalid shape");
            }
        } catch (Exception e) {
            printError(e.getMessage());
        }
        return new double[0];
    }

    private void triangle() {
    }
    public void showResult(Shape shape) {
        System.out.printf("Area: %.2f%n", shape.calculateArea());
        System.out.printf("Perimeter: %.2f%n", shape.calculateCircumference());
    }

    private int readInt() {
        while (!scanner.hasNextInt()) {
            printError("Indtast et tal!");
            scanner.next();
        }
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    private void printError(String message) {
        System.out.println(" Fejl: " + message);
    }
    private double readDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Enter a valid number!");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}