package com.BD2.TP_BD2.adaptor;

import com.BD2.TP_BD2.models.Cliente;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class ClienteAdaptor {
	
    public static final DBObject toDBObject(Cliente cliente) throws JsonProcessingException {
    	
		DBObject clienteCreado = new BasicDBObject("_id", cliente.getIdPersona())
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
