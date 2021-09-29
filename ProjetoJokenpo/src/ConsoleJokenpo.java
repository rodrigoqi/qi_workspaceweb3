import java.util.Scanner;

public class ConsoleJokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um código de identificação: ");
		int codigo = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Digite o nome do jogador: ");
		String nome = leitor.nextLine();
		
		Jokenpo jo = new Jokenpo(codigo, nome);

		int opcao = -1;
		
		while(opcao!=0) {
			System.out.println("*****************************************");
			System.out.println("BEM-VINDO AO JOKENPÔ! O QUE DESEJA?\n");
			System.out.println("0 - Encerrar o jogo");
			System.out.println("1 - Ver informações do jogo");
			System.out.println("2 - Ver o nome do jogador");
			System.out.println("3 - Alterar o jogador");
			System.out.println("4 - Ver o aproveitamento do jogador");
			System.out.println("5 - Zerar estatísticas");
			System.out.println("6 - JOGAR!");
		
			opcao = Integer.parseInt(leitor.nextLine());
			System.out.println("*****************************************");
			
			if(opcao==1) {
				System.out.println(jo.toString());
			} else if(opcao==2) {
				System.out.println("O jogador é " + jo.getNome());
			} else if(opcao==3) {
				System.out.println("Qual o nome do novo jogador?");
				jo.setNome(leitor.nextLine());
			} else if(opcao==4) {
				System.out.println("O aproveitamento é " 
						+ jo.getAproveitamento() + "%");
			} else if(opcao==5) {
				jo.zerarEstatisticas();
			} else if(opcao==6) {
				System.out.println("Você quer pedra(0), papel(1) ou tesoura(2)?");
				int escolha = Integer.parseInt(leitor.nextLine());
				jo.jogar(escolha);
			}
			
		}
	}
}
