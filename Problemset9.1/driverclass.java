
/**
 * Write a description of class driverclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class driverclass
{
   public static void main(String[] args){
       
       Shape[] shapes = new Shape[8];
       
       shapes[1] = new Shape("blue",true);
       shapes[2] = new Circle("red", true, 2);
       shapes[3] = new Rectangle("red", false, 2,5);
       shapes[4] = new Triangle("red", true, 3,4,5);
       shapes[5] = new Square("blue", true, 2);
       shapes[6] = new Pentagon("blue", false, 3);
       shapes[7] = new House("blue", true, 5);
       
       for(int i = 1; i < shapes.length; i++) {
       System.out.println(shapes[i].calculatePerimeter());
       System.out.println(shapes[i].calculateArea());
    }
   }
}
