//13)	Imprima somente n�meros divis�veis por 5, de 1000 � 0;
package Exercicio2_Algoritimos;

public class _13 {

	public static void main(String[] args) {
		for(int n=5; n<=1000; n++){
			if(n % 5 ==0){
				System.out.println(n);
			}
		}
	}
}
