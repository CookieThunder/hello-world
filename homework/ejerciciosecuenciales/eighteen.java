 /*****************************************************************************
* Name: Yamal Marquez Cuevas                                                   *
* Proyect: eighteen.java                                                       *
* Description: this program determines the payment that a person must make for *
* the total cubic meters that he consumes of water when filling a pool         *
 *****************************************************************************/
 public class eighteen {
   public static void main(String[] args) {
     float albercaAltura = 10;//Esta es la altura de la alberca en metros
     float albercaLargo = 25;//Esta es la base (largo) de la añberca en metros
     float albercaAncho = 20;//Esta es la medida del ancho de la alberca en metros
     float metroCubicoCosto = 60;//Costo por metro cubico que se consume
     float albercaVolumen = albercaAltura * albercaLargo * albercaAncho;//Volumen de la alberca en metros cubicos
     float pagoPorConsumo = albercaVolumen * metroCubicoCosto;//Total a pagar por el consumo de agua en metros cubicos
     System.out.println("-Altura de la Alberca: " + albercaAltura);
     System.out.println("-Medida del largo de la alberca: " + albercaLargo);
     System.out.println("-Medida del ancho de la alberca: " + albercaAncho);
     System.out.println("-Costo por metro cubico consumido: " + metroCubicoCosto);
     System.out.println("-Volumende la alberca: " + albercaVolumen);
     System.out.println("-Pago total por metro cubico consumido de agua: " + pagoPorConsumo);
   }
 }
