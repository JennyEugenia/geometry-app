public class GeometryController {


        private final ConsoleUI ui;
        private final ShapeFactory factory;

        public GeometryController(ConsoleUI ui, ShapeFactory factory) {
            this.ui = ui;
            this.factory = factory;
        }

        public void run() {

            while (true) {

                int choice = ui.getMenuChoice();

                if (choice == 0) {
                    break;
                }

                double[] params = ui.getParameters(choice);

                Shape shape = factory.createShape(choice, params);

                ui.showResult(shape);
            }
        }
    }
