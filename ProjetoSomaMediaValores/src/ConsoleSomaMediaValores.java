/*
 * La�o de repeti��o while
 * 
 *  � um la�o que possui uma condi��o e que ir� executar os comandos
 *  que estivem dentro do seu bloco enquanto essa condi��o for true.
 *  
 *  Sintaxe:
 *  
 *  	while(condicao){
 *  		//comandos que eu quero executar
 *  	}
 *  
 *  Vari�veis especiais utilizadas em um while
 *  
 *  contador: vari�vel que conta quantas vezes um la�o foi executado. 
 *  	      A cada repeti��o, o seu valor aumenta 1 (++)
 *        
 *  acumulador: vari�vel que inicia em zero e que a cada repeti��o do
 *              la�o acumula dentro de si o valor digitado. Com isso, 
 *              no final do la�o, ela possui dentro dela a soma de 
 *              todos os valores
 *  
 */


import java.util.Scanner;

public class ConsoleSomaMediaValores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("SOMA E M�DIA DE VALORES DIGITADOS\n");
		
		int cont = 0;
		float acumulador = 0;
		
		while(cont < 10) {
			cont++;
			System.out.println("Digite o valor " + cont);
			acumulador = acumulador + Float.parseFloat(leitor.nextLine());			
		}
		
		float media = acumulador/10;
		
		System.out.println("A soma dos valores � " + acumulador);
		System.out.println("A m�dia dos valores � " + media);
		
	}

}
