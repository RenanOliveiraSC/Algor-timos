package exercicios.scanner14;

import javax.swing.JOptionPane;

public class B_exercicios {

	public static void main(String[] args) {
		String nome;
		int _ano;
		long _telefone;
		String cidade;
		nome = JOptionPane.showInputDialog("Digite seu nome?");
		_ano = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento?"));
		int _idade = 2017 - _ano;
		_telefone = Long.parseLong(JOptionPane.showInputDialog("Digite seu telefone?"));
		cidade = (JOptionPane.showInputDialog("Digite a cidade de nascimento?"));
		JOptionPane.showMessageDialog(null,
				"Meu nomer é " + nome + "," + "nasci no ano de" + _ano + "," + "tenho" + _idade + "anos."
						+ "Se você quiser entrar em contato comigo, pode ligar para o telefone " + _telefone + "."
						+ "Há esqueci de te dizer aonde eu nasci, foi na cidade de " + cidade);

	}
}
