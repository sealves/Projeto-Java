
public class principal {

	public static void main(String[] args) {
        
		Gerente novoGerente = new Gerente();
		novoGerente.setNome("Tiao Gerente");
		novoGerente.setCpf("80104231149");
		novoGerente.setSalario(4000.00);
		
		System.out.println("O nome do gerente : " + novoGerente.getNome());
		System.out.println("A bonificacao do gerente : "+novoGerente.getBonificacao());
		
		System.out.println("Usando o GitHub 123");

	}

}

