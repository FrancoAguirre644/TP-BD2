package com.BD2.TP_BD2.adaptors;

import java.util.ArrayList;

import com.BD2.TP_BD2.models.Empleado;
import com.BD2.TP_BD2.models.Sucursal;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class SucursalWithEmpleadosAdaptor {
	
    public static final DBObject toDBObject(Sucursal sucursal) throws JsonProcessingException {
    	
    	ArrayList<DBObject> empleados = new ArrayList<DBObject>();
    	
    	for(Empleado e : sucursal.getEmpleados()) {
    		empleados.add(EmpleadoAdaptor.toDBObject(e));
    	}
    	
		DBObject sucursalCreada = new BasicDBObject("_id", sucursal.getIdSucursal())
	      .append("domicilio", DomicilioAdaptor.toDBObject(sucursal.getDomicilio()))
	      .append("punto De Venta", sucursal.getPuntoDeVenta())
	      .append("punto De Venta", sucursal.getPuntoDeVenta())
	      .append("empleados", empleados);

		return sucursalCreada;
  }


}
