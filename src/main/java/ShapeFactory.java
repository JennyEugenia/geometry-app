public class ShapeFactory {

    public Shape createShape(String type, double[] params) {

        switch (type) {

            case "circle":
                return new Circle(params[0]);

            case "rectangle":
                return new Rectangle(params[0], params[1]);

            /*case "triangle":
                return new Triangle(params[0], params[1], params[2]);*/

            default:
                throw new IllegalArgumentException("Unknown shape: " + type);
        }
    }
}

