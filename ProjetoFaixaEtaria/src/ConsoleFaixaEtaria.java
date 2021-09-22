import java.util.Scanner;

public class ConsoleFaixaEtaria {

	public static void main(String[] args) {

		/*
		 * Solicitar ao usuário para digitar uma idade. Após, escrever
		 * na tela qual é a faixa etária correspondente aquela idade
		 * 
		 * até 3 anos: bebê
		 * até 9 anos: criança
		 * até 12 anos: pré-adolescente
		 * até 19 anos: adolescente
		 * até 29 anos: jovem
		 * até 35 anos: adulto jovem
		 * até 59 anos: adulto
		 * até 80 anos: idoso
		 * acima de 80 anos: ancião
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("DESCOBRINDO A FAIXA ETÁRIA\n");
		
		System.out.println("Digite uma idade: ");
		byte idade = Byte.parseByte(leitor.nextLine());
		
		if( (idade >= 0) && (idade <= 3) ) {
			System.out.println("Bebê");
		}
		
		if( (idade >= 4) && (idade <=9 ) ) {
			System.out.println("Criança");
		}

		if( (idade >= 10) && (idade <=12) ) {
			System.out.println("Pré-adolescente");
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
			System.out.println("Ancião");
		}
	}

}
