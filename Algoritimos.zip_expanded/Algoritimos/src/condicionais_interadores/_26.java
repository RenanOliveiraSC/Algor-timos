//26. Pergunte para o usu�rio o nome completo, se verifique as seguintes situa��es
//(&quot;outrTexto&quot;.contains(&quot;text&quot;)):
//a. Se ele tiver Pereira no nome, diga para o usu�rio �Voc� � da fam�lia pereira�
//b. Se ele tiver Silva no nome, diga para o usu�rio �Voc� � da fam�lia Silva�
//c. Se ele tiver Souza no nome, diga para o usu�rio �Voc� � da fam�lia Souza�
//d. Se ele n�o tiver nenhum dos sobrenomes anteriores, dia para o usu�rio
//�Infelizmente voc� n�o tem sobrenome famoso�.
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
			System.out.println("Voc� � da familia pereira");
		}

		if (nome.toLowerCase().contains(procurarS.toLowerCase())) {
			System.out.println("Voc� � da familia silva");
		}
		if (nome.toLowerCase().contains(procurarZ.toLowerCase())) {
			System.out.println("Voc� � da familia souza");
		}
		if (nome.toLowerCase().contains(procurarO.toLowerCase())) {
			System.out.println("Voc� � da familia OLIVEIRA");
		}

	}
}