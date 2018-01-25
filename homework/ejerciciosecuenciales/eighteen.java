 /*****************************************************************************
* Name: Yamal Marquez Cuevas                                                   *
* Proyect: eighteen.java                                                       *
* Description: this program determines the payment that a person must make for *
* the total cubic meters that he consumes of water when filling a pool         *
 *****************************************************************************/
import  java.util.Scanner;
 public class eighteen {
   public static void main(String[] args) {
     Scanner  datos = new Scanner(System.in);
     float albercaAltura;//Esta es la altura de la alberca en metros
     System.out.println("Enter the pool height");
     albercaAltura = datos.nextFloat();
     float albercaLargo;//Esta es la base (largo) de la añberca en metros
     System.out.println("Enter the pool lenght");
     albercaLargo = datos.nextFloat();
     float albercaAncho;//Esta es la medida del ancho de la alberca en metros
     System.out.println("Enter the pool width");
     albercaAncho = datos.nextFloat();
     float metroCubicoCosto;//Costo por metro cubico que se consume
     System.out.println("Enter the price");
     metroCubicoCosto = datos.nextFloat();
     float albercaVolumen = albercaAltura * albercaLargo * albercaAncho;//Volumen de la alberca en metros cubicos
     float pagoPorConsumo = albercaVolumen * metroCubicoCosto;//Total a pagar por el consumo de agua en metros cubicos
     System.out.println("-Altura de la Alberca: " + albercaAltura);
     System.out.println("-Medida del largo de la alberca: " + albercaLargo);
     System.out.println("-Medida del ancho de la alberca: " + albercaAncho);
     System.out.println("-Costo por metro cubico consumido: " + metroCubicoCosto);
     System.out.println("-Volumen de la alberca: " + albercaVolumen);
     System.out.println("-Pago total por metro cubico consumido de agua: " + pagoPorConsumo);
   }//end main
 }//end class eighteen
