 /************************************************************
* Author: Yamal Marquez Cuevas ********************************
* Project: TwoOne.java ****************************************
* Description: this program shows the greatest of two numbers *
 ************************************************************/
import javax.swing.JOptionPane;
public class TwoOne {
  public static void main(String[] args) {
    int numberOne, numberTwo, numberLargest;

    numberOne = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
    numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));

    if (numberOne > numberTwo) {
      numberLargest = numberOne;
    } else {
      numberLargest = numberTwo;
    }//end if

    JOptionPane.showMessageDialog(null, "The bigger number is: " + numberLargest);

  }//end main
}//end class
