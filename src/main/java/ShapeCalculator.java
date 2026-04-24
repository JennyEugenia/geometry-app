public class ShapeCalculator {
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }
}
