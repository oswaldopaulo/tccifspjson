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
	
	
	
	private Integer id_trans; 
	private Integer id_produto; 
	private String description; 
	private Integer quantity; 
	private Double price_unit;
	

	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "id_trans",nullable=false, insertable=false, updatable=false)
	private TransacaoItem transacaoitem;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getId_trans() {
		return id_trans;
	}

	public void setId_trans(Integer id_trans) {
		this.id_trans = id_trans;
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

	

	
	

	
      
	
}
