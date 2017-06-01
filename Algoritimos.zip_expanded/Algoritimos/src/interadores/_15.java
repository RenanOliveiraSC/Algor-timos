package interadores;

import java.util.Scanner;

public class _15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String mes[] = { "JAN", "FEV", "MARC", "MAIO", "JUN", "JULH", "AGO", "SET", "OUT", "NOV", "DEZ" };
		int tot[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int c = 0; c < mes.length; c++) {
			System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao todo ");
		}

		
		}

	}
}
