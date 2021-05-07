package com.BD2.TP_BD2;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
//import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 * MongoDB testing!
 */
public class Insert {

	public static void main(String[] args) {
	     try {
	        	
	            MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	            DB database = mongoClient.getDB("dataBase_1");
	            DBCollection collection = database.getCollection("people");
	            String _id = "2";
	            Person p = new Person(_id, "Sergio Daniel 6",34182053);

//				DBObject person_created = new BasicDBObject("_id", p.getId())
//	                    .append("name", p.getName())
//	                    .append("dni", p.getDni());

	            DBObject person_created = PersonAdaptor.toDBObject(p); 

	            collection.insert(person_created);
        
			  //TRAIGO EL QUE SE AGREGÓ
			  DB databasePost = mongoClient.getDB("dataBase_1");
              DBCollection collectionPost = databasePost.getCollection("people");
			  DBCursor cursor = collectionPost.find(new BasicDBObject("_id", _id)); //Traigo el agregado y filtrado por el "_id"
				if(cursor.hasNext()) { 
				    DBObject obj = cursor.next();
				    System.out.println(obj); //Muestro el objeto completo
				}
				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
