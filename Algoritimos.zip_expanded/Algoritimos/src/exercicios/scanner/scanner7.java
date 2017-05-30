//7.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
//Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
//Imprima no console true se o resultado da divisão dos dois número é par, e false caso o resultado da divisão seja ímpar.
package exercicios.scanner;

import javax.swing.JOptionPane;

public class scanner7 {

	public static void main(String[] args) {
		int _numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro número inteiro:"));
		JOptionPane.showMessageDialog(null, "O número digitado é " + _numeroA);
		int _numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo número inteiro:"));
		JOptionPane.showMessageDialog(null, "O número digitado é " + _numeroB);

		if ((_numeroA / _numeroB % 2) == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
