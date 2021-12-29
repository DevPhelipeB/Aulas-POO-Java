package JavaPOO;

public class Principal {

	public static void main(String[] args) {
		Carro corsa = new Carro();
		
		System.out.println("chassi: " + corsa.chassi);
		System.out.println("marca: " + corsa.marca);
		System.out.println("velocidade: " + corsa.velocidadeMax + " Km/h");
		corsa.aumentarVelocidade(60);
		corsa.buzinar();
		corsa.exibirVelocidade();
		System.out.println("Nova marca: " + corsa.exibirMarca("Classic LS"));
		
		PessoaFisica pessoa1 = new PessoaFisica();
		PessoaJuridica pessoa2 = new PessoaJuridica();
		
		
		pessoa1.setNome("Phelipe");
		pessoa1.setCpf(25252525);
		
		System.out.println("Nome da pessoa 1: " + pessoa1.getNome() + "\nCPF: " + pessoa1.getCpf());
		
		pessoa2.setNome("Rulioo");
		pessoa2.setCnpj(8888888);
		
		System.out.println("Nome da pessoa 2: " + pessoa2.getNome() + "\nCNPJ: " + pessoa2.getCnpj());
		
	
	}

}
