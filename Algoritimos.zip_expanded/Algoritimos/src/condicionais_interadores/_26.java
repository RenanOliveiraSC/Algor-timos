//26. Pergunte para o usuário o nome completo, se verifique as seguintes situações
//(&quot;outrTexto&quot;.contains(&quot;text&quot;)):
//a. Se ele tiver Pereira no nome, diga para o usuário “Você é da família pereira”
//b. Se ele tiver Silva no nome, diga para o usuário “Você é da família Silva”
//c. Se ele tiver Souza no nome, diga para o usuário “Você é da família Souza”
//d. Se ele não tiver nenhum dos sobrenomes anteriores, dia para o usuário
//“Infelizmente você não tem sobrenome famoso”.
package condicionais_interadores;

import java.util.Scanner;

public class _26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe seu nome completo! ");
		String nome = scanner.nextLine();
		String procurarP = "Pereira";
		String procurarS = "Silva";
		String procurarZ = "Souza";
		String procurarO = "Oliveira";

		if (nome.toLowerCase().contains(procurarP.toLowerCase())) {
			System.out.println("Você é da familia pereira");
		}

		if (nome.toLowerCase().contains(procurarS.toLowerCase())) {
			System.out.println("Você é da familia silva");
		}
		if (nome.toLowerCase().contains(procurarZ.toLowerCase())) {
			System.out.println("Você é da familia souza");
		}
		if (nome.toLowerCase().contains(procurarO.toLowerCase())) {
			System.out.println("Você é da familia OLIVEIRA");
		}

	}
}