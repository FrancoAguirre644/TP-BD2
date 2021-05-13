package com.BD2.TP_BD2.adaptors;

import org.bson.Document;

import com.BD2.TP_BD2.models.Domicilio;


public class DomicilioAdaptor {
	
    public static final Document toDBObject(Domicilio domicilio) {
    	
    	Document domicilioCreado = new Document("_id", domicilio.getIdDomicilio())
		  .append("numero", domicilio.getNumero())
		  .append("calle", domicilio.getCalle())
	      .append("localidad", LocalidadAdaptor.toDBObject(domicilio.getLocalidad()))
		  .append("provincia", ProvinciaAdaptor.toDBObject(domicilio.getProvincia()));

		return domicilioCreado;
  }

}
