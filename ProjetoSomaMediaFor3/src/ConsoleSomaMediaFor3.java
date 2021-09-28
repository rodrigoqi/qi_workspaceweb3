import java.util.Scanner;

public class ConsoleSomaMediaFor3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE CÁLCULO DE SOMA E MÉDIA DE VALORES");
		
		float acumulador = 0;
		int opcao = 1;
		
		int cont;
		for(cont=1; opcao != 2; cont++) {
			
			System.out.println("Digite o valor " + cont);
			acumulador = acumulador + Float.parseFloat(leitor.nextLine());
			
			System.out.println("Inserir um novo valor? 1-Sim / 2-Não");
			opcao = Integer.parseInt(leitor.nextLine());
			
		}
		
		float media = acumulador / cont;
		
		System.out.println("A soma dos valores é " + acumulador);
		System.out.println("A média dos valores é " + media);

	}
	
	

}
