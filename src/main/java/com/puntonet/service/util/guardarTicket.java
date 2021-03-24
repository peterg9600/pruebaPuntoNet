package com.puntonet.service.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.puntonet.service.entity.ticket_puntonet;

public class guardarTicket {
	EntityManager entity = utilJPA.getEntityManagerFactory().createEntityManager();
	
	
	public void GuardarTicket(ticket_puntonet ticket) {
		entity.getTransaction().begin();
		entity.persist(ticket);
		entity.getTransaction().commit();
		//utilJPA.shutdown();
		
	}
	
	
public void editarTicket(ticket_puntonet ticket) {
entity.getTransaction().begin();
entity.merge(ticket);
entity.getTransaction().commit();
utilJPA.shutdown();
}


	/*
	 * public List<ticket_puntonet> OpenTicket(String id) { List<ticket_puntonet>
	 * ticket= new ArrayList<ticket_puntonet>(); Query query =
	 * entity.createQuery("SELECT C FROM ticket_puntonet C where C.estado="+id);
	 * ticket= query.getResultList(); return ticket;
	 * 
	 * }
	 */

public List<ticket_puntonet> AllTicket(){
	List<ticket_puntonet> ticket= new ArrayList<ticket_puntonet>();
	Query query = entity.createQuery("SELECT C FROM ticket_puntonet C");
	ticket=query.getResultList();
	System.out.println(ticket);
	return ticket;
	
}

}
