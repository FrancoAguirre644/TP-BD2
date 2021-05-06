package com.BD2.TP_BD2.test;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.BD2.TP_BD2.adaptors.ClienteAdaptor;
import com.BD2.TP_BD2.adaptors.EmpleadoAdaptor;
import com.BD2.TP_BD2.adaptors.ObraSocialAdaptor;
import com.BD2.TP_BD2.adaptors.SucursalAdaptor;
import com.BD2.TP_BD2.adaptors.SucursalWithEmpleadosAdaptor;
import com.BD2.TP_BD2.models.Cliente;
import com.BD2.TP_BD2.models.Domicilio;
import com.BD2.TP_BD2.models.Empleado;
import com.BD2.TP_BD2.models.Localidad;
import com.BD2.TP_BD2.models.ObraSocial;
import com.BD2.TP_BD2.models.Provincia;
import com.BD2.TP_BD2.models.Sucursal;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class test {
	
	public static void main(String [] args) throws JsonProcessingException {
		
		Localidad localidad1 = new Localidad(1, "Localidad 1");
		Localidad localidad2 = new Localidad(2, "Localidad 2");
		Localidad localidad3 = new Localidad(2, "Localidad 3");
		
		Provincia provincia = new Provincia(1, "Provincia 1");		
		
		Domicilio domicilio1 = new Domicilio(1, "Calle 1", 1, localidad1, provincia);
		Domicilio domicilio2 = new Domicilio(2, "Calle 2", 2, localidad2, provincia);
		Domicilio domicilio3 = new Domicilio(3, "Calle 3", 2, localidad3, provincia);
		
		List<Sucursal> sucursales = new ArrayList<Sucursal>();
		
		sucursales.add(new Sucursal(1, domicilio1, "10000001"));
		sucursales.add(new Sucursal(2, domicilio2, "10000002"));
		sucursales.add(new Sucursal(3, domicilio3, "10000003"));
		
		List<ObraSocial> obrasSociales = new ArrayList<ObraSocial>();
				
		for(int i=1;i<=6;i++) {
			obrasSociales.add(new ObraSocial(i, "Obra Social " + i));
		}
		
		try {
			MongoClient mongoClient = null;
			mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	        DB database = mongoClient.getDB("TP_BD2");
	        
	        DBCollection collectionSucursal = database.getCollection("sucursal");
	        DBCollection collectionObraSocial = database.getCollection("obrasSocial");
	        DBCollection collectionCliente = database.getCollection("cliente");
	        DBCollection collectionEmpleado = database.getCollection("empleado");
	        	        
	        for(Sucursal s : sucursales) {
	        	collectionSucursal.insert(SucursalAdaptor.toDBObject(s));
	        }
	        
	        for(ObraSocial o : obrasSociales) {
	        	collectionObraSocial.insert(ObraSocialAdaptor.toDBObject(o));
	        }
	        
	        collectionCliente.insert(ClienteAdaptor.toDBObject(new Cliente(1, "Aguirre", "Franco", 42200255, domicilio3, obrasSociales.get(1))));
	        collectionEmpleado.insert(EmpleadoAdaptor.toDBObject(new Empleado(2, "Aguirre", "Franco", 42200255, domicilio1, obrasSociales.get(1), "20422002554", sucursales.get(1))));
	        
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Empleado> empleados =  new ArrayList<Empleado>();
		empleados.add(new Empleado(1, "Aguirre", "Franco", 42200255, domicilio1, obrasSociales.get(1), "20422002554", sucursales.get(1)));
		empleados.add(new Empleado(2, "Aguirre", "Franco", 42200255, domicilio1, obrasSociales.get(1), "20422002554", sucursales.get(1)));
		empleados.add(new Empleado(3, "Aguirre", "Franco", 42200255, domicilio1, obrasSociales.get(1), "20422002554", sucursales.get(1)));
		
		try {
			MongoClient mongoClient = null;
			mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	        DB database = mongoClient.getDB("TP_BD2");
	        
	        DBCollection collectionSucursal = database.getCollection("sucursal");
	        
	        collectionSucursal.insert(SucursalWithEmpleadosAdaptor.toDBObject(new Sucursal(4, domicilio3, "10000003", empleados)));
	        System.out.println(collectionSucursal.findOne(new BasicDBObject("_id", 4)));
	        
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
