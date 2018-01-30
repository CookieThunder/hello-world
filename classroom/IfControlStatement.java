 /***********************************************************
* Author: Yamal Marquez Cuevas                               *
* Project: IfControlStatement.java                           *
* Description: this program checks for at the end of line    *
 ***********************************************************/
 import javax.swing.JOptionPane;

 public class IfControlStatement {
   public static void main(String[] args) {

     String sentence;
     int lastCharPosition;
     sentence = JOptionPane.showInputDialog("Enter your sentence");
     lastCharPosition = sentence.length() - 1;
     JOptionPane.showMessageDialog(null, lastCharPosition + "  ----- lastCharPosition");
     JOptionPane.showMessageDialog(null, sentence.length() + "  -----  sentence.lenght");
     JOptionPane.showMessageDialog(null, sentence.length() - 1 + "  ----- sentence-length() - 1");

     if (sentence.charAt(lastCharPosition) != '.') {
       JOptionPane.showMessageDialog(null, "Invalid Entry - your sentence needs a period" );
     }//end if
   }//end main
 }//end class
