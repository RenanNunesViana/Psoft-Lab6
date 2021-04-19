package estados;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

import cadastroPessoa.Pessoa;

public class NaoHabilitado extends Estado {

	static final List<String> listaProfissoes = Arrays.asList("saude", "professor", "penitenciario", "policial", "militar", "bombeiro", "motorista", "piloto", "caminhoneiro");
	
	public NaoHabilitado(Pessoa pessoa) {
		super(pessoa);	
	}

	public void tomarVacina() {
	
	}
	
	public void atualizar(int idadeVacina) {
		if(super.pessoa.getComorbidades() || listaProfissoes.contains(super.pessoa.getProfissao()) || 
				Period.between(super.pessoa.getNascimento(), LocalDate.now()).getYears() >= idadeVacina) {
			super.pessoa.setEstado(new HabilitadoPDose(pessoa));
		}
	}

	@Override
	public String toString() {
		return "Não Habilitado";
	}
	
	
}
