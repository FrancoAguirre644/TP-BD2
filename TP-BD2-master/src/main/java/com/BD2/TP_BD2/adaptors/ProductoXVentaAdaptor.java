package com.BD2.TP_BD2.adaptors;

import com.BD2.TP_BD2.models.ProductoXVenta;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class ProductoXVentaAdaptor {
    public static final DBObject toDBObject(ProductoXVenta productoXVenta) throws JsonProcessingException {
    	
		DBObject productoXVentaCreado = new BasicDBObject("_id",productoXVenta.getIdProductoXVenta() )
	      .append("producto", ProductoAdaptor.toDBObject(productoXVenta.getProducto()))
	      .append("cantidad", productoXVenta.getCantidad())
	      .append("total",productoXVenta.getTotal())
	      .append("precioUnitario",productoXVenta.getPrecioUnitario());
		
		return productoXVentaCreado;
		
  }
}




 
