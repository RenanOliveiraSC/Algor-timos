//Pe�a para o usu�rio digitar um texto. Guarde o texto que o usu�rio digitou em uma
//vari�vel. Crie outra vari�vel de nome �outroTexto�, atribuindo o valor da vari�vel que
//o usu�rio digitou. Altere o valor da vari�vel que o usu�rio digitou para �Ol�. Imprima
//as duas vari�veis, e observe o que foi impresso.
package exercicios.scanner;

import java.util.Scanner;

public class scanner20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Pe�a para o usu�rio digitar um texto. Guarde o texto que o usu�rio
		// digitou em uma vari�vel.
		String texto;
		System.out.println("Digite um texto");
		texto = scanner.nextLine();

		// Crie outra vari�vel de nome �outroTexto�, atribuindo o valor da
		// vari�vel que o usu�rio digitou.
		String outrotexto = texto;

		// Altere o valor da vari�vel que o usu�rio digitou para �Ol�.
		texto = "Ol�";

		System.out.println("Primeiro Texto �: " + texto);
		System.out.println("Outro Texto �: " + outrotexto);
	}
}
