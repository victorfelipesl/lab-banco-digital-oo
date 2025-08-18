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
}