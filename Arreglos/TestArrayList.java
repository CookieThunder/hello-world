/***************************************
* Project: TestArrayList.java
* Author: Yamal Marquez Cuevas
*
*/

import java.util.TestArrayList;
import javax.swing.*;

public class TestArrayList{
  public static void main(String[] args) {
    ArrayList cityList=new ArrayList();
    cityList.add("London");
    cityList.add("New York");
    cityList.add("Tokyo");
    cityList.add("Miami");
    JOptionPane.showMessageDialog(null,"List size: "+cityList.size());
    JOptionPane.showMessageDialog(null,"Is Miami in this list?"+cityList.contain("Miami"));
    JOptionPane.showMessageDialog(null,"The location of Paris"+cityList.indexOf("Paris"));
    JOptionPane.showMessageDialog(null,"Is this list empty?"+cityList.isEmpty());
    cityList.remove("London");
  }
}
