/*	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
    Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
    Imprima no console true se os dois número são iguais ou false se são diferentes.
*/

package exercicios.scanner;

import javax.swing.JOptionPane;

public class scanner3 {

	public static void main(String[] args) {
		int _numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro número inteiro:"));
		JOptionPane.showMessageDialog(null, "O número digitado é " + _numeroA);
		int _numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo número inteiro:"));
		JOptionPane.showMessageDialog(null, "O número digitado é " + _numeroB);

		if (_numeroA == _numeroB) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}