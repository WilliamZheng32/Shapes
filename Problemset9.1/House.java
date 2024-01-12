
/**
 * Write a description of class House here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House extends Square 
{
 
    //private double length= 0;

 public House(String c, boolean f, double l) {
     super(c, f, l);
 }

 public double calculateArea(){
     //area of sqqaure
     double squarea = getLength() * getLength();
     //area of traingle 
     double s = (getLength() * 3)/2;
     double calc = s * ((s-getLength()) * 3);
     double trianglea = Math.sqrt(calc);
     //area of house
     double ans = squarea + trianglea;
     return ans;
 }
 public double calculatePerimeter(){
     return getLength()  * 5;
 }
}
