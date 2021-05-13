package com.BD2.TP_BD2.adaptors;

import org.bson.Document;

import com.BD2.TP_BD2.models.Empleado;


public class EmpleadoAdaptor {
	
    public static final Document toDBObject(Empleado empleado) {
    	
    	Document localidadCreada = new Document("_id", empleado.getIdPersona())
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
