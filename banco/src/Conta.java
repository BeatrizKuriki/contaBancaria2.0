
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private TitularConta titular;

	public void deposito(double valor) {
		this.saldo = this.saldo + valor;

	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transferencia(double valor, Conta destinataria) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destinataria.deposito(valor);
			return true;
		} else {
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
		
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public  void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	 public int getAgencia() {
		 return this.agencia;	

}
}
