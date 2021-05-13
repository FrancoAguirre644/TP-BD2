package com.BD2.TP_BD2.adaptors;

import java.util.ArrayList;

import org.bson.Document;

import com.BD2.TP_BD2.models.Empleado;
import com.BD2.TP_BD2.models.Sucursal;


public class SucursalWithEmpleadosAdaptor {
	
    public static final Document toDBObject(Sucursal sucursal) {
    	
    	ArrayList<Document> empleados = new ArrayList<Document>();
    	
    	for(Empleado e : sucursal.getEmpleados()) {
    		empleados.add(EmpleadoAdaptor.toDBObject(e));
    	}
    	
    	Document sucursalCreada = new Document("_id", sucursal.getIdSucursal())
	      .append("domicilio", DomicilioAdaptor.toDBObject(sucursal.getDomicilio()))
	      .append("punto De Venta", sucursal.getPuntoDeVenta())
	      .append("punto De Venta", sucursal.getPuntoDeVenta())
	      .append("empleados", empleados);

		return sucursalCreada;
  }


}
