
public class Main {

	public static void main(String[] args) {
		Cliente jhonnys = new Cliente();
		jhonnys.setNome("Jhonnys");
		
		Conta cc = new ContaCorrente(jhonnys);
		Conta poupanca = new ContaPoupanca(jhonnys);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
   }
}
