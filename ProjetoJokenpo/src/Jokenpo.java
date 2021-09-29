import java.util.Random;

public class Jokenpo {
	
	private int codigo;
	private String nome;
	private int disputadas;
	private int vitorias;
	private int empates;
	private int derrotas;
	
	public Jokenpo(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		zerarEstatisticas();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		zerarEstatisticas();
	}
	
	public String toString() {
		String texto = "";
		texto += "Jogador: " + this.nome + "\n";
		texto += "Partidas disputadas: " + this.disputadas + "\n";
		texto += "Vitórias: " + this.vitorias + "\n";
		texto += "Empates: " + this.empates + "\n";
		texto += "Derrotas: " + this.derrotas + "\n";
		return texto;
	}
	
	public float getAproveitamento() {
		int partidasConsideradas = this.disputadas - this.empates;
		float aproveitamento = ((float)this.vitorias / (float)partidasConsideradas) * 100;
		return aproveitamento;		
	}
	
	public void jogar(int escolhaUsuario) {
		//0-pedra / 1-papel / 2-tesoura
		
		this.disputadas++;
		
		Random aleatorio = new Random();
		int escolhaMaquina = aleatorio.nextInt(3);
		
		if(escolhaMaquina == 0) {
			System.out.println("A máquina escolheu PEDRA!");
		} else if(escolhaMaquina == 1) {
			System.out.println("A máquina escolheu PAPEL!");
		} else {
			System.out.println("A máquina escolheu TESOURA!");
		}
		
		if(escolhaUsuario == escolhaMaquina) {  //testando o empate
			this.empates++;
			System.out.println("Você empatou!");
		} else if( (escolhaUsuario==0 && escolhaMaquina==2) || 
				   (escolhaUsuario==1 && escolhaMaquina==0) || 
				   (escolhaUsuario==2 && escolhaMaquina==1) ) { 
			this.vitorias++;
			System.out.println("Você venceu!");
		} else {
			this.derrotas++;
			System.out.println("Você perdeu!");
		}
		
		
	}
	
	public void zerarEstatisticas() {
		this.disputadas = 0;
		this.vitorias = 0;
		this.empates = 0;
		this.derrotas = 0;
	}
	
}
