
public class Teste {
	
	private int codigo;
	private String nome;
	private double nota;
	
	public Teste(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getNota() {
		return this.nota;
	}
	
	public void setCodigo(int novoCodigo) {
		this.codigo = novoCodigo;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setNota(double novaNota) {
		this.nota = novaNota;
	}
	
	public String toString() {
		String texto = "";
		texto = texto + "Código: " + this.codigo + "\n";
		texto = texto + "Nome: " + this.nome + "\n";
		texto = texto + "Nota: " + this.nota + "\n";
		
		return texto;
	}
	
	public void verSituacao() {
		if(nota>=6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
	
}