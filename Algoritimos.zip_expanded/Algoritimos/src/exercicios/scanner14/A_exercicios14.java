//14.	Escreva no console as seguintes quest�o:
//a.	Pergunte para o usu�rio as seguintes quest�es, as responta e armazene em vari�veis.
//i.	Digite seu nome:
//ii.	Digite seu ano de nascimento:
//iii.	Digite seu telefone:
//iv.	Digite a cidade de nascimento

package exercicios.scanner14;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class A_exercicios14 {

	public static void main(String[] args) {
		String nome;
		int _ano;
		long _telefone;
		String cidade;
		nome = JOptionPane.showInputDialog("Digite seu nome?");
		_ano = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento?"));
		_telefone = Long.parseLong(JOptionPane.showInputDialog("Digite seu telefone?"));
		cidade = (JOptionPane.showInputDialog("Digite a cidade de nascimento?"));
		JOptionPane.showMessageDialog(null, "Meu nomer �: " + nome + "\n" + "Nasci no ano de: " + _ano + "\n"
				+ "Telefone: " + _telefone + "\n " + "Cidade: " + cidade);

	}
}
