//Pe�a para o usu�rio digitar o nome completo. Busque em qual posi��o est� o �ltimo
//espa�o � � (texto.lastIndexOf(� �);). Guarde este valor, e agora some mais 1 neste valor utilizando ++. 
//Agora utilizando o substring, coloque o valor do resultado da
//soma e imprima o texto (texto = texto.substring(0);). Veja o que acontece.
package condicionais_interadores;

import java.util.Scanner;

public class _21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o seu nome completo");
		String nomeCompleto = scanner.nextLine();
		int pos1 = nomeCompleto.lastIndexOf(" ");
		System.out.println(pos1);
		pos1++;
		String resultado = nomeCompleto.substring(15);
		System.out.println(resultado);
	}
}
