package cadastroPessoa;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class interfaceInteracaoCliente {
	private Map<String,Pessoa> usuarios;
	private Pessoa usuario;
	private int idadeMinVacin;
	
	public interfaceInteracaoCliente(HashMap<String, Pessoa> usuarios, int idadeMinVacin) {
		this.usuarios = usuarios;
		this.idadeMinVacin = idadeMinVacin;
	}

	public interfaceInteracaoCliente(int idadeMinVacin) {
		this.usuarios = new HashMap<String, Pessoa>();
		this.idadeMinVacin = idadeMinVacin;
	}
	
	public String logar(String cpf) {
		if(usuarios.containsKey(cpf)) {
			this.usuario = usuarios.get(cpf);
			return "login realizado com sucesso";
		}
		return "login mal sucedido";
	}
	
	public String cadastrar(String nome, String cpf, String sus, String email, String telefone, String profissao,
			Boolean comorbidades, LocalDate nascimento) {
		if(usuarios.containsKey(cpf))
			return "Usuario já cadastrado";
		Pessoa novoUsuario = new Pessoa(nome, cpf, sus, email, telefone, profissao, comorbidades, nascimento);
		usuarios.put(cpf, novoUsuario);
		return "Cadastro realizado com sucesso";
	}
	
	public void logoff() {
		this.usuario = null;
	}
	
	public void atualizar() {
		if(this.usuario != null) {
			this.usuario.atualizar(this.idadeMinVacin);
			System.out.println(this.usuario.getEstado()); 
		}
		else
			System.out.println("realize seu login com um usuario cadastrado");
	}
	
	public void tomarVacina() {
		if(this.usuario != null) {
			this.usuario.tomarVacina();
			System.out.println(this.usuario.getEstado());
		}
		else
			System.out.println("realize seu login com um usuario cadastrado");
	}
	
	public void setIdadeMinVacin(int novaIdade) {
		this.idadeMinVacin = novaIdade;
	}
	
	public int getIdadeMinVacin() {
		return this.idadeMinVacin;
	}
}