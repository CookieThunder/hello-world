/***********************************************
* Hourly.java
* Yamal Marquez Cuevas
*
*/
public class Hourly extends Employee {

  private double hourlyRate;
  private double hours = 0.0;

  public Hourly(String name, double hours) {
    super(name);
    this.hours = hours;
    }

  public double getPay() {
    return 0.0; //hard code
  }

  public void addHours (double hours) {
    this.hours = hours;
  }
}
