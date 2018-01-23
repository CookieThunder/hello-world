  /*********************************************************************************
* Name: Yamal Marquez Cuevas                                                        *
* Proyect: seventeen.java                                                           *
* Description: this program determines how many inches you need based on the meters *
 **********************************************************************************/
 public class seventeen {
   public static void main(String[] args) {
     double pulgadaEnMetros = 0.0254;//Valor de una pulgada en metros
     float metrosCantidad = 40;//Metros que necesita
     double pulgadasAPedir = (double)metrosCantidad  / pulgadaEnMetros;//Conversion de Metros a Pulgadas
     System.out.println("Cantidad de Tela: " + metrosCantidad + " metro(s)");
     System.out.println("1 pulgada equivale a " + pulgadaEnMetros + " metros");
     System.out.println("Pulgadas a Pedir: " + pulgadasAPedir + "pulgada(s)");
   }
 }
