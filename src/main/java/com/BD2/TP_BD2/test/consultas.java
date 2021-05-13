package com.BD2.TP_BD2.test;

import java.net.UnknownHostException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class consultas {
	
	public static void main(String [] args) throws JsonProcessingException {
		
		try {
			MongoClient mongoClient = null;
			mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	        DB database = mongoClient.getDB("TP_BD2");
	        
	        DBCursor cursor = database.getCollection("venta").find();
	        while(cursor.hasNext())
	        {
	        	//TOTAL POR SUCURSAL
	        	//System.out.println(cursor.next()); //MUESTRA TODOS LOS CAMPOS DEL REGISTRO
	        	System.out.println(cursor.next().get("totalVenta")); //MUESTRA SOLO UN CAMPO DEL REGISTRO
	        }
	        
	        
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
		
		
		
		
	}

}
