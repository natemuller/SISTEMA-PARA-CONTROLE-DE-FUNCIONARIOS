public class Ponto {

	private Funcionario funcionario;

	private String data;

	private String checkIn;

	private String checkOut;

	public Ponto(Funcionario funcionario, String data, String checkIn, String checkOut) {
		this.funcionario = funcionario;
		this.data = data;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public String getData() {
		return data;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

}
