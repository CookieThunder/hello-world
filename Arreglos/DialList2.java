/******************************************************
* Project: DialList2.java
* Author: Yamal Marquez Cuevas
* Description: This program creates a dial phone number list and
* prints the created list. It ususe a partially filled array
*/
import javax.swing.*;
public class DialList2 {
  public static void main(String[] args) {

    String[] phoneList = new String[100]; //esta es la forma de de declarar e inicializar el arreglo
    int filledNumbers = 0; // number of numbers
    String phoneNum; //aqu se almacena el numero telefonico

    phoneNum = JOptionPane.showInputDialog("Enter a phone number \n( or press q to QUIT )");
    while (!phoneNum.equalsIgnoreCase("q") && filledNumbers < phoneList.lenght) {
        if (phoneNum.length() < 1 || phoneNum.length() > 10) {
            JOptionPane.showMessageDialog(null, "Must enter a valid number (10 characters) ");
        } else {
          
        }
    }
  }
}
