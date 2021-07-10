//Gerente � um Funcionario, Gerente herda da classe Funcionario, assina o contrato Autenticavel � um Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
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

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do gerente");
		return super.getSalario();
	}

}
