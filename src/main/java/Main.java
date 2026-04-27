import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                ConsoleUI ui = new ConsoleUI(); // initiate the ui-klass
                ShapeFactory factory = new ShapeFactory(); // initiate shape factory
        //Dependency injection
                GeometryController controller = new GeometryController(ui, factory);
//start kontroller , der kører programet
                controller.run();
    }
}


