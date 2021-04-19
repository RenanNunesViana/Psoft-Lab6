package cadastroPessoa;

import java.time.LocalDate;

import estados.*;

public class Pessoa {
	private String nome;
	private String cpf;
	private String sus;
	private String email;
	private String telefone;
	private String profissao;
	private Boolean comorbidades;
	private LocalDate nascimento;
	
	private Estado estado;

	public Pessoa(String nome, String cpf, String sus, String email, String telefone, String profissao,
			Boolean comorbidades, LocalDate nascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sus = sus;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.comorbidades = comorbidades;
		this.nascimento = nascimento;
		this.estado = new NaoHabilitado(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSus() {
		return sus;
	}

	public void setSus(String sus) {
		this.sus = sus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Boolean getComorbidades() {
		return comorbidades;
	}

	public void setComorbidades(Boolean comorbidades) {
		this.comorbidades = comorbidades;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void atualizar(int idadeVacina) {
		this.estado.atualizar(idadeVacina);
	}
	
	public void tomarVacina() {
		this.estado.tomarVacina();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
}
