import java.util.Scanner;

public class ConsoleFaixaEtaria {

	public static void main(String[] args) {

		/*
		 * Solicitar ao usu�rio para digitar uma idade. Ap�s, escrever
		 * na tela qual � a faixa et�ria correspondente aquela idade
		 * 
		 * at� 3 anos: beb�
		 * at� 9 anos: crian�a
		 * at� 12 anos: pr�-adolescente
		 * at� 19 anos: adolescente
		 * at� 29 anos: jovem
		 * at� 35 anos: adulto jovem
		 * at� 59 anos: adulto
		 * at� 80 anos: idoso
		 * acima de 80 anos: anci�o
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("DESCOBRINDO A FAIXA ET�RIA\n");
		
		System.out.println("Digite uma idade: ");
		byte idade = Byte.parseByte(leitor.nextLine());
		
		if( (idade >= 0) && (idade <= 3) ) {
			System.out.println("Beb�");
		}
		
		if( (idade >= 4) && (idade <=9 ) ) {
			System.out.println("Crian�a");
		}

		if( (idade >= 10) && (idade <=12) ) {
			System.out.println("Pr�-adolescente");
		}
		
		if( (idade >= 13) && (idade <= 19) ) {
			System.out.println("Adolescente");
		}
		
		if( (idade >= 20) && (idade <= 29) ) {
			System.out.println("Jovem");
		}
		
		if( (idade >= 30) && (idade <= 35)) {
			System.out.println("Adulto jovem");
		}
		
		if( (idade >= 36 ) && (idade <= 59)) {
			System.out.println("Adulto");
		}
		
		if( (idade >= 60) && (idade <= 80)) {
			System.out.println("Idoso");
		}
		
		if(idade > 80) {
			System.out.println("Anci�o");
		}
	}

}
