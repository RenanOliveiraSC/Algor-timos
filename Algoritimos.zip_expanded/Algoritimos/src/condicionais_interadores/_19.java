//Pe�a para o usu�rio digitar seu nome e sobrenome. Altere todas as letras para
//ma�usculas, imprima o resultado, e depois altere para min�sculas e altere o
//resultado. (texto = texto.toUpperCase();, texto = texto.toLowerCase();)
package condicionais_interadores;

import java.util.Scanner;

public class _19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome e sobre nome");
		String nome = scanner.nextLine();
		System.out.println("Nome: " + nome.toUpperCase());
		System.out.println("Nome: " + nome.toLowerCase());
	}
}
