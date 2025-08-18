
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		// Exemplo: Adicionando contas à lista do banco
		List<Conta> listaDeContas = new ArrayList<>();
		listaDeContas.add(new ContaCorrente(new Cliente()));
		listaDeContas.add(new ContaPoupanca(new Cliente()));
		banco.setContas(listaDeContas);

		// Chamada simples para imprimir todas as contas
		banco.imprimirContas();
	}

}
