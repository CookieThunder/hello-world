 /*****************************************************
* Name: Yamal Marquez Cuevas                           *
* Proyect: fifeteen.java                               *
* Description: this program calculed the production    *
 *****************************************************/
import java.util.Scanner;
 public class fifeteen {
   public static void main(String[] args) {
     Scanner userData = new Scanner (System.in);
     double litrosProducidos;//Cantidad de litros que produce
     System.out.println("Enter the liters");
     litrosProducidos = userData.nextDouble();
     double precioGalon;//Precio del galón
     System.out.println("Enter the price");
     precioGalon = userData.nextDouble();
     final double GALON = 3.785;//Equivalencia a un galón en litros
     double galonesProducidos = litrosProducidos / GALON;//Comversion de litros a galones
     double ganancia = galonesProducidos * precioGalon;//Ganancia por la entrega de lechita
     System.out.println("-Litros producidos: " + litrosProducidos + " -Precio por Galón : " + precioGalon);
     System.out.println("-1 galón equivale a " + GALON);
     System.out.println("-Ganacia: " + ganancia);
   }//end main
 }//end class fifeteen
