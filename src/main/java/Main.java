import java.util.Scanner;
//kode der skal refactors
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose shape: circle / rectangle");

        String shape = scanner.nextLine();

        scanner.close();
    }
}
