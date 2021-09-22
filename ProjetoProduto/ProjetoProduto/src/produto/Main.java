package produto;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		Produto prod1 = new Produto((short) 45, "Trakinas de banana", 2);
		
		// Chamar os setters
		prod1.setDataDeFabricacao(
			LocalDate.of(2021, 9, 6)
		);
		prod1.setPeso((short) 200);
		prod1.setFabricante("Nabisko");
		
		//Imprimir os dados
		//System.out.printf("Nome do produto: %s\nPreço do produto: R$ %.2f\n", nome,preco);
		
		prod1.definirDataDeValidade((byte) 15);
		
		System.out.println(prod1.toString());
		
		System.out.println("Depois das alterações:");
		prod1.setPeso((short) 500);
		prod1.setFabricante("Dharma");
		prod1.setTipo("Biscoito");
		
		System.out.println(prod1.toString());

	}

}
