
public class Conta {
	private int numero;
	private float saldo;
	private String extrato ;
	private Pessoa titular;
	
	public Conta(Pessoa titular, int numero){
		this.titular = titular;
		this.extrato = "";
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void getDebito(float val){
		this.saldo = saldo - val;
		registrador("Debito: ",val);
	}
	
	public void getCredito(float val) {
		this.saldo = saldo + val;
		registrador("Credito: ",val);
	}

	public void registrador(String operacao, float val) {
		extrato += operacao + val + ". Saldo: " + getSaldo() + "\n";
	}

	public String getExtrato(){
		return extrato;
	}
	
	public Pessoa getTitular() {
		return titular;
	}
}
