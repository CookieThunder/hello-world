 /****************************************************
* Author: Yamal Marquez Cuevas                        *
* Project: Test.java                                  *
* Description: this program generate Fibonacci series *
 ****************************************************/
import javax.swing.*;
public class Test {
	public static void main (String [] args) {

		double sumatoria, numActual = 1, numAnterior = 0;
		String salir = "no";//variable que usare para terminar el ciclo
		JOptionPane.showMessageDialog(null, "Numero actual - Numero Anterior - Sumatoria");

		while (salir == "no" ) {
			sumatoria = numActual + numAnterior;
			JOptionPane.showMessageDialog(null, numActual + "  ----  " + numAnterior + " ---- " + sumatoria);
			numAnterior = numActual;
			numActual = sumatoria;
			salir = JOptionPane.showInputDialog("¿Quieres salir de la serie de Fibonacci? (yes/no)");
		} //A mi al parecer no me hace el ciclo
		// lo hice de la siguiente manera
		int numVeces = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantas veces quiere repetir el proceso?"));
		for (int i = 0; i <= numVeces; i++ ) {
			sumatoria = numActual + numAnterior;
			JOptionPane.showMessageDialog(null, numActual + "  ----  " + numAnterior + " ---- " + sumatoria);
			numAnterior = numActual;
			numActual = sumatoria;
		}
	}
}
