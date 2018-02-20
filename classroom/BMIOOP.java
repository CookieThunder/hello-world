/*************************
BIMOOP.java

Alexis Rene Olivares Cabrera
This class calculates the Body Mass Index
**************************/
import javax.swing.*;

public class BMIOOP{
//properties- attributes
  private String name;
  private int age;
  private double weigth;//in punds
  private double heigth;//in inches
  private final double KILOGRAMS_PER_POUND= 0.45359237;
  private final double METERS_PER_INCH= 0.0254;

  //methods - Actions
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    return this.age;
  }
  public void setWeigth(double weigth){
    this.weigth = weigth;
  }
  public double getWeigth(){
    return this.weigth;
  }
  public void setHeigth(){
    this.heigth = heigth;
  }
  public double getHeigth(){
    return this.heigth;
  }


  public double getBMI(){
    double bmi= this.weigth*KILOGRAMS_PER_POUND/((this.heigth*METERS_PER_INCH))*(this.heigth*METERS_PER_INCH);
    return Math.round(bmi*100) /100;
    }


    public static void main(String[] args) {

      BMIOOP newRegistry = new BMIOOP();

      String registryName = JOptionPane.showInputDialog("Enter your name");
      newRegistry.setName(registryName);
      int registryAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
      newRegistry.setAge(registryAge);
      double registryWeight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight in pounds"));
      newRegistry.setWeigth(registryWeight);
      double registryHeight = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in inches"));
      newRegistry.setHeigth(registryHeight);

      JOptionPane.showMessageDialog(null, "Name: " + newRegistry.getName() + "\nAge: " + newRegistry.getAge() + "\nWeight: " + newRegistry.getWeigth() + "\nHeight: " + newRegistry.getHeigth() + "\nBody Mass Index: " + newRegistry.getBMI() );
    }
}
