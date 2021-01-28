package com.example.accessingdatamysql;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Columns;

@Entity(name="produtos_imagens") 
public class Produtos_imagens {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="id_produto")
	private Integer produto;
	private String imagem;
 
	public String getImagem() {
		return imagem;
	}

	public int getId() {
		return id;
	}

	public Integer getProduto() {
		return produto;
	}

	

	
	
	  
	  
	 

}
