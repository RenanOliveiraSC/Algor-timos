//28. Utlizando o template abaixo, substitua os locais com �$$$� por valores que fazem
//sentido, utilizando vari�veis. Ap�s imprima o texto convertido com os valores.
//a. �Ol�, tudo bem? Meu nome � $$$, tenho $$$ anos de idade, e moro em $$$
//desde de que eu nasci. Moro com o(s) meu(s) $$$, no bairro da $$$.�
package condicionais_interadores;

import java.util.Scanner;

public class _28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// a. �Ol�, tudo bem? Meu nome � $$$, tenho $$$ anos de idade, e moro em
		// $$$
		// desde de que eu nasci. Moro com o(s) meu(s) $$$, no bairro da $$$.�
		String nome = "Lucas";
		String idade = "17";
		String cidade = "Blumenau";
		String pais = "pais";
		String bairro = "Fortaleza";

		System.out.println("Ol�, tudo bem? Meu nome � " + nome + ", tenho " + idade + " anos de idade, e moro em "
				+ cidade + " desde de que eu nasci." + "\n" + "Moro com o(s) meu(s) " + pais + ", no bairro da "
				+ bairro + ".");

	}
}
