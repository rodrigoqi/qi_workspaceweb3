import java.util.Scanner;

public class ConsoleNomeMes {

	public static void main(String[] args) {
		/* 
		 *Criar um programa que solicite ao usu�rio o n�mero de
		 * um m�s (1 � 12) e devolva o nome do m�s por extenso
		 */
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("DESCOBRINDO O NOME DO M�S\n");
		
		System.out.println("Digite o n�mero de um m�s (1 � 12): ");
		byte mes = Byte.parseByte(leitor.nextLine());
		
		if(mes == 1) {
			System.out.println("O m�s � Janeiro");
		}
		
		if(mes == 2) {
			System.out.println("O m�s � Fevereiro");
		}
		
		if(mes == 3) {
			System.out.println("O m�s � Mar�o");
		}
		
		if(mes == 4) {
			System.out.println("O m�s � Abril");
		}
		
		if(mes == 5) {
			System.out.println("O m�s � Maio");
		}
		
		if(mes == 6) {
			System.out.println("O m�s � Junho");
		}
		
		if(mes == 7) {
			System.out.println("O m�s � Julho");
		}
		
		if(mes == 8) {
			System.out.println("O m�s � Agosto");
		}
		
		if(mes == 9) {
			System.out.println("O m�s � Setembro");
		}
		
		if(mes == 10) {
			System.out.println("O m�s � Outubro");
		}
		
		if(mes == 11) {
			System.out.println("O m�s � Novembro");
		}
		
		if(mes == 12) {
			System.out.println("O m�s � Dezembro");
		}
		
		if(mes > 12) {
			System.out.println("ERRO! O m�s deve ser entre 1 e 12.");
		}
		
		if(mes < 1) {
			System.out.println("ERRO! O m�s deve ser entre 1 e 12.");
		}
		
		
	}

}
