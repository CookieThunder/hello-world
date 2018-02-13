 /*******************************************************************************
* Author: Yamal Marquez Cuevas ***************************************************
* Project: TwoSix.java ***********************************************************
* Description: this program determines the budget                               **
 *******************************************************************************/
 import javax.swing.JOptionPane;
 public class TwoSix {
   public static void main(String[] args) {
     int NP; //Number of people
     double TOT; //Total to pay
     double cost = 0;
     NP = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of people"));

     if (NP <= 200){
       cost = 95.0;
     }else if (NP > 200 && NP <= 300){
       cost = 85.0;
     }else if (NP > 300){
       cost = 75.0;
     }else {
       JOptionPane.showMessageDialog(null, "The value is not correct");
     }//end else

     TOT = NP * cost;
     JOptionPane.showMessageDialog(null, "Cost per dish is: $"+cost +"\nTotal to pay: $"+TOT);
   }//end main
 }//end class TwoSix
