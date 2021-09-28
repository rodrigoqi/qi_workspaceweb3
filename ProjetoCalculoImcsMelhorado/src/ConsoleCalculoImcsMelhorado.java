import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsoleCalculoImcsMelhorado {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("APP DE CÁLCULO DE IMC\n");
		
		int opcao = 1;
		
		while(opcao!=2) {
		
			System.out.println("Digite o seu nome: ");
			String nome = leitor.nextLine();
			
			System.out.println("Digite o seu sexo: ");
			String sexo = leitor.nextLine();
			
			System.out.println("Digite o seu peso: ");
			float peso = Float.parseFloat(leitor.nextLine());
			
			System.out.println("Digite a sua altura: ");
			float altura = Float.parseFloat(leitor.nextLine());
			
			float imc = peso / (altura*altura);
			
			DecimalFormat formato2casas = new DecimalFormat("0.00");
			
			System.out.println(nome + ", o seu IMC é " 
					+ formato2casas.format(imc));
			
			if(sexo.toUpperCase().equals("M")) {
				
				if(imc<=20.7) {
					System.out.println("Abaixo do peso");
				} else if(imc<=26.4) {
					System.out.println("Peso ideal");
				} else if(imc<=27.8) {
					System.out.println("Pouco acima do peso");
				} else if(imc<=31.1) {
					System.out.println("Acima do peso");
				} else if(imc<=34.1) {
					System.out.println("Obesidade grau 1 (leve)");
				} else if(imc<=40.2) {
					System.out.println("Obesidade grau 2 (moderada)");
				} else if(imc>40.2) {
					System.out.println("Obesidade grau 3 (mórbida)");
				}
				
			} else {
				
				if(imc<=19.1) {
					System.out.println("Abaixo do peso");
				} else if(imc<=25.8) {
					System.out.println("Peso ideal");
				} else if(imc<=27.3) {
					System.out.println("Pouco acima do peso");
				} else if(imc<=32.3) {
					System.out.println("Acima do peso");
				} else if(imc<=35.6) {
					System.out.println("Obesidade grau 1 (leve)");
				} else if(imc<=40.9) {
					System.out.println("Obesidade grau 2 (moderada)");
				} else if(imc>40.9) {
					System.out.println("Obesidade grau 3 (mórbida)");
				}
				
			}
			
			System.out.println("Calcular mais um IMC? 1-Sim ou 2-Não");
			opcao = Integer.parseInt(leitor.nextLine());
			
		}
	}

}
