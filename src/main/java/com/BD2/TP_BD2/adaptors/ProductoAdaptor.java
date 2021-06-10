package com.BD2.TP_BD2.adaptors;

import org.bson.Document;

import com.BD2.TP_BD2.models.Producto;

public class ProductoAdaptor {
	
    public static final Document toDBObject(Producto producto) {
    	    	
    	Document productoCreado = new Document("_id", producto.getCodigoNumerico())
	      .append("descripcion", producto.getDescripcion())
	      .append("laboratorio", producto.getLaboratorio())
	      .append("precio", producto.getPrecio())
	      .append("tipoDeProducto", producto.getTipoDeProducto());
		
		return productoCreado;
		
  }
    
}