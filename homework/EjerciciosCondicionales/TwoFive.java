 /*******************************************************************************
* Author: Yamal Marquez Cuevas ***************************************************
* Project: TwoFive.java **********************************************************
* Description: this program determines wich of the three numbers is the greatest *
 *******************************************************************************/
 import javax.swing.JOptionPane;
 public class TwoFive {
   public static void main(String[] args) {
     int valueOne, valueTwo, valueThree, greaterValue = 0;
     valueOne = Integer.parseInt(JOptionPane.showInputDialog("Enter the first value")) ;
     valueTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter the second value"));
     valueThree = Integer.parseInt(JOptionPane.showInputDialog("Enter the third value"));

     if (valueOne > valueTwo && valueOne > valueThree) {
       greaterValue = valueOne;
     }
     if (valueTwo > valueOne && valueTwo > valueThree) {
       greaterValue = valueTwo;
     }
     if (valueThree > valueOne && valueThree > valueTwo) {
       greaterValue = valueThree;
     }

     JOptionPane.showMessageDialog(null, "The greater value is: " + greaterValue);
   }//end main
 }//end class
