
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Shape {

    private double length= 0;

 public Square(String c, boolean f, double l) {
     super(c,f);
     length = l;
 }
 public double getLength(){
     return length;
 }

 public void changeLength(double l){
     length = l;
 }
 public double calculateArea(){
     return length * length;
 }
 public double calculatePerimeter(){
     return length  * 4;
 }
}
