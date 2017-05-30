//Diga se o código abaixo esta condizente com o que será impresso no console, se
//não, o por que e diga o resultado correto.
package exercicios.scanner;

public class scanner23 {

	public static void main(String[] args) {

		// A - ERRADA
		String texto = "Vinícius";
		String outroTexto = texto + "Ferneda";
		texto = outroTexto + "Ferneda";
		System.out.println(outroTexto);

		// A - CORRETA
		String textoR = "Vinícius";
		String outroTextoR = "Ferneda";
		System.out.println(textoR + " " + outroTextoR);

		// B - CORRETA
		int numero = 1;
		int outroNumero = 2 + 1;
		System.out.println(numero + 2);
		outroNumero = numero + 1;
		outroNumero = outroNumero + numero;
		System.out.println(outroNumero);

		// C - ERRADO
		int numeroC = 10;
		int outroNumeroC = numeroC;
		outroNumeroC = outroNumeroC + 10;
		numeroC = outroNumeroC;
		numeroC = outroNumeroC + 1;
		System.out.println(numeroC + 1);
		outroNumeroC = numeroC + 1;
		System.out.println(numeroC);

		// C - CORRETA
		int numeroCR = 10;
		int outroNumeroCR = numeroCR;
		outroNumeroCR = outroNumeroCR + 10;
		numeroCR = outroNumeroCR;
		numeroCR = outroNumeroCR + 1;
		outroNumeroC = numeroCR + 1;
		System.out.println(numeroCR);
		System.out.println(numeroCR + 1);

		// D - ERRADA
		double numeroD = 0.1 + 0.2;
		numeroD = 0.1 + 0.2;
		double outroNumeroD = numeroD - 0.1;
		numeroD = outroNumeroD;
		outroNumeroD = numeroD - 1;
		System.out.println(numeroD);

		// D - CORRETA - FALTA ARRUMAR
		double numeroDC = 0.1 + 0.2;
		numeroDC = 0.1 + 0.2;
		System.out.println(numeroDC);

		// E - ERRADA
		String numeroE = "A";
		int textoE = 1;
		numeroE = numeroE + numeroE;
		textoE = textoE;
		textoE = 2;
		System.out.println(numeroE);
		System.out.println(textoE);

		// E - CORRETA
		int numeroEC = 1;
		int textoEC = 2;
		System.out.println(numeroEC);
		System.out.println(textoEC);

		// F - ERRADA
		boolean numeroF = true;
		String booleanoF = "false";
		numeroF = false | true;
		booleanoF = "false | false";
		numeroF = false | numeroF;
		System.out.println(booleanoF);
		System.out.println(numeroF);

		// F - CORRETA
		boolean numeroFC = true;
		String booleanoFC = "false";
		System.out.println(booleanoFC);
		System.out.println(numeroFC);

	}
}
