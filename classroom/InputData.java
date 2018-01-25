 /*******************************************************
* Name: Yamal Marquez Cuevas                             *
* Proyect: InputData.java                                *
* Description:this program displays a personalized Hello *
* greeting                                               *
 *******************************************************/
 import java.util.Scanner;
 public class InputData {
   public static void main(String[] args) {
     Scanner userData = new Scanner(System.in);
     String name;//Nombre del usuario
     System.out.print("Enter your name: ");
     name = userData.nextLine();
     System.out.println("Hello " + name + "!!!!!!!!!!");
   }//end main
 }//end class InputData
