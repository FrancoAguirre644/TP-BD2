package com.BD2.TP_BD2.adaptors;

import org.bson.Document;

import com.BD2.TP_BD2.models.Sucursal;

public class SucursalAdaptor {
	
    public static final Document toDBObject(Sucursal sucursal) {
    	    	
    	Document sucursalCreada = new Document("_id", sucursal.getIdSucursal())
	      .append("domicilio", DomicilioAdaptor.toDBObject(sucursal.getDomicilio()))
	      .append("punto De Venta", sucursal.getPuntoDeVenta());

		return sucursalCreada;
  }

}
