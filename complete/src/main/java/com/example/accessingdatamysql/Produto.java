package com.example.accessingdatamysql;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity(name="produtos") 
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable = true)
	private String descricao;
	private String detalhes;
	private String  cod_barra;
	private String ficha;
	
	@OneToMany(mappedBy = "produto")
	private List<Loja> loja;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public String getCod_barra() {
		return cod_barra;
	}

	public void setCod_barra(String cod_barra) {
		this.cod_barra = cod_barra;
	}

	public String getFicha() {
		return ficha;
	}

	public void setFicha(String ficha) {
		this.ficha = ficha;
	}
	

	
      
	
}
