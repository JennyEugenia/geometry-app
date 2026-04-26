import java.util.Scanner;

public class ConsoleUI {

   Scanner scanner = new Scanner(System.in);

    public int start() {
        System.out.println("Choose shape: circle / rectangle");
        System.out.println("\n 🧮 Geometry Calculator 🧮 ");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle ");
        System.out.println("0. Exit");

        return scanner.nextInt();
    }

}
