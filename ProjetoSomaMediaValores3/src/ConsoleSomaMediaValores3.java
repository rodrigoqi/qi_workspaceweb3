import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsoleSomaMediaValores3 {

	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
		
		System.out.println("SOMA E MÉDIA DE VALORES DIGITADOS\n");
		
		int cont = 0;
		float acumulador = 0;
		int opcao = 0; //Variável especial: flag
		
		while(opcao!=2) {
			cont++;
			System.out.println("Digite o valor " + cont);
			acumulador = acumulador + Float.parseFloat(leitor.nextLine());	
			
			System.out.println("Insirir mais um valor? 1-Sim / 2-Não");
			opcao = Integer.parseInt(leitor.nextLine());
		}
		
		float media = acumulador/cont;
		
		DecimalFormat formato = new DecimalFormat("0.00");
		
		System.out.println("A soma dos valores é " + formato.format(acumulador));
		System.out.println("A média dos valores é " + formato.format(media));

	}

}
