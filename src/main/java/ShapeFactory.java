public class ShapeFactory {

        public Shape createShape(int type, double[] params) {

            switch (type) {

                case 1:
                    return new Circle(params[0]);

                case 2:
                    return new Rectangle(params[0], params[1]);

                case 3:
                    return new Triangle(params[0], params[1], params[2]);

                default:
                    throw new IllegalArgumentException("Invalid shape type: " + type);
            }
        }
    }
}

