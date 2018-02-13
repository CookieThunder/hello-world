/*************************************************************************
* Author: Yamal Marquez Cuevas *******************************************
* Project: TwoThree.java *************************************************
* Description: this program determines how much must be paid by x amount *
 ***********************************************************************/
 import javax.swing.JOptionPane;
 public class TwoThree {
   public static void main(String[] args) {
     int amountOfPencils;
     double salePrice;

     amountOfPencils = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of pencils"));

     if (amountOfPencils >= 1000 ) {
      salePrice = 0.85;
    } else {
      salePrice = 0.90;
    }//end if

    JOptionPane.showMessageDialog(null, "Total to pay: ___________ $" + amountOfPencils * salePrice);

  }//end main
}//end class
