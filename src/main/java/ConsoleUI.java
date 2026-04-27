import java.util.Scanner;

public class ConsoleUI {

        private final Scanner scanner = new Scanner(System.in);

        public int getMenuChoice() {
            System.out.println("\n🧮 Geometry Calculator 🧮");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("0. Exit");

            return readInt();
        }

        public double[] getParameters(int choice) {

            switch (choice) {

                case 1 -> {
                    System.out.println("Enter radius:");
                    return new double[]{readDouble()};
                }

                case 2 -> {
                    System.out.println("Enter width:");
                    double w = readDouble();

                    System.out.println("Enter height:");
                    double h = readDouble();

                    return new double[]{w, h};
                }

                case 3 -> {
                    System.out.println("Enter side A:");
                    double a = readDouble();

                    System.out.println("Enter side B:");
                    double b = readDouble();

                    System.out.println("Enter side C:");
                    double c = readDouble();

                    return new double[]{a, b, c};
                }

                default -> throw new IllegalArgumentException("Invalid choice");
            }
        }

        public void showResult(Shape shape) {
            System.out.printf("Area: %.2f%n", shape.calculateArea());
            System.out.printf("Perimeter: %.2f%n", shape.calculateCircumference());
        }

        private int readInt() {
            while (!scanner.hasNextInt()) {
                System.out.println("Enter a valid number!");
                scanner.next();
            }
            return scanner.nextInt();
        }

        private double readDouble() {
            while (!scanner.hasNextDouble()) {
                System.out.println("Enter a valid number!");
                scanner.next();
            }
            return scanner.nextDouble();
        }
    }
