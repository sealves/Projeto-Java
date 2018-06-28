
public class principal {

	public static void main(String[] args) {
        
		Gerente novoGerente = new Gerente();
		novoGerente.setNome("Tião Gerente");
		novoGerente.setCpf("80104231149");
		novoGerente.setSalario(4000.00);
		
		System.out.println("O nome do gerente : " + novoGerente.getNome());
		System.out.println("A bonifiçãoo do gerente : "+novoGerente.getBonificacao());
		
		System.out.println("Mais um commint Tiao - Sucesso");
		System.out.println("Agora Sim");
	}

}

