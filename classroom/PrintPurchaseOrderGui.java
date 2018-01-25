 /********************************************************
* Name: Yamal Marquez Cuevas                              *
* Proyect: PrintPurchaseOrderGui.java                     *
* Description:this program calculates and prints purcahse *
* order report                                            *
 ********************************************************/
 import javax.swing.JOptionPane;
 public class PrintPurchaseOrderGui {
   public static void main(String[] args) {
     String itemName; //Name purchase item
     double price; //Price of purchase item
     int quantity; //Number of item purchase
     itemName = JOptionPane.showInputDialog("Enter name of purchase item:");
     price = Double.parseDouble(JOptionPane.showInputDialog("Enter price of purchase order:"));
     quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity"));
     JOptionPane.showMessageDialog(null,"Purchase Order: \n\n Item: " + itemName + "\n Price: " + price + "\n Quantity: " + quantity + "\n Total: " + price * quantity);
   }//end main
 }//end class PrintPurchaseOrderGui
