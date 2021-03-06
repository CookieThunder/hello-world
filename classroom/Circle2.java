/*****************************************
Project: Circle2.java
Author: Yamal Marquez Cuevas
Description: driver of class {@link GeometricObject}
*****************************************/
import javax.swing.*;
public class Circle2 extends GeometricObject{//extends funciona para heredar de GeometricObject hacia Circle2
  private double radius;

  public Circle2(){

  }

  public Circle2 (double radius) {
    this.radius = radius;
  }

  public Circle2 (double radius, String color, boolean filled) {
    //cuando usamos la super clase (GeometricObject) se usa primero las que se heredan y se usa Super
    super(color, filled); // esto inicializa el constructor de GeometricObject
    this.radius = radius;
  }
  public double getRadius () {
    return this.radius;
  }
  public void setRadius (double radius) {
    this.radius = radius;
  }
  public double getArea () {
    return Math.PI * Math.pow(this.radius, 2);
  }
  public double getPerimeter () {
    return Math.PI * this.radius * 2;
  }
  public double getDiameter() {
    return this.radius * 2;
  }
  /*public void printCircle() {
    JOptionPane.showMessageDialog(null, "The circle created " + getDateCreDate() + " has a color " + getColor());
  }*/
  @Override // poliformismo, decorador
  public String toString() {
    return "Date created " + super.getDateCreDate() + "\nColor: " + super.getColor() + "\nArea: " + getArea();
  }
}
