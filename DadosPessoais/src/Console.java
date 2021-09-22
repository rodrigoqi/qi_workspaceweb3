//CONVERSÃO DE STRING (nextLine)
// Todo tipo de dado possui um Parser que converter
// de String para o seu próprio formato
//
// Byte.parseByte(String que eu quero converter)
// Short.parseShort(String que eu quero converter)
// Integer.parseInt(String que eu quero converter)
// Long.parseLong(String que eu quero converter)
// Float.parseFloat(String que eu quero converter)
// Double.parseDouble(String que eu quero converter)
// Boolean.parseBoolean(String que eu quero converter)

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("CADASTRO DE CLIENTE\n");
		
		System.out.println("Digite o seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite o seu sexo (M ou F): ");
		String sexo = leitor.nextLine();
		
		System.out.println("Digite a sua idade: ");
		byte idade = Byte.parseByte(leitor.nextLine());
		
		System.out.println("Digite o seu telefone: ");
		String telefone = leitor.nextLine();
		
		System.out.println("Digite o seu e-mail: ");
		String email = leitor.nextLine();
		
		System.out.println("Digite a sua renda: ");
		float renda = Float.parseFloat(leitor.nextLine());
		
		System.out.println("Digite o número de filhos: ");
		byte numeroFilhos = Byte.parseByte(leitor.nextLine());
		
		System.out.println("Digite o seu RG: ");
		long rg = Long.parseLong(leitor.nextLine());
		
		System.out.println("********************************************");
		System.out.println("Confira as informações digitadas no sistema:\n");
		System.out.println(nome + ", " + sexo + ", " + idade + " anos");
		System.out.println("Fone: " + telefone + ", E-mail: " + email);
		System.out.println("RG: " + rg + ", renda R$ " + renda);
		System.out.println(numeroFilhos + " filhos");
		System.out.println("********************************************");
		
	}

}
