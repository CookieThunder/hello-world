 /***************************************************************************
* Author: Yamal Marquez Cuevas ***********************************************
* Project: TwoTwo.java *******************************************************
* Description: this program determine if it is a positive or negative number *
 ***************************************************************************/
 import javax.swing.JOptionPane;
 public class TwoTwo {
   public static void main(String[] args) {
     int number;
     String  valueSign;

     number = Integer.parseInt(JOptionPane.showInputDialog("Enter your number"));

     if (number < 0) {
       valueSign = "Negative";
     } else {
       valueSign = "Positive";
     }//end if

     JOptionPane.showMessageDialog(null, "The number is " + valueSign + " and your number is " + number);
   }//end nmain
 }//end class
