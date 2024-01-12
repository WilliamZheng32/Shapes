
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle extends Shape {
    
private double side1,side2,side3 = 0;

 public Triangle(String c, boolean f, double s1, double s2, double s3) { 
     super(c,f);
     side1 = s1;
     side2 = s2;
     side3 = s3;
 }
 public double getSide1(){
     return side1;
 }
 public double getSide2(){
     return side2;
 }
 public double getSide3(){
     return side3;
 }

 public void changeSide1(double s1){
     side1 = s1;
 }
 public void changeSide2(double s2){
     side2 = s2;
 }
 public void changeSide3(double s3){
     side3 = s3;
 }
 public double calculatePerimeter(){
     return side1 + side2 + side3;
 }
 public double calculateArea(){
     double s = calculatePerimeter()/2;
     double calc = s * (s-side1) * (s-side2) * (s-side3);
     double ans =Math.sqrt(calc);
     return ans;
 }
 
}
