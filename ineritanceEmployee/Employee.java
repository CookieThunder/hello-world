/***********************************************************
* Employee.java
* Yamal Marquez Cuevas
*
***********************************************************/
import javax.swing.*;

public abstract class Employee {
  protected String name;

  public Employee(String name) {
    this.name = name;
  }

  public abstract double getPay();

  public void printPay (int date) {
    JOptionPane.showMessageDialog(null, "Hardcodeo");
  }
}
