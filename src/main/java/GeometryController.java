public class GeometryController {

        //This Controller depending on these constance attributer
        // This is core “brain” of the application. It's clear structure or control flow.

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
                double[] params = ui.readShapeInput(choice);
                Shape shape = factory.createShape(choice, params);
                ui.showResult(shape);
            }
        }
    }
