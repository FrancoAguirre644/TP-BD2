package com.BD2.TP_BD2.adaptors;

import org.bson.Document;

import com.BD2.TP_BD2.models.ProductoXVenta;


public class ProductoXVentaAdaptor {
    public static final Document toDBObject(ProductoXVenta productoXVenta) {
    	
    	Document productoXVentaCreado = new Document("_id",productoXVenta.getIdProductoXVenta())
	      .append("producto", ProductoAdaptor.toDBObject(productoXVenta.getProducto()))
	      .append("cantidad", productoXVenta.getCantidad())
	      .append("total",productoXVenta.getTotal())
	      .append("precioUnitario",productoXVenta.getPrecioUnitario());
		
		return productoXVentaCreado;
		
  }
}




 
