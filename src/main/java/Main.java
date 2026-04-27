import java.util.Scanner;
//kode der skal refactors
public class Main {

    public static void main(String[] args) {
        //WTF
                ConsoleUI ui = new ConsoleUI();
                ShapeFactory factory = new ShapeFactory();
                GeometryController controller = new GeometryController(ui, factory);

                controller.run();
    }
}


