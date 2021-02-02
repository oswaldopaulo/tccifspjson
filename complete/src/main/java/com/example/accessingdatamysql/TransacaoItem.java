package com.example.accessingdatamysql;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity(name="transacoes_itens") 
public class TransacaoItem {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	@Column(name="id_trans")
	private Integer idtrans; 
	private Integer id_produto; 
	private String description; 
	private Integer quantity; 
	private Double price_unit;
	

	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getIdtrans() {
		return idtrans;
	}

	public void setId_trans(Integer idtrans) {
		this.idtrans = idtrans;
	}

	public Integer getId_produto() {
		return id_produto;
	}

	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice_unit() {
		return price_unit;
	}

	public void setPrice_unit(Double price_unit) {
		this.price_unit = price_unit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	
	

	
      
	
}
