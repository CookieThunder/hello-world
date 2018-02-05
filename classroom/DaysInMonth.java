 /**************************************************************
* Author: Yamal Marquez Cuevas                                  *
* Project: DaysInMonth.java                                     *
* Description: This program finds the number of days in a month *
 **************************************************************/
 import javax.swing.JOptionPane;
 public class DaysInMonth {
   public static void main(String[] args) {

     int numberOfDaysInaMotnh = 0;
     String monthOfYear;

    monthOfYear = JOptionPane.showInputDialog("Enter the month of year");

    switch  (monthOfYear) {
      case  "January":
      numberOfDaysInaMotnh = 31;
      break;
      case "February":
      numberOfDaysInaMotnh = 28;
      break;
      case "March":
      numberOfDaysInaMotnh = 31;
      break;
      case "April":
      numberOfDaysInaMotnh = 30;
      break;
      case "May":
      numberOfDaysInaMotnh = 31;
      break;
      case "June":
      numberOfDaysInaMotnh = 30;
      break;
      case "July":
      numberOfDaysInaMotnh = 31;
      break;
      case "August":
      numberOfDaysInaMotnh = 31;
      break;
      case "September":
      numberOfDaysInaMotnh = 30;
      break;
      case "October":
      numberOfDaysInaMotnh = 31;
      break;
      case "November":
      numberOfDaysInaMotnh = 30;
      break;
      case "December":
      numberOfDaysInaMotnh = 31;
      break;
      default:
      JOptionPane.showMessageDialog(null, "Invalid month!");
    }//end switch
    if (numberOfDaysInaMotnh != 0) {
      JOptionPane.showMessageDialog(null, "The number of days in this month is: " + numberOfDaysInaMotnh);
    }//end if
  }//end main
}//end class
