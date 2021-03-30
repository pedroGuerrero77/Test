package com.evaluacion.pedidos.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pedidos_W")
public class PedidosW implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double total;

	@Column(name = "date_Sale")
	private Date date_Sale;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Date getDateSale() {
		return date_Sale;
	}

	public void setDateSale(Date dateSale) {
		date_Sale = dateSale;
	}

	@Override
	public String toString() {
		return "PedidosW [id=" + id + ", total=" + total + ", DateSale=" + date_Sale + "]";
	}

}
