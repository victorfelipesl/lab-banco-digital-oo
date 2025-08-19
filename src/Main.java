import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Crie os clientes
		Cliente cliente1 = new Cliente();
		cliente1.setNome("João Silva");

		Cliente cliente11 = new Cliente();
		cliente11.setNome("Silva");

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Maria Oliveira");

		// Crie e deposite nas contas
		Conta contaCorrente = new ContaCorrente(cliente1);
		contaCorrente.depositar(-50.00); // Saldo inicial

		Conta contaCorrente2 = new ContaCorrente(cliente11);
		contaCorrente2.depositar(230.00); // Conta de origem da transferência

		Conta contaPoupanca = new ContaPoupanca(cliente2);
		contaPoupanca.depositar(350.50);

		// Crie o objeto Banco e adicione as contas
		Banco banco = new Banco();
		banco.setNome("Meu Banco Digital");

		List<Conta> listaDeContas = new ArrayList<>();
		listaDeContas.add(contaCorrente);
		listaDeContas.add(contaCorrente2);
		listaDeContas.add(contaPoupanca);

		banco.setContas(listaDeContas);

		System.out.println("===== SALDOS ANTES DA TRANSFERÊNCIA =====");
		contaCorrente2.imprimirExtrato();
		System.out.println();
		contaCorrente.imprimirExtrato();

		// --- REALIZANDO A TRANSFERÊNCIA DE R$ 20,00 ---
		System.out.println("\n===== INICIANDO TRANSFERÊNCIA =====");
		System.out.println("Transferindo R$ 20,00 de " + cliente11.getNome() + " para " + cliente1.getNome());
		contaCorrente2.transferir(20.00, contaCorrente);

		// Chamando as funcionalidades em sequência para mostrar o resultado final
		System.out.println("\n===== RESULTADOS FINAIS =====");
		banco.imprimirContas();
		System.out.println("\n===== NOMES DOS CLIENTES =====");
		banco.imprimirNomesClientes();
		System.out.println("\n===== CONTAS DEVEDORAS =====");
		banco.imprimirContasDevedoras();
	}
}