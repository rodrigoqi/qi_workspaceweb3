import java.util.Scanner;

public class ConsoleVotacao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("SISTEMA DE VOTA��O\n");
		
		System.out.println("Digite o seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int idade = Integer.parseInt(leitor.nextLine());
		
		if(idade < 16) {
			System.out.println("Voc� n�o pode votar!");
		}
		
		if( (idade >= 16) && (idade < 18) || (idade > 69) ) {
			System.out.println("Seu voto � facultativo!");
		}
		
		if( (idade >= 18) && (idade <= 69) ) {
			System.out.println("Seu voto � obrigat�rio!");
		}
		
		/*
		 * Testando uma faixa de valor com if
		 * 
		 * 	  if( (valor>=minimo) && (valor<=maximo) )
		 */
		
	}

}
