//20)	Perguntar para o usu�rio o in�cio da lista e o final da lista que ele quer se seja impressa e imprimir esta lista.
package Exercicio2_Algoritimos;

import javax.swing.JOptionPane;

public class _20 {

	public static void main(String[] args) {
		int _numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro n�mero da Lista:"));
		int _numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite �ltimo n�mero da Lista:"));
		for (_numeroA = _numeroA; _numeroA <= _numeroB; _numeroA++) {
			System.out.println(_numeroA);
		}
	}
}
