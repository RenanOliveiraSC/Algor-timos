//9.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
//Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
//Imprima no console true se o primeiro n�mero � menor igual a zero ou o segundo n�mero � maior que 10. Caso contr�rio imprima false.
package exercicios.scanner;

import javax.swing.JOptionPane;

public class scanner9 {

	public static void main(String[] args) {
		int _numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro n�mero inteiro:"));
		JOptionPane.showMessageDialog(null, "O n�mero digitado � " + _numeroA);
		int _numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo n�mero inteiro:"));
		JOptionPane.showMessageDialog(null, "O n�mero digitado � " + _numeroB);

		if (_numeroA <= 0 || _numeroB > 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
