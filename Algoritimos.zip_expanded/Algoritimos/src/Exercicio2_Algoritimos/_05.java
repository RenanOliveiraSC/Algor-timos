//5)	Pergunte para o usuário até que número ele quer imprimir, e imprima do 0 até o número desejado pelo usuário;
package Exercicio2_Algoritimos;

import javax.swing.JOptionPane;

public class _05 {

	public static void main(String[] args) {
		int _numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que desejar:"));
		JOptionPane.showMessageDialog(null, "O número digitado é " + _numeroA);
		int _lista;
		for (_lista =0;_lista<=_numeroA; _lista++){
			System.out.println(_lista);
		}
	}
}
