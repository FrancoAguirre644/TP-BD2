package com.BD2.TP_BD2;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * MongoDB testing!
 */
public class FindAndGet 
{
    public static void main( String[] args )
    {
        
        try {
        	
			MongoClient mongoClient = new MongoClient();
			DB database = mongoClient.getDB("sample_training");
			DBCollection collection = database.getCollection("grades");
			
//			System.out.println(collection.findOne()); // Muestro el primero
			
			// OPCIÓN 1
			//	DBObject query = new BasicDBObject("_id", "1");
			//	DBCursor cursor = collection.find(query);   
			//OPCIÖN 2; DBCursor cursor = collection.find(new BasicDBObject("_id", "1"));
			//System.out.println(" Traigo uno, filtrado por _id= 1: ");
			//DBCursor cursor = collection.find(new BasicDBObject("_id", "1")); //Traigo uno y filtrado (si le saco el "_id", "1" trae el primero)
						
//			if(cursor.hasNext()) { 
//			    DBObject obj = cursor.next();
//			    System.out.println(obj); //Muestro el objeto completo
//			    System.out.println((String) obj.get("name")); //Muestro solo un atributo
//			}
//			
//			System.out.println("\nTriago varios filtrados por un criterio que no sea _id. ");
//			DBCursor cursor_2 = collection.find(new BasicDBObject("name", "Sergio Daniel")); //Triago varios filtrados por un criterio que no sea _id
//			for(DBObject obj: cursor_2 ) {
//				System.out.println(obj); //Muestro el objeto completo
//			   System.out.println((String) obj.get("name")); //Muestro solo un atributo
//			}
			
			System.out.println("\nTraigo todos");
			DBCursor cursor_3 = collection.find(new BasicDBObject()); //Triago todos
			for(DBObject obj: cursor_3 ) {
				System.out.println(obj); //Muestro el objeto completo
			   System.out.println((String) obj.get("name")); //Muestro solo un atributo
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
