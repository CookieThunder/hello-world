/********************************************
* Project OtherPerson.java
* Author: Yamal Maruqez Cuevas
*
*/
import javax.swing.*;
import java.util.*;

public class OtherPerson{

  //atributos -atributes -propertiers
  private String nombre;
  private int annioNacimiento;
  private char genero;
  private double estatura;
  private double peso;
  private char estadoCivil;

  //metodo constructor
  public OtherPerson(String nombre, int annioNacimiento, char genero, double estatura, double peso, char estadoCivil) {
    this.nombre = nombre;
    this.annioNacimiento = annioNacimiento;
    this.genero = genero;
    this.estatura = estatura;
    this.peso = peso;
    this.estadoCivil = estadoCivil;
  }

  public void caminar() {
    JOptionPane.showMessageDialog(null, "Caminando");
  }
  public void hablar() {
    JOptionPane.showMessageDialog(null, this.nombre + "says: Hola");
  }
  public int getEdad(int annioActual) {
    Calendar year = Calendar.getInstance();
    int annio = year.get(Calendar.YEAR);
    return annioActual - this.annioNacimiento;
  }

  public static void main(String[] args) {
    OtherPerson persona1 = new OtherPerson("Luis", 1986, 'H', 1.63, 78, 'C');
    OtherPerson persona2 = new OtherPerson("Maribel", 1986, 'M', 1.60, 85, 'C');

    persona1.caminar();
    persona1.hablar();
    int aux = persona1.getEdad(1998);
    JOptionPane.showMessageDialog(null, aux);
  }
}
