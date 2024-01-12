
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape {
    
private double radius = 0;

 public Circle(String c, boolean f, double r) {
     super(c,f);
     radius = r;
 }
 public double getRadius(){
     return radius;
 }
 public void changeRadius(double r){
     radius = r;
 }
 public double calculateArea(){
     double calc = Math.PI * radius * radius;
     return calc;
 }
 public double calculatePerimeter(){
     return 2 * Math.PI * radius;
 }
}
