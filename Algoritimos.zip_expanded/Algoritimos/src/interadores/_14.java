//Imprimir as imagens abaixo com algoritmos utilizando dois for. Pode ser utilizado if se necessário.
package interadores;

import java.util.Scanner;

public class _14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// a. ->1
		// 1
		// 2
		// 3
		// ->2
		// 1
		// 2
		// 3
		// ->3
		// 1
		// 2
		// 3
		System.out.println("************** EXERCÍCIO (A)********************");

		// a. 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9
		System.out.println("->1");
		for (int num = 1; num <= 3; num = num + 1) {
			System.out.println(num + " ");
		}

		System.out.println("->2");
		for (int num = 1; num <= 3; num = num + 1) {
			System.out.println(num + " ");
		}
		System.out.println("->3");
		for (int num = 1; num <= 3; num = num + 1) {
			System.out.println(num + " ");
		}
		System.out.println("");
		System.out.println("************** EXERCÍCIO (B)********************");

		// b.
		// 1
		// 11
		// 111

		int qtdLinhas = 3;
		for (int linha = 0; linha < qtdLinhas; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) {
				System.out.print("1");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("************** EXERCÍCIO (C)********************");

		// a
		// b
		// c

		String resultado = " ";
		for (int aux = 0; aux <= 3; aux++) {
			switch (aux) {
			case 1:
				resultado += "A";
				break;
			case 2:
				resultado += "B";
				break;
			case 3:
				resultado += "C";
				break;
			default:
				break;
			}
			resultado += "\n";
		}
		System.out.println(resultado);

		System.out.println("");
		System.out.println("************** EXERCÍCIO (D)********************");

		// d.abcdefghijlmnopqrstuvxz

		System.out.println("abcdefghijlmnopqrstuvxz");

		System.out.println("");
		System.out.println("************** EXERCÍCIO (E)********************");

		// e. abcdef
		// abcdef

		String resultado2 = " ";
		for (int aux = 1; aux <= 6; aux++) {
			switch (aux) {
			case 1:
				resultado2 += "a";
				break;
			case 2:
				resultado2 += "b";
				break;
			case 3:
				resultado2 += "c";
				break;

			case 4:
				resultado2 += "d";
				break;

			case 5:
				resultado2 += "e";
				break;

			case 6:
				resultado2 += "f";
				break;
			default:
				break;
			}
			resultado2 += "";
		}
		System.out.println(resultado2);
		System.out.println(resultado2);

		

		System.out.println("");
		System.out.println("************** EXERCÍCIO (G)********************");

		//g. //@_@
			 //@_@
			 //@_@
			 //@_@

	//public static String method2(int n) {
		String s = "";
		for (int i = 0; i < 4; i++)
			s = s + "@_@" +"\n";
				System.out.print(s);
		
		System.out.println("");
		System.out.println("************** EXERCÍCIO (G)********************");

		//g. @_@
		//	 _@_
		// 	 @_@

		String g = "";
		for (int i = 0; i < 1; i++)
			g = g + "@_@" + "\n" + "_@_" + "\n";
			g = g + "@_@";
				System.out.print(g);
		
		System.out.println("");
		System.out.println("************** EXERCÍCIO (H)********************");
		
		String[][] lista = new String[6][7];
		
		for(int linhas = 0; linhas < lista.length; linhas++){
			for(int coluna = 0; coluna < lista[linhas].length; coluna++){
				
			}
					
		}
			
			
			
	
	}
}
