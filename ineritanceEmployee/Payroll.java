/****************************************
* Project: Payroll.java
* Author: Yamal Marquez Cuevas
*
*/
import javax.swing.*;
public class Payroll {
  public static void main(String[] args) {

    //salaried
    String name = JOptionPane.showInputDialog("Salaried´s name");
    double salary =  Double.parseDouble(JOptionPane.showInputDialog("Salaried´s salary"));

    Employee yamal = new Salaried(name, salary);
    JOptionPane.showMessageDialog(null, yamal.getPay());


    //hourly
    name = JOptionPane.showInputDialog("Hourly´s name");
    double hours = Double.parseDouble(JOptionPane.showInputDialog("Hours worked"));

    Employee pedro = new Hourly(name, hours);
    JOptionPane.showMessageDialog(null, "Pedro´s pay:" + pedro.getPay());
  }
}
