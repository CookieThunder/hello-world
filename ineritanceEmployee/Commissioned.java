/***********************************************************
* Project Commissioned
* Author Yamal Marquez Ceuvas
*
*/

public class Commissioned extends Employee implements Commission{

  private double sales = 0.0;

  public Commissioned(String name) {
    super(name);
  }

  public void addSales(double sales) {
    this. sales += sales;
  }

  public double getPay() {
    double pay = COMMSSION_RATE * sales;
    this.sales = 0.0;
    return pay;
  }
}
