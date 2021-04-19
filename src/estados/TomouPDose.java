package estados;

import java.time.LocalDate;
import java.time.Period;

import cadastroPessoa.Pessoa;

public class TomouPDose extends Estado{
	
	LocalDate dataVacinaTomada; 
	
	public TomouPDose(Pessoa pessoa) {
		super(pessoa);
		this.dataVacinaTomada = LocalDate.now();
	}
	
	public void tomarVacina() {
		
	}
	
	public void atualizar(int idadeVacina) {
		if(Period.between(dataVacinaTomada, LocalDate.now()).getYears() >= idadeVacina) {
			super.pessoa.setEstado(new HabilitadoSDose(pessoa));
		}
	}
	
	@Override
	public String toString() {
		return "tomou a primeira dose";
	}
}
