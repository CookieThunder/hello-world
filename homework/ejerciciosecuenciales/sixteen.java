 /*******************************************************************
* Name: Yamal Marquez Cuevas                                         *
* Proyect: sixteen.java                                              *
* Description: this program determines the weekly salary of a worker *
 *******************************************************************/
import java.util.Scanner;
 public class sixteen {
   public static void main(String[] args) {
     Scanner userData = new Scanner(System.in);
     int horasTrabajadas = 40;//Horas trabajadas a las semana
     System.out.println("Enter the hours worked");
     horasTrabajadas = userData.nextInt();
     float pagoPorHora = 100;//Pago por cada hora trabajadas
     System.out.println("Enter the hourly payment");
     pagoPorHora = userData.nextFloat();
     float sueldoSemanal = (float)horasTrabajadas * pagoPorHora;//Pago sueldoSemanal
     System.out.println("Horas de trabajo a la semana: "+horasTrabajadas);
     System.out.println("Pago por hora: "+pagoPorHora);
     System.out.println("Sueldo Semanal Total: "+sueldoSemanal);
   }//end main
 }//end class sixteen
