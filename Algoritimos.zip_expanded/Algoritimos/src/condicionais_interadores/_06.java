//6.	Peça para o usuário digitar a cidade onde mora, armazene o valor em variável. 
//Peça para o usuário digitar o bairro onde mora, armazene o valor em variável. 
//Com tais informações efetue as seguintes condições:
package condicionais_interadores;

import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String cidade;
		String bairro;
		System.out.println("Em qual cidade você mora");
		cidade = scanner.nextLine();
		System.out.println("Em qual bairro você mora");
		bairro = scanner.nextLine();

		// a. Verifique se o usuário mora em "Blumenau" e no bairro "Velha",
		// caso sim, imprima “Você se atrasará para o trabalho!”.

		if (cidade.equals("Blumenau") && bairro.equals("Velha")) {
			System.out.println("Você se atrasará para o trabalho");
		}

		// b. Verifique se o usuário mora em “Blumenau” e no bairro “Fortaleza”,
		// caso sim, imprima “Você se atrasará muito mais para o trabalho!”.

		if (cidade.equals("Blumenau") & bairro.equals("Fortaleza")) {
			System.out.println("Você se atrasará muito mais para o trbalaho!");
		}

		// c. Verifique se o usuário mora em “Blumenau” e no bairro “Garcia”,
		// caso sim, imprima “Você tem que sair de madrugada para não pegar
		// trânsito!”.

		if (cidade.equals("Blumenau") & bairro.equals("Garcia")) {
			System.out.println("Você tem que sair de madrugada para não pegar trânsito!");
		}

		// d. Verifique se o usuário mora em “Gaspar” e no bairro “Belchior”,
		// caso sim, imprima “OK, você gosta de pegar trânsito!”.

		if (cidade.equals("Gaspar") & bairro.equals("Belchior")) {
			System.out.println("Ok, você gosta de pegar trânsito!");
		}

		// e. Verifique se o usuário mora em “Blumenau” e no bairro “Bela
		// vista”, caso sim, imprima “Pegue carona com quem vêem de Gaspar,
		// economiza gasolina!”.

		if (cidade.equals("Blumenau") & bairro.equals("Bela Vista")) {
			System.out.println("Pegue carona com quem vêem de Gaspar, economiza gasolina!");
		}

		// f No final peça para o usuário responder a pergunta “Você concorda
		// com o
		// que eu disse?” utilizando System.out.println e pegue o que o usuário
		// digitar
		// com Scanner. Caso o usuário digitar true, imprima “Show de bola”,
		// caso
		// contrário “Ok, problema é nosso!”.

		boolean resp;
		System.out.println("Me responda, você concorda com o que eu disse?");
		resp = scanner.nextBoolean();
		if (resp) {
			System.out.println("Show de Bola!");
		} else {
			System.out.println("OK, problema é nosso!");
		}
		scanner.close();
	}
}
