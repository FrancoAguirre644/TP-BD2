package com.BD2.TP_BD2.adaptors;

import org.bson.Document;

import com.BD2.TP_BD2.models.Localidad;


public class LocalidadAdaptor {
	
    public static final Document toDBObject(Localidad localidad) {
    	    	
    	Document localidadCreada = new Document("_id", localidad.getIdLocalidad())
	      .append("nombre", localidad.getNombre());

		return localidadCreada;
  }
    
}