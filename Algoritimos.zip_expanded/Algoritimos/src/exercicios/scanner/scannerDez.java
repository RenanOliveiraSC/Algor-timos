//10.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
//Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
//Imprima no console o valor do resultado do primeiro n�mero elevado ao quadrado mais o segundo n�mero elevado ao quadrado.
package exercicios.scanner;

import javax.swing.JOptionPane;

public class scannerDez {

	public static void main(String[] args) {
		int _numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro n�mero inteiro:"));
		JOptionPane.showMessageDialog(null, "O n�mero digitado � " + _numeroA);
		int _numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo n�mero inteiro:"));
		JOptionPane.showMessageDialog(null, "O n�mero digitado � " + _numeroB);
		{
			System.out.println(Math.pow(_numeroA, 2) + " " + Math.pow(_numeroB, 2));
		}
	}
}
