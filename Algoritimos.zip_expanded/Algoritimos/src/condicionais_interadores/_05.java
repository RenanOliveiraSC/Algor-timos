//5.	Pe�a para o usu�rio digitar a idade e ano de nascimento. 
//Pegue os valores que o usu�rio digitou. Verifique se a idade digitada condiz com o ano de nascimento do usu�rio, 
//ou seja, se realmente ele tem a idade que disse ter. Caso sim imprima �Voc� n�o mentiu para mim�, 
//caso contr�rio, imprima �Voc� mentiu para mim, voc� n�o � mais meu amigo�.
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
			System.out.println("Voc� n�o mentiu para mim");
		} else {
			System.out.println("Voc� mentiu para mim, voc� n�o � mais meu amigo");
		}

	}
}
