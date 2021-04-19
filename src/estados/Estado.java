package estados;

import cadastroPessoa.Pessoa;

public abstract class Estado {
	Pessoa pessoa;

	public Estado(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public Pessoa getPessoa() {
		return this.pessoa;
	}
	
	void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public abstract void atualizar(int idadeVacina);
	
	public abstract void tomarVacina();
}
