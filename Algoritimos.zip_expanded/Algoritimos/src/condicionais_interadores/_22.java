//Pe�a para o usu�rio digitar o nome completo. Procure o primeiro espa�o � � 
//(int posicao = texto.indexOf(&quot; &quot;);). Guarde o valor. Procure agora pelo o �ltimo espa�o � �
//no qual fizemos no exerc�cio anterior. Agora, utilizando a fun��o substring (texto =
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
