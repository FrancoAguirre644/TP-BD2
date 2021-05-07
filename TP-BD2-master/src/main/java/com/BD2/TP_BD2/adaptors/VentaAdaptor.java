package com.BD2.TP_BD2.adaptors;
import java.util.ArrayList;


import com.BD2.TP_BD2.models.ProductoXVenta;
import com.BD2.TP_BD2.models.Venta;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class VentaAdaptor {
	
    public static final DBObject toDBObject(Venta venta) throws JsonProcessingException {
    	    	
	ArrayList<DBObject> productos = new ArrayList<DBObject>();
    	
    	for(ProductoXVenta p : venta.getProductos()) {
    		productos.add(ProductoXVentaAdaptor.toDBObject(p));
    	}
    	
    	
		DBObject VentaCreada = new BasicDBObject("_id",venta.getIdVenta())
	      .append("fecha",venta.getFecha())
	      .append("numeroTicket",venta.getNumeroTicket())
	      .append("totalVenta",venta.getTotalVenta())
	      .append("formaDePago", venta.getFormaDePago())
	      .append("vendedor", EmpleadoAdaptor.toDBObject(venta.getVendedor()))
	      .append("cobrador",EmpleadoAdaptor.toDBObject(venta.getCobrador()) )
	      .append("sucursal", SucursalAdaptor.toDBObject(venta.getSucursal()))
	      .append("cliente", ClienteAdaptor.toDBObject(venta.getCliente()))
	      .append("productos", productos);;

		return VentaCreada;
  
  }
    
    
}