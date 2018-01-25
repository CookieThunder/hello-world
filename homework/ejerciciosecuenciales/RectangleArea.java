 /***********************************************************
* Name: Yamal Marquez Cuevas                                 *
* Proyect: RectangleArea.java                                *
* Description: this program calculed the area of a rectangle *
 ***********************************************************/
import java.util.Scanner;
 public class RectangleArea {
  public static void main (String[]args) {
    Scanner userData = new Scanner (System.in);
    double alturaRectangulo;
    System.out.println("Enter the rectangle height");
    alturaRectangulo = userData.nextDouble();
    double baseRectangulo;
    System.out.println("Enter the rectangle weight");
    baseRectangulo = userData.nextDouble();
    double areaRectangulo = alturaRectangulo * baseRectangulo;
    System.out.println("Medida de la base: " + baseRectangulo);
    System.out.println("Medida de la altura: " + alturaRectangulo);
    System.out.println("Area: " + areaRectangulo);
  }//end main
}//end class RectangleArea
