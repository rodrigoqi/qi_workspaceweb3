/*
 * Laço de repetição while
 * 
 *  É um laço que possui uma condição e que irá executar os comandos
 *  que estivem dentro do seu bloco enquanto essa condição for true.
 *  
 *  Sintaxe:
 *  
 *  	while(condicao){
 *  		//comandos que eu quero executar
 *  	}
 *  
 *  Variáveis especiais utilizadas em um while
 *  
 *  contador: variável que conta quantas vezes um laço foi executado. 
 *  	      A cada repetição, o seu valor aumenta 1 (++)
 *        
 *  acumulador: variável que inicia em zero e que a cada repetição do
 *              laço acumula dentro de si o valor digitado. Com isso, 
 *              no final do laço, ela possui dentro dela a soma de 
 *              todos os valores
 *  
 */


import java.util.Scanner;

public class ConsoleSomaMediaValores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("SOMA E MÉDIA DE VALORES DIGITADOS\n");
		
		int cont = 0;
		float acumulador = 0;
		
		while(cont < 10) {
			cont++;
			System.out.println("Digite o valor " + cont);
			acumulador = acumulador + Float.parseFloat(leitor.nextLine());			
		}
		
		float media = acumulador/10;
		
		System.out.println("A soma dos valores é " + acumulador);
		System.out.println("A média dos valores é " + media);
		
	}

}
