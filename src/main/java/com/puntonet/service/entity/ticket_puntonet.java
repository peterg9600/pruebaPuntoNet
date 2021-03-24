package com.puntonet.service.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket_puntonet")
public class ticket_puntonet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
	
	@Column
private String detalle_ticket;
	@Column
private String estado;
	@Column
private String prioridad;
	@Column
private String case_owner;
	@Column
private String fecha_vencimiento;
	@Column
private String ofertas;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDetalle_ticket() {
		return detalle_ticket;
	}
	public void setDetalle_ticket(String detalle_ticket) {
		this.detalle_ticket = detalle_ticket;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	public String getCase_owner() {
		return case_owner;
	}
	public void setCase_owner(String case_owner) {
		this.case_owner = case_owner;
	}
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	public String getOfertas() {
		return ofertas;
	}
	public void setOfertas(String ofertas) {
		this.ofertas = ofertas;
	}
	@Override
	public String toString() {
		return "ticket_puntonet [id=" + id + ", detalle_ticket=" + detalle_ticket + ", estado=" + estado
				+ ", prioridad=" + prioridad + ", case_owner=" + case_owner + ", fecha_vencimiento=" + fecha_vencimiento
				+ ", ofertas=" + ofertas + "]";
	}
	
	
	
}
