 /*****************************************************
* Name: Yamal Marquez Cuevas                           *
* Proyect: Circumference.java                          *
* Description: this program calculed the Circumference *
 *****************************************************/
import java.util.Scanner;
 public class Circumference {
   public static void main(String[] args) {
     Scanner inputData = new Scanner(System.in);
     final double PI = 3.1415926535897932384626433;
     double radio;
     System.out.println("Enter the Circumference radio");
     radio = inputData.nextDouble();
     double areaCirculo = PI * Math.pow(radio, 2);
     System.out.println("Radio: " + radio);
     System.out.println("Area del circulo: " + areaCirculo);
   }//end main
 }//enda class Circumference
