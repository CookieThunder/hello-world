 /*****************************************************
* Author: Yamal Marquez Cuevas                         *
* Project: FreeFries.java                              *
* Description: this program reads points scored by     *
* home team and the opposing team and determines IF    *
* the fans wins                                        *
 *****************************************************/
 import javax.swing.JOptionPane;

 public class FreeFries {
   public static void main(String[] args) {

     int homePoints;
     int opponentPoints;
     homePoints = Integer.parseInt(JOptionPane.showInputDialog("Enter home points"));
     opponentPoints = Integer.parseInt(JOptionPane.showInputDialog("Enter opponent points"));

     if (homePoints > opponentPoints && homePoints >= 150) {
      JOptionPane.showMessageDialog(null, "A free order of french fries for white Tigers fans");
    }// end if
  }// end main
}// end class
