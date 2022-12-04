package modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="alunos")
public class Aluno{
		
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String nome;
		
	private String email;

	@Column(nullable = false)
	private String cpf;
		
	private String endereco;
		
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date nascimento;
		
	@Column(nullable = false)
	private String naturalidade;
		
		
	public Long getId() {
		return id;
	}
		
	public void setId(Long id) {
		this.id = id;
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
		
	public String getEmail() {
		return email;
	}
		
	public void setEmail(String email) {
		this.email = email;
	}
		
	public Date getNascimento() {
		return nascimento;
	}
		
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getNaturalidade() {
		return naturalidade;
	}
		
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
		
	public String getEndereco() {
		return endereco;
	}
		
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
