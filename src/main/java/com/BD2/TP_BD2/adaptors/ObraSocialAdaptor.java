package com.BD2.TP_BD2.adaptors;

import org.bson.Document;

import com.BD2.TP_BD2.models.ObraSocial;

public class ObraSocialAdaptor {
	
    public static final Document toDBObject(ObraSocial obraSocial) {
    	
    	Document obraSocialCreada = new Document("_id", obraSocial.getIdObraSocial())
	      .append("nombre", obraSocial.getNombre());

		return obraSocialCreada;
  }

}
