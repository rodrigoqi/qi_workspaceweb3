// CONDI��ES: compara��o atrav�s da jun��o de um (termo operador termo)
//		Termo:
//			- vari�vel
//			- valor
//			- express�o
//			- resultado de um m�todo
//			- outra condi��o
//
//		Operador:
//			>  maior
//			>= maior ou igual
//			<  menor
//			<= menor ou igual
//			== igual
//			!= diferente
//			!  nega��o (contr�rio)
//
//		Resultado de uma condi��o: true ou false
//
//		EXEMPLO: qual � a condi��o de aprova��o?
//		(media >= 6)


// ESTRUTURA CONDICIONAL (IF): � uma estrutura que testa uma condi��o
//		e SE ela for verdadeira executa algo, mas SE ela for falsa
//		executa outra coisa
//
//		Sintaxe da estrutura if simples (sem else):
//			
//			if(condicao){
//				<<comandos a executar se a condi��o for verdadeira>>
//			}
//
//		Sintaxe da estrutura if completa (com else):
//
//			if(condicao){
//				<<comandos a executar se a condi��o for verdadeira>>
//			} else {
//				<<comandos a executar se a condi��o for falsa>>
//			}



import java.util.Scanner;

public class ConsoleNotaMedia {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("SISTEMA DE C�LCULO DE M�DIA FINAL\n");
		
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
