//Do texto abaixo, extraia apenas o nome da rua, utilizando indexOf e substring
//a. Rua Ant�nio da Veiga, n�mero 201, Vila Nova, Blumenau - SC
//b. SC - Blumenau, rua Joiville n� 2011.
package condicionais_interadores;

import java.util.Scanner;

public class _24 {

	public static <virgula> void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// a. Rua Ant�nio da Veiga
		String texto = "Rua Ant�nio da Veiga, numero 201, Vila Nova, Blumenau-SC";
		String nomeRua = texto.substring(4, 20);
		System.out.println(nomeRua);
		// b. SC - Blumenau, rua Joinville n� 2011.
		String texto1 = "SC - Blumenau, rua Joinville n� 2011.";
		String nomeRua1 = texto1.substring(19, 28);
		System.out.println(nomeRua1);

	}
}
