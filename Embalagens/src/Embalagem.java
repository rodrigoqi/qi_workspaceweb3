
public class Embalagem {

	//ATRIBUTOS
	//	n� inteiro - int
	//	n� quebrado - double / float
	// 	texto - String
	//  um �nico caractere - char
	//	booleano (verdadeiro/falso) - bool
	
	private double largura;
	private double comprimento;
	private double altura;
	private String cor;
	private int capacidade;
	private int produtos;
	
	//M�TODOS
	
	//1-construtor: public NomeClasse(){}
	public Embalagem(String cor, int capacidade) {
		this.largura = 50.0;
		this.comprimento = 75.5;
		this.altura = 15.2;
		this.cor = cor;
		this.capacidade = capacidade;
		this.produtos = 0;
	}
	
	//2-M�todos Get
	//m�todos que servem para DEVOLVER o valor dos atributos da classe
	//Geralmente temos um m�todo get para cada atributo da classe
	public double getLargura() {
		return this.largura;
	}
	
	public double getComprimento() {
		return this.comprimento;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}
	
	public int getProdutos() {
		return this.produtos;
	}
	
	//3-M�todos Set
	//m�todos que servem para ALTERAR o valor de um atributo da classe
	//Geralmente temos um m�todo set para cada atributo que queiramos
	//permitir que possa ser alterado
	public void setLargura(double novaLargura) {
		this.largura = novaLargura;
	}
	
	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}
	
	public void setComprimento(double novoComprimento) {
		this.comprimento = novoComprimento;
	}
	
	public void setCor(String novaCor) {
		this.cor = novaCor;
	}
	
	public void setCapacidade(int novaCapacidade) {
		this.capacidade = novaCapacidade;
	}
	
	//4-M�todos Especiais
	//M�todos espec�ficos que fazem alguma coisa diferente de get e set
	public void colocarProduto() {
		//uma das formas de dizer que uma vari�vel aumenta em 1
		//dizendo que ela recebe ela mesma mais 1
		this.produtos = this.produtos + 1;
		//a segunda forma � usando a defini��o de incremento abaixo
		//this.produtos++;
	}
	
	public void retirarProduto() {
		this.produtos = this.produtos - 1;
		//this.produtos--;
	}
	
	public void esvaziarCaixa() {
		this.produtos = 0;
	}
	
}
