package estados;

import cadastroPessoa.Pessoa;

public class HabilitadoSDose extends Estado{

	public HabilitadoSDose(Pessoa pessoa) {
		super(pessoa);
	}
	
public void tomarVacina() {
		super.pessoa.setEstado(new Finalizada(pessoa));
	}
	
	public void atualizar(int idadeVacina) {
	
	}
	
	@Override
	public String toString() {
		return "Habilitado para tomar a segunda dose";
	}
}
