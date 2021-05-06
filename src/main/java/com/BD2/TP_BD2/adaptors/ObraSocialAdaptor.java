package com.BD2.TP_BD2.adaptors;

import com.BD2.TP_BD2.models.ObraSocial;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class ObraSocialAdaptor {
	
    public static final DBObject toDBObject(ObraSocial obraSocial) throws JsonProcessingException {
    	
		DBObject obraSocialCreada = new BasicDBObject("_id", obraSocial.getIdObraSocial())
	      .append("nombre", obraSocial.getNombre());

		return obraSocialCreada;
  }

}
