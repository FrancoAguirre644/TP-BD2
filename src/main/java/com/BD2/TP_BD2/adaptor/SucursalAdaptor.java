package com.BD2.TP_BD2.adaptor;

import com.BD2.TP_BD2.models.Sucursal;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class SucursalAdaptor {
	
    public static final DBObject toDBObject(Sucursal sucursal) throws JsonProcessingException {
    	    	
		DBObject sucursalCreada = new BasicDBObject("_id", sucursal.getIdSucursal())
	      .append("domicilio", DomicilioAdaptor.toDBObject(sucursal.getDomicilio()))
	      .append("punto De Venta", sucursal.getPuntoDeVenta());

		return sucursalCreada;
  }

}
