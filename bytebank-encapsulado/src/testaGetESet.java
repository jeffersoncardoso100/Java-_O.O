
public class testaGetESet {

	public static void main(String[] args) {
		
		// estanciei uma nova conta(criei)
		Conta conta = new Conta(1337,55);
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		
	Cliente paulo = new Cliente();
	paulo.setNome( "Paulo siveira");
	
	conta.setTitular(paulo );
	
	System.out.println(conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("Programador");
	Cliente titularDaConta = conta.getTitular();
	titularDaConta.setProfissao("programador");
	System.out.println(titularDaConta);
	System.out.println(paulo);
	System.out.println(conta.getTitular());
	
	}
	
}
