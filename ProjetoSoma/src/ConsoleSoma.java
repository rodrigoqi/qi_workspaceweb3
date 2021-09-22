import java.util.Scanner;

public class ConsoleSoma {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("CALCULADORA DE DIVISÃO\n");
		
		System.out.println("Digite o valor 1: ");
		float v1 = Float.parseFloat(leitor.nextLine()); 
		
		System.out.println("Digite o valor 2: ");
		float v2 = Float.parseFloat(leitor.nextLine());
		
		float v3 = v1 / v2;
		
		System.out.println("O resultado é " + v3);
	}

}
