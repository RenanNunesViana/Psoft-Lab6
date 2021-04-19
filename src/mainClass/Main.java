package mainClass;

import java.time.LocalDate;

import cadastroPessoa.interfaceInteracaoCliente;

public class Main {

	public static void main(String[] args) {
		
		interfaceInteracaoCliente iic = new interfaceInteracaoCliente(60);
		iic.cadastrar("Renan", "000.000.000.00", "1111111111", "2222222222", "33333333333", "estudante", false, LocalDate.of(1993, 12, 21));
		iic.atualizar();
		iic.logar("000.000.000.00");
		iic.atualizar();
		iic.setIdadeMinVacin(20);
		iic.atualizar();
		iic.tomarVacina();
	}
}
