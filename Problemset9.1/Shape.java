
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape
{
private String color = "";
private boolean filled = false;

public Shape(String c, boolean f){
    color = c;
    filled = f;
  }
  public double calculateArea(){
      return 0;
  }
  public double calculatePerimeter(){
      return 0;
  }
  public String displayInfo(){
      if(isFilled()) return "The color of the shape is"+color+ "and is filled";
      else return "The color of the shape is"+color+ "and is not filled";
  }
  public String getColor(){
      return color;
  }
  public void changeColor(String c){
      color = c;
  }
   public boolean isFilled(){
      return filled;
  }
  public void changeFilled(boolean f){
      filled = f;
  }
}
