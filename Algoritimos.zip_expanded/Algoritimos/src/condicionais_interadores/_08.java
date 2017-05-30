package condicionais_interadores;

import java.util.Scanner;

public class _08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String clima;
		int temperatura;

		// a. Se estiver sol ela usu�rio blusa
		System.out.println("Digite o clima");
		clima = scanner.nextLine();
		System.out.println("Digite a temperatura");
		temperatura = scanner.nextInt();

		switch (clima) {

		case "Sol":
			// b.Se estiver sol e a temperatura estiver acima de 30� ela usar�
			// saia
			if (temperatura > 30) {
				System.out.println("Usar saia");
			}
			// c.Se estiver sol e a temperatura estiver abaixo ou igual a 30� e
			// maior ou igual a 23� ela usar� shorts.
			if (temperatura <= 30 && temperatura >= 23) {
				System.out.println("Usar Shorts");
			}
			// Se estiver sol e a temperatura estiver abaixo de 23� graus ela
			// usu�rio cal�a jeans.
			if (temperatura < 23) {
				System.out.println("Usar cal�a jeans");
			}
			break;
		case "nublado":
			// f. Se estiver nublado e a temperatura estiver menor ou igual a
			// 25� ela usar� cal�a de moletom e sobretudo.
			if (temperatura <= 25) {
				System.out.println("Usar cal�a de moletom e sobretudo");
			}

			break;
		case "Chovendo":
			// g. Se estiver chovendo ela usar� bota e cal�a jean
			System.out.println("Usar bota e cal�a jeans");

			// h.Se estiver chovendo e a temperatura for menor ou igual a 10�
			// ela usar� blusa e um casaco de l�.
			if (temperatura <= 10) {
				System.out.println("Usar blusa e um casaco de l�");
			}

			// Se estiver chovendo e a temperatura for maior que 10� e menor que
			// 25� ela usar� camisete.
			if (temperatura > 10 && temperatura < 25) {
				System.out.println("Usar camisete");
			}

			// Se estiver chovendo e a temperatura for maior ou igual a 25� ela
			// usar� uma blusa regata
			if (temperatura >= 25) {
				System.out.println("Usa blusa regata");
			}
			break;
		default:
			System.out.println("ficar em casa");
			break;
		}
	}
}
