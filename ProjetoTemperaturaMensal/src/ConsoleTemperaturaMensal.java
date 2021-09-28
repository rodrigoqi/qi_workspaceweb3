import java.util.Scanner;

public class ConsoleTemperaturaMensal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("PROGRAMA DE ACOMPANHAMENTO DE TEMPERATURAS\n");
		
		System.out.println("Quantos dias possui o m�s que voc� deseja?");
		int quantidade = Integer.parseInt(leitor.nextLine());
		
		float acumulador = 0;
		
		float maiorTemperatura = -999;
		float menorTemperatura = 999;
		
		for(int cont=1; cont<=quantidade; cont++) {
			System.out.println("Digite a temperatura do dia " + cont);
			float temperatura = Float.parseFloat(leitor.nextLine());
			acumulador = acumulador + temperatura;
			
			if(temperatura > maiorTemperatura) {
				maiorTemperatura = temperatura;
			}
			
			if(temperatura < menorTemperatura) {
				menorTemperatura = temperatura;
			}
		}
		
		float media = acumulador / quantidade;
		
		System.out.println("A soma dos valores � " + acumulador);
		System.out.println("A temperatura m�dia � " + media + "�C");
		System.out.println("A menor temperatura digitada � " 
				+ menorTemperatura + "�C");
		System.out.println("A maior temperatura digitada � "
				+ maiorTemperatura + "�C");
		
		/*
		 * Continuar o programa para:
		 * 		- Devolver a soma das temperaturas
		 * 		- Devolver a temperatura m�dia do m�s
		 * 		- Devolver a maior temperatura
		 * 		- Devolver a menor temperatura
		 * 
		 */

	}

}
