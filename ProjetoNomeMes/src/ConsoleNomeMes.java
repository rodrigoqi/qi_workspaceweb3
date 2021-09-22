import java.util.Scanner;

public class ConsoleNomeMes {

	public static void main(String[] args) {
		/* 
		 *Criar um programa que solicite ao usuário o número de
		 * um mês (1 à 12) e devolva o nome do mês por extenso
		 */
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("DESCOBRINDO O NOME DO MÊS\n");
		
		System.out.println("Digite o número de um mês (1 à 12): ");
		byte mes = Byte.parseByte(leitor.nextLine());
		
		if(mes == 1) {
			System.out.println("O mês é Janeiro");
		}
		
		if(mes == 2) {
			System.out.println("O mês é Fevereiro");
		}
		
		if(mes == 3) {
			System.out.println("O mês é Março");
		}
		
		if(mes == 4) {
			System.out.println("O mês é Abril");
		}
		
		if(mes == 5) {
			System.out.println("O mês é Maio");
		}
		
		if(mes == 6) {
			System.out.println("O mês é Junho");
		}
		
		if(mes == 7) {
			System.out.println("O mês é Julho");
		}
		
		if(mes == 8) {
			System.out.println("O mês é Agosto");
		}
		
		if(mes == 9) {
			System.out.println("O mês é Setembro");
		}
		
		if(mes == 10) {
			System.out.println("O mês é Outubro");
		}
		
		if(mes == 11) {
			System.out.println("O mês é Novembro");
		}
		
		if(mes == 12) {
			System.out.println("O mês é Dezembro");
		}
		
		if(mes > 12) {
			System.out.println("ERRO! O mês deve ser entre 1 e 12.");
		}
		
		if(mes < 1) {
			System.out.println("ERRO! O mês deve ser entre 1 e 12.");
		}
		
		
	}

}
