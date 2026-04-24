import java.awt.*;

public class Circle implements Shape {
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

}
