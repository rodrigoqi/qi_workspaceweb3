/*
 * Laço de Repetição for: é um laço especialmente desenvolvido para
 * a criação de repetições contadas e que já possui um contador interno.
 * Para seu uso, definimos o nome e valor inicial do contador, uma 
 * condição de continuidade e um incremento para o contador.
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
		
		System.out.println("PROGRAMA DE CÁLCULO DE SOMA E MÉDIA DE VALORES");
		
		float acumulador = 0;
				
		for(int cont = 1; cont <= 10; cont++) {
			
			System.out.println("Digite o valor " + cont);
			acumulador = acumulador + Float.parseFloat(leitor.nextLine());
						
		}
		
		float media = acumulador / 10;
		
		System.out.println("A soma dos valores é " + acumulador);
		System.out.println("A média dos valores é " + media);
	}

}
