//5)	Pergunte para o usu�rio at� que n�mero ele quer imprimir, e imprima do 0 at� o n�mero desejado pelo usu�rio;
package Exercicio2_Algoritimos;

import javax.swing.JOptionPane;

public class _05 {

	public static void main(String[] args) {
		int _numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero que desejar:"));
		JOptionPane.showMessageDialog(null, "O n�mero digitado � " + _numeroA);
		int _lista;
		for (_lista =0;_lista<=_numeroA; _lista++){
			System.out.println(_lista);
		}
	}
}
