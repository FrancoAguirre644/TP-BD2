package com.BD2.TP_BD2.adaptors;

import org.bson.Document;

import com.BD2.TP_BD2.models.Cliente;


public class ClienteAdaptor {
	
    public static final Document toDBObject(Cliente cliente) {
    	
    	Document clienteCreado = new Document("_id", cliente.getIdPersona())
	      .append("nombre", cliente.getNombre())
	      .append("apellido", cliente.getApellido())
	      .append("apellido", cliente.getApellido())
	      .append("dni", cliente.getDni())
	      .append("dni", cliente.getDni())
	      .append("domicilio", DomicilioAdaptor.toDBObject(cliente.getDomicilio()))
		  .append("obra social", ObraSocialAdaptor.toDBObject(cliente.getObraSocial()));

		return clienteCreado;
  }

}
