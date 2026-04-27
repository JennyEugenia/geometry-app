public class Triangel implements Shape {
    private double a;
    private double b;
    private double base;
    private double height;
//
    public Triangel(double a, double b, double base, double height){
        this.a = a;
        this.b = b;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;

    }
    @Override
    public double calculateCircumference(){
        return a + b + base;
    }
}
