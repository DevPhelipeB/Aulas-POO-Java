package JavaPOO;

public class Carro {
	
	// atributos
	int chassi = 8888;
	String marca = "GM";
	int velocidadeMax = 195;
	
	// métodos
	void buzinar() {
		System.out.println("Bee Beeee !!");
	}
	
	int exibirVelocidade() {
		System.out.println("velocidade máxima atingida: " + velocidadeMax + " km/h");
		return velocidadeMax;
	}
	
	void aumentarVelocidade(int valorVelocidade) {
		this.velocidadeMax += valorVelocidade;
		System.out.println("Velocidade atualizada: " + velocidadeMax);
	}
	
	String exibirMarca(String novaMarca) {
		marca = novaMarca;
		return marca;
	}
}
