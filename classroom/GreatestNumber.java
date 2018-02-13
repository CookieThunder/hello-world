 /**************************************************************
* Author: Yamal Marquez Cuevas                                  *
* Project: GreatestNumber                                       *
* Description: this program finds the greatest of three numbers *
 **************************************************************/
import javax.swing.JOptionPane;

public class GreatestNumber {
  public static void main(String[] args) {

    double numberOne, numberTwo, numberThree;
    numberOne = Double.parseDouble(JOptionPane.showInputDialog("Enter the firts number"));
    numberTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));
    numberThree = Double.parseDouble(JOptionPane.showInputDialog("Enter the third nummber"));

    if (numberOne > numberTwo) {
      if (numberOne > numberThree) {
        JOptionPane.showMessageDialog(null, "The greatest number is " + numberOne);
      }
    }//end if

    if (numberTwo > numberOne) {
      if (numberTwo > numberThree) {
        JOptionPane.showMessageDialog(null, "The greatest number is " + numberTwo);
      }
    }//end if

    if (numberThree > numberOne) {
      if (numberThree > numberTwo) {
        JOptionPane.showMessageDialog(null, "The greatest number is " + numberThree);
      }
    }//end if
//Otra manera de hacerlo
    if (numberOne > numberTwo && numberOne > numberThree) {
      JOptionPane.showMessageDialog(null, "The greatest number is " + numberOne);
    }//end if

    if (numberTwo > numberOne && numberTwo > numberThree) {
      JOptionPane.showMessageDialog(null, "The greatest number is " + numberTwo);
    }//end if

    if (numberThree > numberTwo && numberThree > numberOne) {
      JOptionPane.showMessageDialog(null, "The greatest number is " + numberThree);
    }
  }//end main
}//end class
