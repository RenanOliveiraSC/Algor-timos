//5.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
//Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
//Imprima no console true se o resultado do primeiro n�mero menos o segundo n�mero � maior que 0 e false caso for menor igual a 0.
package exercicios.scanner;

import javax.swing.JOptionPane;

public class scanner5 {

	public static void main(String[] args) {

		int _numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro n�mero inteiro:"));
		JOptionPane.showMessageDialog(null, "O n�mero digitado � " + _numeroA);
		int _numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo n�mero inteiro:"));
		JOptionPane.showMessageDialog(null, "O n�mero digitado � " + _numeroB);

		if ((_numeroA + _numeroB) > 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}