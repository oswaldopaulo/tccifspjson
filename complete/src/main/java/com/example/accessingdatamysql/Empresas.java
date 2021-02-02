package com.example.accessingdatamysql;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="empresas") 
public class Empresas {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String  nome;
	private String telefone;
	private String celular;
	private Integer  cep_end;
	private String num_end;
	private String observacao;
	private String  compl_num_end;
	private String cpf;
	private String  email;
	private String  des_end;
	private String  bairro;
	private String  des_cidade;
	private String  des_uf;
	private String  ativo;
	private String  token;
	
	@OneToMany(mappedBy = "empresas")
	private List<Loja> loja;
	
	
	
	public String getToken() {
		return token;
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getCelular() {
		return celular;
	}
	public int getCep_end() {
		if (cep_end == null) {
			return 0;
		} else {
			return cep_end;
		}
	}
	public String getNum_end() {
		return num_end;
	}
	public String getObservacao() {
		return observacao;
	}
	public String getCompl_num_end() {
		return compl_num_end;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEmail() {
		return email;
	}
	public String getDes_end() {
		return des_end;
	}
	public String getBairro() {
		return bairro;
	}
	public String getDes_cidade() {
		return des_cidade;
	}
	public String getDes_uf() {
		return des_uf;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public void setCep_end(Integer cep_end) {
		this.cep_end = cep_end;
	}
	public void setNum_end(String num_end) {
		this.num_end = num_end;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public void setCompl_num_end(String compl_num_end) {
		this.compl_num_end = compl_num_end;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDes_end(String des_end) {
		this.des_end = des_end;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setDes_cidade(String des_cidade) {
		this.des_cidade = des_cidade;
	}
	public void setDes_uf(String des_uf) {
		this.des_uf = des_uf;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
      
	
}
