import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	// Novo método para imprimir todas as contas usando a Stream API
	public void imprimirContas() {
		System.out.println("--- Contas do " + this.nome + " ---");
		this.contas.stream()
				.forEach(conta -> conta.imprimirExtrato());
	}

	public void imprimirNomesClientes() {
		System.out.println("--- Clientes do " + this.nome + " ---");
		this.contas.stream()
				.map(conta -> conta.getCliente().getNome())
				.forEach(System.out::println);
	}

	public void imprimirContasDevedoras() {
		long numeroDeContasDevedoras = this.contas.stream()
				.filter(conta -> conta.getSaldo() < 0)
				.count(); // Conta quantos elementos passaram no filtro

		if (numeroDeContasDevedoras > 0) {
			System.out.println("--- Contas Devedoras ---");
			this.contas.stream()
					.filter(conta -> conta.getSaldo() < 0)
					.forEach(IConta::imprimirExtrato);
		} else {
			System.out.println("Não há contas devedoras no banco.");
		}
	 }
	}