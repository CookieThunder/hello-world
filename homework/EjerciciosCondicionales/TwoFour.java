 /***********************************************************************
* Author: Yamal Marquez Cuevas *******************************************
* Project: TwoFour.java **************************************************
* Description: this program determines the final price                   *
 ***********************************************************************/
 import javax.swing.JOptionPane;
 public class TwoFour {
   public static void main(String[] args) {
     double costCostume, discount, total;
     costCostume = Double.parseDouble(JOptionPane.showInputDialog("Enter the cost of costume"));
     if (costCostume > 2500) {
       discount = 0.15 * costCostume;
     } else {
       discount = 0.08 * costCostume;
     }//end if
     total = costCostume - discount;
     JOptionPane.showMessageDialog(null, "Cost of costume: ___ $" + costCostume + "\nDiscount: ___$" + discount + "\nTotal to pay: ___$" + total);
   }//end main
 }//end class
