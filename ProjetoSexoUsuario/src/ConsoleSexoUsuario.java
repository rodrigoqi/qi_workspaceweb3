/*
 * TESTANDO IGUALDADE E DIFEREN�A COM STRINGS
 *  Sempre que queremos testar igualdade em Strings, devemos utilizar 
 *  um m�todo especial chamado equals
 *  
 *  Testando igualdade:
 *  if(tuaString.equals(valorQueQuerTestar)
 *  Ex: if(sexo.equals("M")) //se o sexo for IGUAL a masculino
 *  
 *  Testando diferen�a:
 *  if(!tuaString.equals(valorQueQuerTestar)
 *  Ex: if(!sexo.equals("M")) //se o sexo N�O FOR IGUAL a masculino
 */

import java.util.Scanner;

public class ConsoleSexoUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("SITE DA CERVEJARIA MOUG\n");
		
		System.out.println("Digite o seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite o seu sexo (F/M/I): ");
		String sexo = leitor.nextLine();
		
		if( sexo.equals("f") || sexo.equals("F") ) {
			System.out.println("Bem-vinda " + nome);
		}
		
		if( sexo.equals("m") || sexo.equals("M") ) {
			System.out.println("Bem-vindo " + nome);
		}
		
		if( sexo.equals("i") || sexo.equals("I")) {
			System.out.println("Bem-vinde " + nome);
		}

		
		
	}

}
