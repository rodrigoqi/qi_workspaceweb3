package produto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto {
	private short codigo;
	private short peso;
	private float preco;
	private String nome;
	private String tipo;
	private String fabricante;
	private LocalDate dataDeFabricacao;
	private LocalDate dataDeValidade;

	public Produto(short codigo, String nome, float preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	
	// Getters
	public short getCodigo() {
		return this.codigo;
	}
	
	public float getPreco() {
		return this.preco;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public short getPeso() {
		return this.peso;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	
	public LocalDate getDataDeFabricacao() {
		return this.dataDeFabricacao;
	}
	
	public LocalDate getDataDeValidade() {
		return this.dataDeValidade;
	}
	
	//Setters
	public void setPeso(short peso) {
		this.peso = peso;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public void setDataDeFabricacao(LocalDate dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	
	public float calcularICMS() {
		return this.preco * 0.17f;
	}
	
	public float calcularTotal(short quantidade) {
		return this.preco * quantidade;
	}
	
	public void definirDataDeValidade(byte tempo) {
		this.dataDeValidade = this.dataDeFabricacao.plusDays(tempo);
	}
	
	public String toString() {
		String texto = "";
		texto = texto + "Código: " + this.codigo + "\n";
		texto = texto + "Nome: " + this.nome + "\n";
		texto = texto + "Preço: R$ " + this.preco + "\n";
		texto = texto + "Peso: " + this.peso + "\n";
		texto = texto + "Tipo: " + this.tipo + "\n";
		texto = texto + "Fabricante: " + this.fabricante + "\n";
		String dataFabricacao = 
				DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' YYYY").
				format(this.dataDeFabricacao);
		String dataValidade =
				DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' YYYY").
				format(this.dataDeValidade);
		texto = texto + "Data de Fabricação: " + dataFabricacao + "\n";
		texto = texto + "Data de Validade: " + dataValidade + "\n";

		return texto;
	}
	
	
	
	
}
