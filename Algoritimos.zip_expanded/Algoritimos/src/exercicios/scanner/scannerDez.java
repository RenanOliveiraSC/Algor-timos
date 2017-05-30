//10.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
//Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
//Imprima no console o valor do resultado do primeiro número elevado ao quadrado mais o segundo número elevado ao quadrado.
package exercicios.scanner;

import javax.swing.JOptionPane;

public class scannerDez {

	public static void main(String[] args) {
		int _numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro número inteiro:"));
		JOptionPane.showMessageDialog(null, "O número digitado é " + _numeroA);
		int _numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo número inteiro:"));
		JOptionPane.showMessageDialog(null, "O número digitado é " + _numeroB);
		{
			System.out.println(Math.pow(_numeroA, 2) + " " + Math.pow(_numeroB, 2));
		}
	}
}
