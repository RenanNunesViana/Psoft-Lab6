package estados;

import cadastroPessoa.Pessoa;

public class HabilitadoPDose extends Estado{

	public HabilitadoPDose(Pessoa pessoa) {
		super(pessoa);
	}
	
	public void tomarVacina() {
		super.pessoa.setEstado(new TomouPDose(pessoa));
	}
	
	public void atualizar(int idadeVacina) {
	
	}

	@Override
	public String toString() {
		return "Habilitado para tomar a primeira dose";
	}
}
