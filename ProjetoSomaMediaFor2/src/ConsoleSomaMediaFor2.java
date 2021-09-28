import java.util.Scanner;

public class ConsoleSomaMediaFor2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE CÁLCULO DE SOMA E MÉDIA DE VALORES/n");
		
		float acumulador = 0;
		
		System.out.println("Quantos valores você quer inserir?");
		int quantidade = Integer.parseInt(leitor.nextLine());
				
		for(int cont = 1; cont <= quantidade; cont++) {
			
			System.out.println("Digite o valor " + cont);
			acumulador = acumulador + Float.parseFloat(leitor.nextLine());
						
		}
		
		float media = acumulador / quantidade;
		
		System.out.println("A soma dos valores é " + acumulador);
		System.out.println("A média dos valores é " + media);

	}

}
