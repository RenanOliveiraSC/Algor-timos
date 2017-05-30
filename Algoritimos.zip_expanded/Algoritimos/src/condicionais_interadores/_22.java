//Peça para o usuário digitar o nome completo. Procure o primeiro espaço “ ” 
//(int posicao = texto.indexOf(&quot; &quot;);). Guarde o valor. Procure agora pelo o último espaço “ ”
//no qual fizemos no exercício anterior. Agora, utilizando a função substring (texto =
//texto.substring(0, 10);), insira os dois valores guardados anteriormente, e imprima o
//texto resultante.
package condicionais_interadores;

import java.util.Scanner;

public class _22 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo");
		String nome = scanner.nextLine();
		
		int espaco1 = nome.indexOf(" ");
		int espaco2 = nome.lastIndexOf(" ");
		
		nome = nome.substring(espaco1, espaco2);
		System.out.println(nome);
	}
}
