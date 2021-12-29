package JavaPOO;

public class Pessoa {
	
	// atributos
	protected String nome;
	protected int idade;
	
	// construtor
	public Pessoa() {
		nome = "Felipe";
		idade = 22;
	}
	
	// getters = retorna valores dos atributos
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	// setters = configurar os atributos
	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	// métodos "normais"
	
}
