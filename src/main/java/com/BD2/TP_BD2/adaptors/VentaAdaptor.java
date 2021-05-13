package com.BD2.TP_BD2.adaptors;
import java.util.ArrayList;

import org.bson.Document;

import com.BD2.TP_BD2.models.ProductoXVenta;
import com.BD2.TP_BD2.models.Venta;

public class VentaAdaptor {
	
    public static final Document toDBObject(Venta venta) {
    	    	
	ArrayList<Document> productos = new ArrayList<Document>();
    	
    	for(ProductoXVenta p : venta.getProductos()) {
    		productos.add(ProductoXVentaAdaptor.toDBObject(p));
    	}
    	
    	
    	Document VentaCreada = new Document("_id",venta.getIdVenta())
	      .append("fecha",venta.getFecha().toString())
	      .append("numeroTicket",venta.getNumeroTicket())
	      .append("totalVenta",venta.getTotalVenta())
	      .append("formaDePago", venta.getFormaDePago())
	      .append("vendedor", EmpleadoAdaptor.toDBObject(venta.getVendedor()))
	      .append("cobrador",EmpleadoAdaptor.toDBObject(venta.getCobrador()) )
	      .append("sucursal", SucursalAdaptor.toDBObject(venta.getSucursal()))
	      .append("cliente", ClienteAdaptor.toDBObject(venta.getCliente()))
	      .append("productos", productos);

		return VentaCreada;
  
  }
    
    
}