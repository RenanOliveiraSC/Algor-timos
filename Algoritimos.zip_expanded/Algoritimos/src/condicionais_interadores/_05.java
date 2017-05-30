//5.	Peça para o usuário digitar a idade e ano de nascimento. 
//Pegue os valores que o usuário digitou. Verifique se a idade digitada condiz com o ano de nascimento do usuário, 
//ou seja, se realmente ele tem a idade que disse ter. Caso sim imprima “Você não mentiu para mim”, 
//caso contrário, imprima “Você mentiu para mim, você não é mais meu amigo”.
package condicionais_interadores;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int idade;
		int _ano;
		int prova;
		int _prova;

		System.out.println("Digite sua idade:");
		idade = scanner.nextInt();
		System.out.println("Digite ano de seu nascimento:");
		_ano = scanner.nextInt();
		_prova = _ano + idade;
		if (_prova == 2017) {
			System.out.println("Você não mentiu para mim");
		} else {
			System.out.println("Você mentiu para mim, você não é mais meu amigo");
		}

	}
}
