
public class Banco {
	public static void main(String[] args){ 
		Pessoa p= new Pessoa("Victor 1", 1);
		Pessoa p1= new Pessoa("Victor 2", 1);
		Pessoa p3= new Pessoa("Victor 3", 1);
		Conta c = new Conta(p,150);
		Conta c1 = new Conta(p1,160);
		Conta c2 = new Conta(p3,170);
		ListaDeContas p2 = new ListaDeContas();
		
		
		p2.inserirConta(c);
		p2.inserirConta(c1);
		p2.inserirConta(c2);
		
		p2.pesquisarConta(c.getNumero());
		p2.removerConta(150);
		p2.listarContas();

	}
	
}