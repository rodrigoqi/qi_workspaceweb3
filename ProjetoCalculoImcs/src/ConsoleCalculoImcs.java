import java.util.Scanner;

public class ConsoleCalculoImcs {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("APP DE CÁLCULO DE IMC\n");
		
		int opcao = 1;
		
		while(opcao!=2) {
		
			System.out.println("Digite o seu nome: ");
			String nome = leitor.nextLine();
			
			System.out.println("Digite o seu peso: ");
			float peso = Float.parseFloat(leitor.nextLine());
			
			System.out.println("Digite a sua altura: ");
			float altura = Float.parseFloat(leitor.nextLine());
			
			float imc = peso / (altura*altura);
			
			System.out.println(nome + ", o seu IMC é " + imc);
			
			System.out.println("Calcular mais um IMC? 1-Sim ou 2-Não");
			opcao = Integer.parseInt(leitor.nextLine());
			
		}
	}

}
