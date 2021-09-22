import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsolePesoIdeal {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que solicite ao usuário o seu sexo,
		 * e a sua altura. Ao final, o programa deve calcular
		 * e devolver qual deveria ser o peso ideal do usuário.
		 * 
		 * Observação: como calcular o peso ideal
		 * 
		 * Homens: (72.7 * altura) - 58.0
		 * Mulheres: (62.1 * altura) - 44.7
		 * 
		 */
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("CÁLCULO DE PESO IDEAL");
		
		System.out.println("Digite o seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite o seu sexo (M/F): ");
		String sexo = leitor.nextLine();
		
		System.out.println("Digite a sua altura: ");
		float altura = Float.parseFloat(leitor.nextLine());
		
		float pesoIdeal = 0;
		
		if( sexo.equals("m") || sexo.equals("M") ) {
			pesoIdeal = (72.7f * altura) - 58.0f;
		}
		
		if( sexo.equals("f") || sexo.equals("F") ) {
			pesoIdeal = (62.1f * altura) - 44.7f;
		}
		
		System.out.println(nome + " o seu peso ideal é " 
				+ new DecimalFormat("#,##0.00").format(pesoIdeal) 
				+ " Kg");
		
	}

}
