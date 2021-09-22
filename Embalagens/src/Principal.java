
public class Principal {

	public static void main(String[] args) {
		System.out.println("TESTE DA CLASSE EMBALAGEM");
		System.out.println("Developed by Moug - 2021");

		Embalagem e1 = new Embalagem("azul", 10);
		
		System.out.println("");
		System.out.println("EMBALAGEM E1 ORIGINAL");
		System.out.println("Largura: " + e1.getLargura() + " cm");
		System.out.println("Comprimento: " + e1.getComprimento() + " cm");
		System.out.println("Altura: " + e1.getAltura() + " cm");
		System.out.println("Cor: " + e1.getCor());
		System.out.println("Capacidade: " + e1.getCapacidade() + " produtos");
		System.out.println("Qtde atual: " + e1.getProdutos() + " produtos");
		
		e1.colocarProduto();
		e1.colocarProduto();
		e1.setCor("laranja por do sol da praia do Rosa");
		e1.setAltura(40);
		e1.setLargura(80.5);
		e1.colocarProduto();
		e1.setComprimento(90.1);
		e1.colocarProduto();
		e1.colocarProduto();
		e1.setCapacidade(15);
		e1.retirarProduto();
		e1.colocarProduto();
		
		e1.esvaziarCaixa();
		e1.colocarProduto();
		e1.colocarProduto();
		

		
		System.out.println("");
		System.out.println("EMBALAGEM E1 APÓS MUDANÇAS");
		System.out.println("Largura: " + e1.getLargura() + " cm");
		System.out.println("Comprimento: " + e1.getComprimento() + " cm");
		System.out.println("Altura: " + e1.getAltura() + " cm");
		System.out.println("Cor: " + e1.getCor());
		System.out.println("Capacidade: " + e1.getCapacidade() + " produtos");
		System.out.println("Qtde atual: " + e1.getProdutos() + " produtos");
	}

}
