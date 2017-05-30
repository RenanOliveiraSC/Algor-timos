//Peça para o usuário digitar um texto e altere todas as vogais do texto, para a letra w,
//utilizando o replace. (texto = texto.replace(&quot;antigoCaracter&quot;, &quot;novoCaracter&quot;);)
package condicionais_interadores;

import java.util.Scanner;

public class _18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String texto;
		System.out.println("Digite um texto qualquer!");
		texto = scanner.nextLine();

		System.out.println(texto.replaceAll("[A,a,E,e,I,i,O,o,U,U]", "W"));

	}
}