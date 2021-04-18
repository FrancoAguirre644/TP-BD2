package com.BD2.TP_BD2;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Update {

	public static void main(String[] args) {
		try {
			MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	        DB database = mongoClient.getDB("dataBase_1");
	        DBCollection collection = database.getCollection("people");
	        String _id = "2";
	        String nuevo_nombre = "Jorge Daniel";
	        
	        System.out.println(" Antes de actualizar traigo el que tiene _id="+_id+": ");
			DBCursor cursor = collection.find(new BasicDBObject("_id", _id)); //Traigo uno y filtrado (si le saco el "_id" trae el primero)	
			if(cursor.hasNext()) { 
			    DBObject obj = cursor.next();
			    System.out.println(obj); //Muestro el objeto completo
			}
			
			//Atualizo (le cambio el nombre)
			collection.update(new BasicDBObject("_id", _id),new BasicDBObject("name", nuevo_nombre));
			
			System.out.println(" Después de actualizar traigo el que tiene _id="+_id+": ");
			DBCursor cursorPost = collection.find(new BasicDBObject("_id", _id)); //Traigo uno y filtrado (si le saco el "_id" trae el primero)	
			if(cursorPost.hasNext()) { 
			    DBObject obj = cursorPost.next();
			    System.out.println(obj); //Muestro el objeto completo
			}
//			  collection.insert(person_created);		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
