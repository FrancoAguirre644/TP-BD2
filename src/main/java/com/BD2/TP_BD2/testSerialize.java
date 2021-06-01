package com.BD2.TP_BD2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.bson.Document;

import com.BD2.TP_BD2.adaptors.DomicilioAdaptor;
import com.BD2.TP_BD2.adaptors.LocalidadAdaptor;
import com.BD2.TP_BD2.models.Domicilio;
import com.BD2.TP_BD2.models.Localidad;
import com.BD2.TP_BD2.models.Producto;
import com.BD2.TP_BD2.models.Provincia;
import com.BD2.TP_BD2.utils.Connection;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoCollection;

public class testSerialize {
	
	public static void main(String [] args) throws JsonGenerationException, JsonMappingException, IOException {
		/*
		ObjectMapper objectMapper = new ObjectMapper();
		
		Producto producto = new Producto(1, "Descripcion Producto", "Laboratorio 1", 4000, false);

		List<Producto> productos = new ArrayList<Producto>();
		
		productos.add(producto);
		
		objectMapper.writeValue(new File("target/producto.json"), producto);
		
		Localidad localidad = new Localidad(1, "Lanús");
		Provincia provincia = new Provincia(1, "Buenos aires");		
		Domicilio domicilio = new Domicilio(1, "Calle", 1, localidad, provincia);
		
		
		objectMapper.writeValue(new File("target/domicilio.json"), domicilio);
		
		*/
		/*
		
		MongoCollection<Document> domicilios = Connection.getInstance().getMongoDatabase().getCollection("domicilio");	
		
		Localidad localidad1 = new Localidad(1, "Localidad 1");
		
		
		Localidad localidad2 = new Localidad(2, "Localidad 2");
		Localidad localidad3 = new Localidad(2, "Localidad 3");
		
		Provincia provincia = new Provincia(1, "Provincia 1");		
		
		//Domicilios reservados para las sucursales
		Domicilio domicilio1 = new Domicilio(1, "Calle 1", 1, localidad1, provincia);
		
		domicilios.insertOne(DomicilioAdaptor.toDBObject(domicilio1));
		*/
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		
		/*
		objectMapper.writeValue(new File("target/producto.json"), producto);
		
		Localidad localidad = new Localidad(1, "Lanús");
		Provincia provincia = new Provincia(1, "Buenos aires");		
		Domicilio domicilio = new Domicilio(1, "Calle", 1, localidad, provincia);
		
		
		objectMapper.writeValue(new File("target/domicilio.json"), domicilio);
		
		*/
		
		
		
		
		
	}

}
