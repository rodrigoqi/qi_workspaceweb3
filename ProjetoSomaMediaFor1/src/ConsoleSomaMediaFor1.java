/*
 * La�o de Repeti��o for: � um la�o especialmente desenvolvido para
 * a cria��o de repeti��es contadas e que j� possui um contador interno.
 * Para seu uso, definimos o nome e valor inicial do contador, uma 
 * condi��o de continuidade e um incremento para o contador.
 * 
 * Sintaxe:
 * 
 * 		for(int <contador> = <valorInicial>; <condicao>; <incremento>){
 * 			//comandos a serem executados
 * 		}
 * 
 * Exemplo - for executado 100 vezes
 * 
 * 		for(int cont = 0; cont < 100; cont++){
 * 			//comandos aqui
 * 		}
 * 
 * 		OU
 * 
 * 		for(int cont = 1; cont <= 100; cont++){
 * 			//comandos aqui
 * 		}
 * 
 */


import java.util.Scanner;

public class ConsoleSomaMediaFor1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE C�LCULO DE SOMA E M�DIA DE VALORES");
		
		float acumulador = 0;
				
		for(int cont = 1; cont <= 10; cont++) {
			
			System.out.println("Digite o valor " + cont);
			acumulador = acumulador + Float.parseFloat(leitor.nextLine());
						
		}
		
		float media = acumulador / 10;
		
		System.out.println("A soma dos valores � " + acumulador);
		System.out.println("A m�dia dos valores � " + media);
	}

}
