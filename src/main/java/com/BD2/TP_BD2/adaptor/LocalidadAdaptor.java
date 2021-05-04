package com.BD2.TP_BD2.adaptor;

import com.BD2.TP_BD2.models.Localidad;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class LocalidadAdaptor {
	
    public static final DBObject toDBObject(Localidad localidad) throws JsonProcessingException {
    	    	
		DBObject localidadCreada = new BasicDBObject("_id", localidad.getIdLocalidad())
	      .append("nombre", localidad.getNombre());

		return localidadCreada;
  }
    
}