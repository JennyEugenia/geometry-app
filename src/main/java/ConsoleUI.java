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

while(true) {
    System.out.println("CalculateArea press 1 | Calculate Circumference press 2");
    int choice = scanner.nextInt();

    if (choice == 1) {
        System.out.println("Inset radius number");
        double radius = scanner.nextInt();
        Circle circle = new Circle(radius);
        double area = circle.calculateArea();
        System.out.printf("Area : %.2f%n", area);
        break;
    } else if (choice == 2) {
        System.out.println("Insert radius number");
        double radius = scanner.nextInt();

        Circle circle = new Circle(radius);
        double circumference = circle.calculateCircumference();
        System.out.printf("Circumference : %.2f%n", circumference);
        break;
    } else {
        System.out.println("Insert the right number!");
        }
}
        start();
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