 /********************************************************
* Name: Yamal Marquez Cuevas                              *
* Proyect: PrintPurchaseOrder.java                        *
* Description:this program calculates and prints purcahse *
* around amount                                           *
 *******************************************************/
 import java.util.Scanner;
 public class PrintPurchaseOrder {
   public static void main (String[] args) {
     Scanner userData = new Scanner (System.in);
     double price;
     System.out.println("Enter the Price");
     price = userData.nextDouble();
     int quantity;
     System.out.println("Enter the quantity");
     quantity = userData.nextInt();
     System.out.println("Total purchase order: ---------- $" + price * quantity);
   } //end main
 }//end class PrintPurchaseOrder
