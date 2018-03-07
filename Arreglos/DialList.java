/***********************************************
* Project: DialList.java
* Author: Yamal Marquez Cuevas
*
*/
import javax.swing.*;
public class DialList {
  public static void main(String[] args) {
    long[] phoneList; //list of phone numbers
    int sizeList; //number of phon numbers
    long phoneNum; //an entered phone number


    sizeList = Integer.parseInt(JOptionPane.showInputDialog("How many phone numbers would you like to enter"));
    phoneList = new long[sizeList]; //aqui es donde se inicializa el arreglo

    for (int i = 0; i < sizeList; i++) {
      phoneNum = Long.parseLong(JOptionPane.showInputDialog("Enter the number phone" ));

      phoneList[i] = phoneNum;
    }
    for (int i = 0; i < sizeList ; i++ ) {
      JOptionPane.showMessageDialog(null, "INDEX ---" + " ELEMENT NUMBER - " + " PHONE NUMBER \n" + ":   " + i + "     -----              " + (i + 1) + "          ------              " + phoneList[i]);
    }
  } // main
}// end class DialList
