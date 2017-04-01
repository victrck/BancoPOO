
public class Pessoa {
	private int cpf;
	private String nome;
	
	public int getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public Pessoa(String nome, int cpf){
		this.nome = nome;
		this.cpf = cpf;
		return;
	}
	
	
}
