
public class Gerente extends Funcionario {
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido!!");
			return true;
		}else
		{
			System.out.println("Acesso negado!!");
			return false;
		}
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

}
