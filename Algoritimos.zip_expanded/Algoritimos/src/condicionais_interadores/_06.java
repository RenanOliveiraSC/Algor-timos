//6.	Pe�a para o usu�rio digitar a cidade onde mora, armazene o valor em vari�vel. 
//Pe�a para o usu�rio digitar o bairro onde mora, armazene o valor em vari�vel. 
//Com tais informa��es efetue as seguintes condi��es:
package condicionais_interadores;

import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String cidade;
		String bairro;
		System.out.println("Em qual cidade voc� mora");
		cidade = scanner.nextLine();
		System.out.println("Em qual bairro voc� mora");
		bairro = scanner.nextLine();

		// a. Verifique se o usu�rio mora em "Blumenau" e no bairro "Velha",
		// caso sim, imprima �Voc� se atrasar� para o trabalho!�.

		if (cidade.equals("Blumenau") && bairro.equals("Velha")) {
			System.out.println("Voc� se atrasar� para o trabalho");
		}

		// b. Verifique se o usu�rio mora em �Blumenau� e no bairro �Fortaleza�,
		// caso sim, imprima �Voc� se atrasar� muito mais para o trabalho!�.

		if (cidade.equals("Blumenau") & bairro.equals("Fortaleza")) {
			System.out.println("Voc� se atrasar� muito mais para o trbalaho!");
		}

		// c. Verifique se o usu�rio mora em �Blumenau� e no bairro �Garcia�,
		// caso sim, imprima �Voc� tem que sair de madrugada para n�o pegar
		// tr�nsito!�.

		if (cidade.equals("Blumenau") & bairro.equals("Garcia")) {
			System.out.println("Voc� tem que sair de madrugada para n�o pegar tr�nsito!");
		}

		// d. Verifique se o usu�rio mora em �Gaspar� e no bairro �Belchior�,
		// caso sim, imprima �OK, voc� gosta de pegar tr�nsito!�.

		if (cidade.equals("Gaspar") & bairro.equals("Belchior")) {
			System.out.println("Ok, voc� gosta de pegar tr�nsito!");
		}

		// e. Verifique se o usu�rio mora em �Blumenau� e no bairro �Bela
		// vista�, caso sim, imprima �Pegue carona com quem v�em de Gaspar,
		// economiza gasolina!�.

		if (cidade.equals("Blumenau") & bairro.equals("Bela Vista")) {
			System.out.println("Pegue carona com quem v�em de Gaspar, economiza gasolina!");
		}

		// f No final pe�a para o usu�rio responder a pergunta �Voc� concorda
		// com o
		// que eu disse?� utilizando System.out.println e pegue o que o usu�rio
		// digitar
		// com Scanner. Caso o usu�rio digitar true, imprima �Show de bola�,
		// caso
		// contr�rio �Ok, problema � nosso!�.

		boolean resp;
		System.out.println("Me responda, voc� concorda com o que eu disse?");
		resp = scanner.nextBoolean();
		if (resp) {
			System.out.println("Show de Bola!");
		} else {
			System.out.println("OK, problema � nosso!");
		}
		scanner.close();
	}
}
