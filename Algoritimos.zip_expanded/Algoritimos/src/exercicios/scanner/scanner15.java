//Vamos considerar que temos que validar um campo texto de uma tela de cadastro
//de pessoa, no qual � um campo de observa��o. Caso a quantidade de caracteres
//que o usu�rio digitou for maior que 50, imprima false, caso contr�rio imprima true.
package exercicios.scanner;

import java.util.Scanner;

public class scanner15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String observacao;
		System.out.println("Digite uma observa��o:");
		observacao = scanner.nextLine();
		System.out.print("Observa��o:" + observacao + "\n");

		if (observacao.length() < 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		scanner.close();
	}
}
