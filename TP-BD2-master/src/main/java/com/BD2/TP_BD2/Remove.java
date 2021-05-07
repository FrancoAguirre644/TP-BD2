package com.BD2.TP_BD2;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Remove {

	public static void main(String[] args) {
        
		try {
			MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	        DB database = mongoClient.getDB("dataBase_1");
	        DBCollection collection = database.getCollection("people");
	        String _id = "12";
	        
			System.out.println("\nTraigo todos antes");
			DBCursor cursor = collection.find(new BasicDBObject()); //Triago todos
			for(DBObject obj: cursor ) {
       			System.out.println(obj); //Muestro el objeto completo
			}
			
			//Atualizo (le cambio el nombre)
			collection.remove(new BasicDBObject("_id",_id));
			
			System.out.println("\nTraigo todos después");
			DBCursor cursorPost = collection.find(new BasicDBObject()); //Triago todos
			for(DBObject obj: cursorPost ) {
				System.out.println(obj); //Muestro el objeto completo
			   System.out.println((String) obj.get("name")); //Muestro solo un atributo
			}
//			  collection.insert(person_created);		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
