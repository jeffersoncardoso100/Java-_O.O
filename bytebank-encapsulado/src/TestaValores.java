
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta (123, 456);
	
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123456);
		
		
		Conta conta2 = new Conta(123,456);
		Conta conta3 = new Conta(123,456);
		
		System.out.println(Conta.getTotal());
	}

}
