
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.setNome("Meu Banco Digital");

		// Exemplo: Adicionando contas à lista do banco
		List<Conta> listaDeContas = new ArrayList<>();
		listaDeContas.add(new ContaCorrente(new Cliente()));
		listaDeContas.add(new ContaPoupanca(new Cliente()));
		banco.setContas(listaDeContas);

		// Chamada simples para imprimir todas as contas
		banco.imprimirContas();
	}

}
