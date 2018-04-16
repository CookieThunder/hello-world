/****************************************
* Project: Electrodomestico.java
* Author: Yamal Marquez Cuevas
*
*/
import javax.swing.*;
public abstract class Electrodomestico {
  private double precioBase = 100.0;
  private int peso = 5; // peso en kilogramos
  private String color = "blanco";
  private char consumoEnergetico = 'F';

  public Electrodomestico() {
    this.precioBase = 100.0;
    this.peso = 5;
    this.color = "blanco";
    this.consumoEnergetico = 'F';
  }

  public Electrodomestico(double precioBase, int peso) {
    this.precioBase = precioBase;
    this.peso = peso;
    this.color = "blanco";
    this.consumoEnergetico = 'F';
  }

  public Electrodomestico(double precioBase, int peso, String color, char consumoEnergetico) {
    this.precioBase = precioBase;
    this.peso = peso;
    this.color = color;
    this.consumoEnergetico = consumoEnergetico;
  }

  public double getPrecioBase() {
    return this.precioBase;
  }
  public int getPeso() {
    return this.peso;
  }
  public String getColor() {
    return this.color;
  }
  public char getConsumoEnergetico() {
    return this.consumoEnergetico;
  }
  
}// end class Electrodomestico
