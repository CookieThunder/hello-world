/************************************
* Class: Videojuego.java
* Author: Yamal Marquez Cuevas
* Description:
*/

public class Videojuego implements Entregable{
  //protperties
  private String title = "";
  private int estimedHours = 10;
  private boolean entregado = false;
  private String category = "";
  private String company = "";

//Makers
  public Videojuego() {
    this.title = "";
    this.estimedHours = 10;
    this.entregado = false;
    this.category = "";
    this.company = "";
  }

  public Videojuego(String title, int estimedHours) {
    this.title = title;
    this.estimedHours = estimedHours;
    this.entregado = false;
    this.category = "";
    this.company = "";
  }

  public Videojuego(String title, int estimedHours, String category, String company) {
    this.title = title;
    this.estimedHours = estimedHours;
    this.category = category;
    this.company = company;
    this.entregado = false;
  }

//GET methods
  public String getTitle() {
    return this.title;
  }
  public int getEstimedHours() {
    return this.estimedHours;
  }
  public String getCategory() {
    return this.category;
  }
  public String getCompany() {
    return this.company;
  }

//SET methods
  public void setTitle(String title) {
    this.title = title;
  }
  public void setEstimedHours(int estimedHours) {
    this.estimedHours = estimedHours;
  }
  public void setCategory(String category) {
    this.category = category;
  }
  public void setCompany(String company) {
    this.company = company;
  }

//Sobrecarga del metodo toString
  @Override
  public String toString() {
    return "Title: " + getTitle() + "\nEstimed Hours: " + getEstimedHours() + "\nEntregado: " + entregado + "\nCategory: " + getCategory() + "\nCompany: " + getCompany();
  }

  //Los metodos de implements Entregable
    public void entregar() {
      this.entregado = true;
    }
    public void devolver() {
      this.entregado = false;
    }
    public boolean isEntregado() {
      return this.entregado;
    }
}//end class Videojuego
