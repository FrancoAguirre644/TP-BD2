package com.BD2.TP_BD2.adaptors;

import com.BD2.TP_BD2.models.Producto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class ProductoAdaptor {
	
    public static final DBObject toDBObject(Producto producto) throws JsonProcessingException {
    	    	
		DBObject productoCreado = new BasicDBObject("_id", producto.getCodigoNumerico())
	      .append("descripcion", producto.getDescripcion())
	      .append("laboratorio", producto.getLaboratorio())
	      .append("precio", producto.getPrecio())
	      .append("tipoProducto", producto.isTipoProducto());
		
		return productoCreado;
		
  }
    
}