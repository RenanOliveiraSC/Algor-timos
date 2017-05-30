//Da data em texto “25/05/2015”, extraia o dia, mês e ano e imprima a data da
//seguinte forma (O dia é {dia}, do mês {mês}, do ano {ano}).
package condicionais_interadores;

import java.util.Scanner;

public class _25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String texto = "25/05/2015";
		String dia = texto.substring(0, 2);
		String mes = texto.substring(3, 5);
		String ano = texto.substring(6, 10);
		System.out.println("O dia é: " + dia);
		System.out.println("O mês é: " + mes);
		System.out.println("O ano é: " + ano);

	}
}
