
// Administrador � um Funcion�rio, Administrador herda da classe Funcion�rio e assina o contrato com o Autenticavel

public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}

	@Override
	public double getBonificacao() {
		return 50;
	}

}
