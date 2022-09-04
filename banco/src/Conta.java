
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private TitularConta titular;
	
	//construtor padrao
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		
	}

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
		if(numero <= 0) {
			System.out.println("NÚMERO DA CONTA DEVE SER POSITVO E MAIOR QUE ZERO!");
		return;
		}
		this.numero = numero;
	}

	public  void setAgencia(int agencia) {
		if(agencia<= 0) {
			System.out.println("NÚMERO DE AGÊNCIA DEVE SER POSITVO E MAIOR QUE ZERO!");
		return;
		}
		this.agencia = agencia;
	}
	 public int getAgencia() {
		 return this.agencia;	

}
	 public void setTitular(TitularConta titular) {
		this.titular = titular;
	}
	 
	 public TitularConta getTitular() {
		return titular;
	}
}
