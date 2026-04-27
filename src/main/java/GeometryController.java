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

                int choiceShape = ui.getMenuChoice();

                if (choiceShape == 0) {
                    break;
                }
                double[] numberInput = ui.readShapeInput(choiceShape); // ui called the method from ConsoleUI
                Shape shape = factory.createShape(choiceShape, numberInput); //factory called method createShape from Shape Factory
                ui.showResult(shape);
            }
        }
    }
