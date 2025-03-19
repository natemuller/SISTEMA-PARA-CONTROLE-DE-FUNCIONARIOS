
public class Funcionario {

	private String Id;

	private String nomeCompleto;

	private String dataContratacao;

	private double salarioHora;

	public Funcionario(String Id, String nomeCompleto, String dataContratacao, double salarioHora) {
		this.Id = "";
		this.nomeCompleto = "";
		this.dataContratacao = "00/00/0000";
		this.salarioHora = 0;
	}

	public String getId() {
		return Id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getDataContratacao() {
		return dataContratacao;
	}

	public double getSalarioHora() {
		return salarioHora;
	}
}
