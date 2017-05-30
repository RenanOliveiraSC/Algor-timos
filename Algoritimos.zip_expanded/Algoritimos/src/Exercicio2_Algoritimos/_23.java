package Exercicio2_Algoritimos;

import java.util.Scanner;

public class _23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número de Linhas");
		int qtdLinhas = scanner.nextInt();
		int num = qtdLinhas;
		for (int linha = 1; linha <= qtdLinhas; linha++) {
			for (int coluna = qtdLinhas; coluna >= linha; coluna--) {
				if (num < 10) {
					System.out.print("0" + num + " ");
				} else {
					System.out.print(num + " ");
				}
			}
			num--;
			System.out.println("");
		}
		scanner.close();
	}
}
