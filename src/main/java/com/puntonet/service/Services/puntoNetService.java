package com.puntonet.service.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.puntonet.service.entity.ticket_puntonet;
import com.puntonet.service.util.guardarTicket;

@ManagedBean(name="PuntoNetService")
@RequestScoped
public class puntoNetService {
	guardarTicket gu = new guardarTicket();
	ticket_puntonet ticket = new  ticket_puntonet();
	
	
	public List<ticket_puntonet>cargadatos(){
	gu = new guardarTicket();	
	return 	gu.AllTicket();
	}
	
	
	/*
	 * public List<ticket_puntonet> OpenTicket(String ticket){ return
	 * gu.OpenTicket(ticket) ; }
	 */
	
	/*
	 * public void editar (Integer id) { gu = new guardarTicket(); ticket = new
	 * ticket_puntonet(); ticket= gu.buscarticket(id);
	 * 
	 * }
	 */
	public String nuevo() {
	ticket = new ticket_puntonet();
	Map<String, Object> ticketNuevo= FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			ticketNuevo.put("ticker", ticket);
			System.out.println(ticketNuevo);
		return "/faces/nuevoTicket.xhtml";
	}
	
	public String guardarTicket(ticket_puntonet ticket) {
		gu.GuardarTicket(ticket);
		return "/faces/index.xhtml";

	}
	
}
