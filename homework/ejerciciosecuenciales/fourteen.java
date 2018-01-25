 /*****************************************************
* Name: Yamal Marquez Cuevas                           *
* Proyect: fourteen.java                               *
* Description: this program calculed the area          *
 *****************************************************/
import java.util.Scanner;
 public class fourteen {
   public static void main(String[] args) {
     Scanner userData = new Scanner(System.in);
     final double PI = 3.1415926535897932384626433;
     double radioAndBase;//Base del triangulo rectangulo y radio de la circunferencia
     System.out.println("Enter the base of rectangle and circumfrerense radio");
     radioAndBase = userData.nextDouble();
     double hipotenusa;//Hipotenusa del triangulo
     System.out.println("Enter the hypotenuse");
     hipotenusa = userData.nextDouble();
     double altura = Math.sqrt(Math.pow(hipotenusa,2)-Math.pow(radioAndBase,2));//Fórmula para hallar el cateto faltante
     double areaTriangulo = radioAndBase * altura;//No dividí entre 2 porque son dos triangulos rectangulos, que forman un rectangulo
     double areaCircular = (Math.pow(radioAndBase, 2) * PI) / 2;// Area del Circulo
     double areaTotal = areaTriangulo + areaCircular;//Area total de la figura
     System.out.println("-Radio y Base: " + radioAndBase + " -Hipotenusa: " + hipotenusa + " -Cateto (altura): " + altura );
     System.out.println("-Area del triangulo: " + areaTriangulo);
     System.out.println("-Area del Circulo: " + areaCircular);
     System.out.println("-Area Total de la figura: " + areaTotal);
   }//end main
 }//end class fourteen
