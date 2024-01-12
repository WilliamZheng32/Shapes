
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape{
private double length,width = 0;

 public Rectangle(String c, boolean f, double l, double w) {
     super(c,f);
     length = l;
     width = w;
 }
 public double getLength(){
     return length;
 }
 public double getWidth(){
     return width;
 }
 public void changeLength(double l){
     length = l;
 }
 public double calculateArea(){
     return length * width;
 }
 public double calculatePerimeter(){
     return 2 * length + 2 * width;
 }
}
