
public class Conta {
	private int numero;
	private Cliente titular = new Cliente();
	private double saldo;
	private double limite;
	private static int totalDeContas;

	Conta(String titular) {
		System.out.println("Acabei de criar uma nova conta e acionei o metodo construtor");
		Conta.setTotalDeContas(1);
	}

	boolean saca(double valor) {

		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	public void setSaldo(double valor) {
		this.saldo = valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public static void setTotalDeContas(int totalDeContas) {
		Conta.totalDeContas += totalDeContas;
	}
}
