//Da data em texto �25/05/2015�, extraia o dia, m�s e ano e imprima a data da
//seguinte forma (O dia � {dia}, do m�s {m�s}, do ano {ano}).
package condicionais_interadores;

import java.util.Scanner;

public class _25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String texto = "25/05/2015";
		String dia = texto.substring(0, 2);
		String mes = texto.substring(3, 5);
		String ano = texto.substring(6, 10);
		System.out.println("O dia �: " + dia);
		System.out.println("O m�s �: " + mes);
		System.out.println("O ano �: " + ano);

	}
}
