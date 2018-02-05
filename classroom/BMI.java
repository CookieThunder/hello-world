 /********************************************************
* Author: Yamal Marque cuevas                             *
* Project: BMI.java                                       *
* Description: this programcalculates the Body Mass Index *
 ********************************************************/
 import javax.swing.JOptionPane;
 public class BMI {
   public static void main(String[] args) {

     float weight, height;
     weight = Float.parseFloat(JOptionPane.showInputDialog("Enter your WEIGHT in pounds"));
     height = Float.parseFloat(JOptionPane.showInputDialog("Enter your HEIGHT in inches"));

     final double KILOGRAMS_PER_POUNDS = 0.45359237;
     final double METERS_PER_INCH = 0.0254;

     double weightInKilograms = weight * KILOGRAMS_PER_POUNDS;
     double heightInMeters = height * METERS_PER_INCH;
     double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

     if (bmi < 16) {
       JOptionPane.showMessageDialog(null, "You are seriously under weight");
     }else if (bmi < 18) {
       JOptionPane.showMessageDialog(null, "You are under weight");
     }else if (bmi < 24) {
       JOptionPane.showMessageDialog(null, "You are normal weight");
     }else if (bmi < 29) {
       JOptionPane.showMessageDialog(null, "You are over weight");
     }else if (bmi < 35) {
       JOptionPane.showMessageDialog(null, "You are seriously over weight");
     }else {
       JOptionPane.showMessageDialog(null, "You are gravely over weigth");
     }//end if

   }//end main
 }//end class
