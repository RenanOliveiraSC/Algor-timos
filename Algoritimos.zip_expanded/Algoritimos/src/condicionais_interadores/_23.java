//Utilizando o exerc�cio 21 como exemplo, tente extrair o m�s da data, utilizando as
//fun��es indexOf e substring.
package condicionais_interadores;

import java.util.Scanner;

public class _23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua data de nascimento (dd/mm/yyyy) ");
		String data = scanner.nextLine();

		int barra1 = data.indexOf("/");
		barra1++;
		int barra2 = data.lastIndexOf("/");
		data = data.substring(barra1, barra2);
		System.out.println(data);
	}
}
