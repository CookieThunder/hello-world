 /*****************************************************
* Name: Yamal Marquez Cuevas                           *
* Proyect: fifeteen.java                               *
* Description: this program calculed the production    *
 *****************************************************/
 public class fifeteen {
   public static void main(String[] args) {
     double litrosProducidos = 9.5;//Cantidad de litros que produce
     double precioGalon = 80;//Precio del galón
     final double equivalencia = 3.785;//Equivalencia a un galón en litros
     double galonesProducidos = litrosProducidos / equivalencia;//Comversion de litros a galones
     double ganancia = galonesProducidos * precioGalon;//Ganancia por la entrega de lechita
     System.out.println("-Litros producidos: " + litrosProducidos + " -Precio por Galón : " + precioGalon);
     System.out.println("-1 galón equivale a " + equivalencia);
     System.out.println("-Ganacia: " + ganancia);
   }
 }
