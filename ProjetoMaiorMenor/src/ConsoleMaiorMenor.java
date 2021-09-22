import java.util.Scanner;

public class ConsoleMaiorMenor {

	public static void main(String[] args) {
		
		/*
		 * Solicitar para o usuário o nome e a idade. No final, mostrar 
		 * uma das duas mensagens de exemplo:
		 * 
		 * Rodrigo, bem vindo ao site da cervejaria!
		 * ou
		 * Rodrigo, você é menor de idade e não pode acessar o site!
		 * 
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("CERVEJARIA MOUG LTDA\n");
		
		System.out.println("Identifique-se informando o seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Para continuar, digite a sua idade: ");
		byte idade = Byte.parseByte(leitor.nextLine());
		
		if(idade >= 18) {
			System.out.println(nome + ", bem vindo ao site da cervejaria!");
		} else {
			System.out.println(nome + ", você é menor de idade e não pode acessar o site!");
		}
		
		//if(idade<18) {
		//	System.out.println(nome + ", você é menor de idade e não pode acessar o site!");
		//} else {
		//	System.out.println(nome + ", bem vindo ao site da cervejaria!");
		//}
		
		
	}

}
