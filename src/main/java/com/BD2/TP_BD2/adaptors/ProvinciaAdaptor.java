package com.BD2.TP_BD2.adaptors;

import org.bson.Document;

import com.BD2.TP_BD2.models.Provincia;


public class ProvinciaAdaptor {
	
    public static final Document toDBObject(Provincia provincia) {
    	    	
    	Document provinciaCreada = new Document("_id", provincia.getIdProvincia())
	      .append("nombre", provincia.getNombre());
		
		return provinciaCreada;
  }
    
}