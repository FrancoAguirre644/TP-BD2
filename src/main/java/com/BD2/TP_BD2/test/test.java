package com.BD2.TP_BD2.test;

import java.net.UnknownHostException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.BD2.TP_BD2.adaptors.ClienteAdaptor;
import com.BD2.TP_BD2.adaptors.EmpleadoAdaptor;
import com.BD2.TP_BD2.adaptors.ObraSocialAdaptor;
import com.BD2.TP_BD2.adaptors.SucursalAdaptor;
import com.BD2.TP_BD2.adaptors.SucursalWithEmpleadosAdaptor;
import com.BD2.TP_BD2.adaptors.VentaAdaptor;
import com.BD2.TP_BD2.models.Cliente;
import com.BD2.TP_BD2.models.Domicilio;
import com.BD2.TP_BD2.models.Empleado;
import com.BD2.TP_BD2.models.Localidad;
import com.BD2.TP_BD2.models.ObraSocial;
import com.BD2.TP_BD2.models.Producto;
import com.BD2.TP_BD2.models.ProductoXVenta;
import com.BD2.TP_BD2.models.Provincia;
import com.BD2.TP_BD2.models.Sucursal;
import com.BD2.TP_BD2.models.Venta;
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
		
		
		LocalDate fecha1=LocalDate.of(2021,5, 1);
		LocalDate fecha2=LocalDate.of(2021,5, 2);
		LocalDate fecha3=LocalDate.of(2021,5, 3);
		LocalDate fecha4=LocalDate.of(2021,5, 4);
		LocalDate fecha5=LocalDate.of(2021,5, 5);
		
		ObraSocial obrasocial1 = new ObraSocial(1,"IOMA");
		ObraSocial obrasocial2 = new ObraSocial(2,"FEMEBA");
		ObraSocial obrasocial3 = new ObraSocial(3,"IOSE");
		ObraSocial obrasocial4 = new ObraSocial(4,"DOSUBA");
		ObraSocial obrasocial5 = new ObraSocial(5,"SANCOR");
		
		
		
		
		List<Cliente> clientes=  new ArrayList<Cliente>();
		clientes.add(new Cliente(1,"Gonzalez","Esteban",42356798,domicilio1,obrasocial1));
		clientes.add(new Cliente(2,"Rojas","Ariel",42356798,domicilio1,obrasocial3));
		clientes.add(new Cliente(3,"Manso","Lucas",42356798,domicilio1,obrasocial5));
		clientes.add(new Cliente(4,"Gracia","Franco",42356798,domicilio1,obrasocial3));
		clientes.add(new Cliente(5,"Gomez","Roberto",42356798,domicilio1,obrasocial2));
		
		
		
		
		List<Producto> productos=  new ArrayList<Producto>();
		productos.add(new Producto(33452,"Jarabe","STADA",1250,true));
		productos.add(new Producto(21345,"Ibupirac","Stiefel",1100,true));
		productos.add(new Producto(24567,"Crema","Nadia",2500,false));
		productos.add(new Producto(76345,"Perfume","Primor",2770,false));
		
		int cantidad1=26;
		int cantidad2=33;
		int cantidad3=24;
		int cantidad4=15;
		
		
		List<ProductoXVenta> productosXVenta=  new ArrayList<ProductoXVenta>();
		productosXVenta.add(new ProductoXVenta(1,productos.get(1),cantidad1,productos.get(1).getPrecio()*cantidad1,productos.get(1).getPrecio()));
		productosXVenta.add(new ProductoXVenta(2,productos.get(2),cantidad1,productos.get(2).getPrecio()*cantidad2,productos.get(2).getPrecio()));
		productosXVenta.add(new ProductoXVenta(3,productos.get(3),cantidad1,productos.get(3).getPrecio()*cantidad3,productos.get(3).getPrecio()));
		productosXVenta.add(new ProductoXVenta(4,productos.get(0),cantidad1,productos.get(0).getPrecio()*cantidad4,productos.get(0).getPrecio()));
		productosXVenta.add(new ProductoXVenta(5,productos.get(2),cantidad1,productos.get(2).getPrecio()*cantidad1,productos.get(2).getPrecio()));
		
		float TotalVenta=0;
		for(ProductoXVenta p : productosXVenta)
		{
			TotalVenta+=p.getTotal();
		}
		
		try {
			MongoClient mongoClient = null;
			mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	        DB database = mongoClient.getDB("TP_BD2");
	        
	        DBCollection ventaCollection = database.getCollection("venta");
	        
	        ventaCollection.insert(VentaAdaptor.toDBObject(  new Venta(1, LocalDate.now(),"34567",TotalVenta,"efectivo",empleados.get(1),empleados.get(2),sucursales.get(1),clientes.get(1),productosXVenta))    );
	        
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
