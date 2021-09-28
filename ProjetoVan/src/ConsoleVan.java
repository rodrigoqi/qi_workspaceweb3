import java.util.Scanner;

public class ConsoleVan {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao programa de controle de Vans\n");
		
		System.out.println("Digite a placa da Van: ");
		String placa = leitor.nextLine();
		
		System.out.println("Digite a capacidade da Van: ");
		byte capacidade = Byte.parseByte(leitor.nextLine());
		
		Van v1 = new Van(placa, capacidade);
		
		int opcao = -1;
		
		while(opcao != 0) {
			
			System.out.println("******************************************");
			System.out.println("DIGITE A OPÇÃO DESEJADA:\n");
			System.out.println("0 - Encerrar o programa");
			System.out.println("1 - Embarcar passageiros");
			System.out.println("2 - Desembarcar passageiros");
			System.out.println("3 - Ver o número de lugares disponíveis");
			System.out.println("4 - Ver informações completas da Van");
			System.out.println("5 - Modificar a placa");
			
			opcao = Integer.parseInt(leitor.nextLine());
			System.out.println("******************************************");
			
			if(opcao==1) {
				System.out.println("Quantos passageiros deseja embarcar: ");
				byte quantidade = Byte.parseByte(leitor.nextLine());
				v1.embarcar(quantidade);
			} else if(opcao == 2) {
				System.out.println("Quantos passageiros deseja desembarcar: ");
				byte quantidade = Byte.parseByte(leitor.nextLine());
				v1.desembarcar(quantidade);
			} else if(opcao == 3) {
				System.out.println("Lugares disponíveis: " + v1.getLivres());
			} else if(opcao == 4) {
				System.out.println(v1.toString());
			} else if(opcao == 5) {
				System.out.println("Digite a nova placa da Van: ");
				String novaPlaca = leitor.nextLine();
				v1.setPlaca(novaPlaca);
			}
			
			
		}

	}

}
