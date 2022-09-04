
public class Conta {
	private double saldo;
	int agencia;
	int numero;
	TitularConta titular;

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

	public double pegaSaldo() {
		return this.saldo;
	}
	

	
	
}
