import java.util.Scanner;

public class ConsoleSomaMediaValores2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("SOMA E M�DIA DE VALORES DIGITADOS\n");
		
		System.out.println("Quantos valores voc� quer inserir?");
		int quantidade = Integer.parseInt(leitor.nextLine());
		
		int cont = 0;
		float acumulador = 0;
		
		while(cont < quantidade) {
			cont++;
			System.out.println("Digite o valor " + cont);
			acumulador = acumulador + Float.parseFloat(leitor.nextLine());			
		}
		
		float media = acumulador/quantidade;
		
		System.out.println("A soma dos valores � " + acumulador);
		System.out.println("A m�dia dos valores � " + media);
		

	}

}
