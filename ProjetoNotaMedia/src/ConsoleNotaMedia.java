// CONDIÇÕES: comparação através da junção de um (termo operador termo)
//		Termo:
//			- variável
//			- valor
//			- expressão
//			- resultado de um método
//			- outra condição
//
//		Operador:
//			>  maior
//			>= maior ou igual
//			<  menor
//			<= menor ou igual
//			== igual
//			!= diferente
//			!  negação (contrário)
//
//		Resultado de uma condição: true ou false
//
//		EXEMPLO: qual é a condição de aprovação?
//		(media >= 6)


// ESTRUTURA CONDICIONAL (IF): é uma estrutura que testa uma condição
//		e SE ela for verdadeira executa algo, mas SE ela for falsa
//		executa outra coisa
//
//		Sintaxe da estrutura if simples (sem else):
//			
//			if(condicao){
//				<<comandos a executar se a condição for verdadeira>>
//			}
//
//		Sintaxe da estrutura if completa (com else):
//
//			if(condicao){
//				<<comandos a executar se a condição for verdadeira>>
//			} else {
//				<<comandos a executar se a condição for falsa>>
//			}



import java.util.Scanner;

public class ConsoleNotaMedia {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("SISTEMA DE CÁLCULO DE MÉDIA FINAL\n");
		
		System.out.println("Digite o nome do aluno: ");
		String nome = leitor.nextLine();
		
		System.out.println("Digite o nome da disciplina: ");
		String disciplina = leitor.nextLine();
		
		System.out.println("Digite a nota 1: ");
		float n1 = Float.parseFloat(leitor.nextLine());
		
		System.out.println("Digite a nota 2: ");
		float n2 = Float.parseFloat(leitor.nextLine());
		
		float media = (n1 + n2) / 2;
		
		System.out.println("\n" + nome + ", sua nota na disciplina "
				+ disciplina + " foi " + media);
		
		if(media >= 6) {
			System.out.println("Aluno Aprovado!");
		} else {
			System.out.println("Aluno Reprovado");
		}
		
	}

}
