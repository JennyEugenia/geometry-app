import com.sun.source.tree.TryTree;

public class Circle implements Shape {

private  double try2;
 private double radius;

 Circle(double radius){
     this.radius = radius;
 }

 public double getRadius(){
     return radius;
 }

    @Override
    public double calculateArea() {
      return Math.PI * radius * radius;
    }

    @Override
    public double calculateCircumference() {
        return  2 * Math.PI * radius;
    }
}


