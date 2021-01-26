package com.example.accessingdatamysql;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name="loja") 
public class Loja {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idloja ;
	private int idempresa;
	private int idproduto;
	private double preco;
	private double desconto;
	private LocalDate datainicioloja;
	private LocalDate datafimloja;
	private LocalDate datainiciopromo;
	private LocalDate datafimpromo;
	private String ativo;
	private String destaque;
	private Integer demanda ;
	
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "idempresa",nullable=false, insertable=false, updatable=false)
	private Empresas empresas;
  

	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "idproduto",nullable=false, insertable=false, updatable=false)
	private Produto produto;
  
	public int getIdloja() {
		return idloja;
	}
	public int getIdempresa() {
		return idempresa;
	}
	public int getIdproduto() {
		return idproduto;
	}
	public double getPreco() {
		return preco;
	}
	public double getDesconto() {
		return desconto;
	}
	public LocalDate getDatainicioloja() {
		return datainicioloja;
	}
	public LocalDate getDatafimloja() {
		return datafimloja;
	}
	public LocalDate getDatainiciopromo() {
		return datainiciopromo;
	}
	public LocalDate getDatafimpromo() {
		return datafimpromo;
	}
	public String getAtivo() {
		return ativo;
	}
	public String getDestaque() {
		return destaque;
	}
	public Integer getDemanda() {
		return demanda;
	}
	public Empresas getEmpresa() {
		return empresas;
	}
	public Produto getProduto() {
		return produto;
	}
	  
	  
	  
	 

}
