
public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
	public void setSalario(double valor) {
		this.salario = valor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
}
