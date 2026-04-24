import java.util.Scanner;
//kode der skal refactors
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeCalculator calculator = new ShapeCalculator();

        System.out.println("Choose shape: circle / rectangle");

        String shape = scanner.nextLine();

        if (shape.equals("circle")) {
            System.out.println("Enter radius:");
            double radius = scanner.nextDouble();

            double area = calculator.calculateCircleArea(radius);
            double circumference = calculator.calculateCircleCircumference(radius);

            System.out.println("Area: " + area);
            System.out.println("Circumference: " + circumference);

        } else if (shape.equals("rectangle")) {
            System.out.println("Enter width:");
            double width = scanner.nextDouble();

            System.out.println("Enter height:");
            double height = scanner.nextDouble();

            double area = calculator.calculateRectangleArea(width, height);
            double perimeter = calculator.calculateRectanglePerimeter(width, height);

            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);

        } else {
            System.out.println("Unknown shape");
        }

        scanner.close();
    }
}
