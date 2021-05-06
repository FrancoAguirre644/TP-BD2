package com.BD2.TP_BD2.adaptors;

import com.BD2.TP_BD2.models.Provincia;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class ProvinciaAdaptor {
	
    public static final DBObject toDBObject(Provincia provincia) throws JsonProcessingException {
    	    	
		DBObject provinciaCreada = new BasicDBObject("_id", provincia.getIdProvincia())
	      .append("nombre", provincia.getNombre());
		
		return provinciaCreada;
  }
    
}