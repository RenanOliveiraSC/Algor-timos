//17.	Pergunte o nome da pessoa, o dia e mês e ano de aniversário. 
//Pergunte para outra pessoa o nome, o dia, mês e ano de aniversário. 
//Agora verifique qual é a pessoa mais velha, e imprima o nome da mais velha e o nome da mais nova, utilizando apenas um Sysout. 
//Sendo considerado o dia, mês e ano, cada uma sendo uma variável int.
package condicionais_interadores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _17 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		System.out.println("Digite o nome de uma pessoa");
		String nome1 = scanner.nextLine();
		System.out.println("Digite a data de nascimento (dd/mm/yyyy)");
		Date data1 = sdf.parse(scanner.nextLine());
		System.out.println("Digite o nome de outra pessoa");
		String nome2 = scanner.nextLine();
		System.out.println("Digite a data de nascimento (dd/mm/yyyy)");
		Date data2 = sdf.parse(scanner.nextLine());

		if (data1.compareTo(data2) == 0) {
			System.out.println("Tem a mesma idade");
		} else if (data1.compareTo(data2) > 0) {
			System.out.println(nome1 + " " + sdf.format(data1)+ " " + "é o mais novo");

		} else {
			System.out.println(nome2 + " " + sdf.format(data2)+ " " + "é o mais novo");
		}
	}
}