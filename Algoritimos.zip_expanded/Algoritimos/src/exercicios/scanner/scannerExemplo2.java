package exercicios.scanner;

import javax.swing.JOptionPane;

public class scannerExemplo2 {
	public static void main(String[] args) {
		int _vlrHora = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor hora"));
		int _totalHoras = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de horas:"));
		double soma = _vlrHora * _totalHoras;

		JOptionPane.showMessageDialog(null, "O total é" + soma);
	}
}
