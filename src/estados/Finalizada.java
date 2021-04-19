package estados;

import cadastroPessoa.Pessoa;

public class Finalizada extends Estado{

	public Finalizada(Pessoa pessoa) {
		super(pessoa);
	}
	
	public void tomarVacina() {
		
	}
	
	public void atualizar(int idadeVacina) {
	
	}
	
	@Override
	public String toString() {
		return "a duas doses da vacina foram tomadas";
	}
}
