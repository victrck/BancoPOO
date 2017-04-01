public class ListaDeContas {
	private Conta conta;	
	private ListaDeContas prox;
	
	public ListaDeContas(){
		this.conta = null;
		prox = null;
	}

	public void inserirConta(Conta conta){
		if(pesquisarConta(conta.getNumero()) == null){
			if(this.conta == null){
				this.conta = conta;
				this.prox = new ListaDeContas();
				return;
			}else{
				prox.inserirConta(conta);
			}
		}	
			return;	
	}

	public void removerConta(int numero){
		if(this.conta.getNumero() == numero){
			this.conta = prox.conta;
			this.prox = prox.prox;
			return;
		}else{
			prox.removerConta(numero);
		}
}
	
    public void listarContas(){
		if(conta != null){
			System.out.println("Nome: " + conta.getTitular().getNome() + "\nCPF: " + conta.getTitular().getCpf() + "\nNumero: " + conta.getNumero() + "\n");
			prox.listarContas();
		}
	}
	
	public Conta pesquisarConta(int numero){
		if(this.conta != null){
			if((this.conta.getNumero()) == numero){
				return this.conta;
			}else{
				prox.pesquisarConta(numero);
			}
		}
		return null;
	}
}
