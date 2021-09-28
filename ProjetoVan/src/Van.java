
public class Van {

	private String placa;
	private String cor;
	private int ano;
	private String modelo;
	private String motorista;
	private byte capacidade;
	private byte ocupacao;
	
	public Van(String placa, byte capacidade) {
		this.placa = placa;
		this.capacidade = capacidade;
		this.ocupacao = 0;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if(placa.length() == 7) {
			this.placa = placa;
		} else {
			System.out.println("A placa é inválida!");
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public byte getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(byte capacidade) {
		this.capacidade = capacidade;
	}

	public void embarcar(byte quantidade) {
		byte livres = (byte)(this.capacidade - this.ocupacao);
				
		if(livres >= quantidade) {
			this.ocupacao = (byte)(this.ocupacao + quantidade);
		} else {
			System.out.println("Passageiros não embarcados: " 
					+ (this.ocupacao + quantidade - this.capacidade));
			this.ocupacao = this.capacidade;
		}
	}
	
	public void desembarcar(byte quantidade) {
		if(this.ocupacao >= quantidade) {
			this.ocupacao = (byte)(this.ocupacao - quantidade);
		} else {
			System.out.println("ERRO! O total desembarcando é maior do que o total de pessoas dentro da Van. Chame um exorcista!");
		}
	}
	
	public byte getLivres() {
		return (byte)(this.capacidade - this.ocupacao);
	}
	
	public String toString() {
		String texto = "";
		texto = texto + "Placa: " + this.placa + "\n";
		texto = texto + "Capacidade: " + this.capacidade + "\n";
		texto = texto + "Passageiros na Van: " + this.ocupacao + "\n";
		texto = texto + "Lugares livres: " + getLivres() + "\n";
		return texto;
	}
	
	
}






