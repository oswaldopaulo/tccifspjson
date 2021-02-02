package com.example.accessingdatamysql;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="transacoes") 
public class Transacao {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; 
	private Integer idempresa; 
	private Integer iduser; 
	private String formpgto;  
	private double total; 
	private String status; 
	private LocalDate data_trans; 
	private String frete; 
	private double valorfrete;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "idempresa",nullable=false, insertable=false, updatable=false)
	private Empresas empresas;
  


	@OneToMany(mappedBy = "transacaoitem")
	private List<TransacaoItem> transacaoitem;
  
	
	public Empresas getEmpresa() {
		return empresas;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Integer getIdempresa() {
		return idempresa;
	}


	public void setIdempresa(Integer idempresa) {
		this.idempresa = idempresa;
	}


	public Integer getIduser() {
		return iduser;
	}


	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}


	public String getFormpgto() {
		return formpgto;
	}


	public void setFormpgto(String formpgto) {
		this.formpgto = formpgto;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public LocalDate getData_trans() {
		return data_trans;
	}


	public void setData_trans(LocalDate data_trans) {
		this.data_trans = data_trans;
	}


	public String getFrete() {
		return frete;
	}


	public void setFrete(String frete) {
		this.frete = frete;
	}


	public double getValorfrete() {
		return valorfrete;
	}


	public void setValorfrete(double valorfrete) {
		this.valorfrete = valorfrete;
	}

	  
	  
	 

}
