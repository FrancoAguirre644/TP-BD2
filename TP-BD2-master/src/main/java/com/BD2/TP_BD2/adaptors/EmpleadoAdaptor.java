package com.BD2.TP_BD2.adaptors;

import com.BD2.TP_BD2.models.Empleado;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class EmpleadoAdaptor {
	
    public static final DBObject toDBObject(Empleado empleado) throws JsonProcessingException {
    	
		DBObject localidadCreada = new BasicDBObject("_id", empleado.getIdPersona())
	      .append("nombre", empleado.getNombre())
	      .append("apellido", empleado.getApellido())
	      .append("dni", empleado.getDni())
	      .append("cuit", empleado.getCuil())
	      .append("domicilio", DomicilioAdaptor.toDBObject(empleado.getDomicilio()))
	      .append("obra social", ObraSocialAdaptor.toDBObject(empleado.getObraSocial()))
	      .append("sucursal", SucursalAdaptor.toDBObject(empleado.getSucursal()));

		return localidadCreada;
  }
    

}
