
/**
 * Write a description of class Pentagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pentagon extends Square
{
    //private double length = 0;

 public Pentagon(String c, boolean f, double l) {
     super(c,f,l);
 }

 public double calculateArea(){
     double calc1 = (((Math.sqrt(5)*2) + 5) * 5);
     double calc2 = (Math.sqrt(calc1) * (0.25)) * Math.pow(getLength(),2);
     return calc2;
 }
 public double calculatePerimeter(){
     return getLength() * 5;
 }
}
