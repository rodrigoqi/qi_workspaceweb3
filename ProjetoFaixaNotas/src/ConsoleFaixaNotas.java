import java.util.Scanner;

public class ConsoleFaixaNotas {

	public static void main(String[] args) {
		/*
		 * Criar um app que solicite uma nota (entre 0 e 10) e retorne
		 * o valor do conceito (A, B, C, D, E, F)
		 * 
		 * A escola utiliza a seguinte regra:
		 * 
		 * 		A = entre 8.5 e 10.0
		 * 		B = entre 7.0 e <8.5
		 * 		C = entre 6.0 e <7.0
		 * 		D = entre 4.5 e <6.0
		 * 		E = entre 2.0 e <4.5
		 * 		F = <2.0
		 */
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("PROGRAMA DE CONVERS�O DE NOTA EM CONCEITO\n");
		System.out.println("Digite a nota a converter (entre 0 e 10): ");
		float nota = Float.parseFloat(leitor.nextLine());
		
		/*
		if( (nota>=8.5) && (nota<=10) ){
			System.out.println("Conceito A");
		}
		if( (nota>=7.0) && (nota<8.5) ) {
			System.out.println("Conceito B");
		}
		if( (nota>=6.0) && (nota<7) ) {
			System.out.println("Conceito C");
		}
		if( (nota>=4.5) && (nota<6) ) {
			System.out.println("Conceito D");
		}
		if( (nota>=2.0) && (nota<4.5) ) {
			System.out.println("Conceito E");
		}
		if( (nota>=0) && (nota<2.0) ) {
			System.out.println("Conceito F");
		}
		if( (nota<0) || (nota>10)) {
			System.out.println("Valor inv�lido. Digite uma nota entre 0 e 10");
		}
		*/
		
		if( (nota>10) || (nota<0) ) {
			System.out.println("Valor inv�lido! Digite uma nota entre 0 e 10");
		} else if(nota>=8.5) {
			System.out.println("Conceito A");
		} else if(nota>=7.0) {
			System.out.println("Conceito B");
		} else if(nota>=6.0) {
			System.out.println("Conceito C");
		} else if(nota>=4.5) {
			System.out.println("Conceito D");
		} else if(nota>=2.0) {
			System.out.println("Conceito E");
		} else if(nota>=0) {
			System.out.println("Conceito F");
		}
			
		
		

	}

}
