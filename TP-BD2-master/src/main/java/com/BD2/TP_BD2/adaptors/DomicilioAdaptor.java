package com.BD2.TP_BD2.adaptors;

import com.BD2.TP_BD2.models.Domicilio;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class DomicilioAdaptor {
	
    public static final DBObject toDBObject(Domicilio domicilio) throws JsonProcessingException {
    	
		DBObject domicilioCreado = new BasicDBObject("_id", domicilio.getIdDomicilio())
		  .append("numero", domicilio.getNumero())
		  .append("calle", domicilio.getCalle())
	      .append("localidad", LocalidadAdaptor.toDBObject(domicilio.getLocalidad()))
		  .append("provincia", ProvinciaAdaptor.toDBObject(domicilio.getProvincia()));

		return domicilioCreado;
  }

}
