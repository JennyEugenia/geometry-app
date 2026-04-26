import java.util.Scanner;

public class ConsoleUI {

    private Scanner scanner = new Scanner(System.in);


    public int start() {
        System.out.println("\n 🧮 Geometry Calculator 🧮 ");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle ");
        System.out.println("0. Exit");

        int choice = readInt();

        try {
            switch (choice) {
                case 1 -> circle();
                case 2 -> rectangle();
                case 3 -> triangle();
                case 4 -> {
                    return choice;
                }
                default -> printError("Ugyldigt valg");
            }
        } catch (Exception e) {
            printError(e.getMessage());
        }
        return choice;
    }

    private void triangle() {
    }

    private void rectangle() {
    }

    private void circle() {
        System.out.print("Inset radius number");
        int number = scanner.nextInt();

        Circle circle = new Circle(number);
        circle.calculateArea();
    }


    private int readInt () {
            while (!scanner.hasNextInt()) {
                printError("Indtast et tal!");
                scanner.next();
            }
            int number = scanner.nextInt();
            scanner.nextLine();
            return number;
        }

        private void printError (String message){
            System.out.println(" Fejl: " + message);
        }

}