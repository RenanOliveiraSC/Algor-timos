//Crie uma vari�vel de nome �teste� do tipo boolean com o valor true. Crie outra
//vari�vel de nome �outroTeste� do tipo boolean com o valor false. Imprima os valores
//das duas vari�veis. Coloque o valor da vari�vel �teste� na vari�vel �outroTeste�.
//Imprima novamente ambas as vari�veis. Agora coloque o valor false na vari�vel
//�teste�, e imprima ambas as vari�veis novamente. Verifique o que aconteceu.
package exercicios.scanner;

public class scanner22 {

	public static void main(String[] args) {

		boolean teste = true;
		boolean outroTeste = false;
		System.out.println(teste + "  " + outroTeste);
		teste = false;
		outroTeste = true;
		System.out.println(teste + "  " + outroTeste);
		teste = false;
		System.out.println(teste + "  " + outroTeste);

	}
}
