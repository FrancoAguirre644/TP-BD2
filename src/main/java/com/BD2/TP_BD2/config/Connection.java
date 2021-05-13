package com.BD2.TP_BD2.config;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connection {

    private String dbUri;
    private String dbName;
    private MongoDatabase mongoDatabase;
	private MongoClient mongoClient;
    private static Connection Connection = null;

    public static Connection getInstance() {

        if(Connection == null) {
            Connection = new Connection();
        }

        return Connection;
    }

    private Connection() {
    	
        Logger.getLogger("org.mongodb.driver").setLevel(Level.OFF);
        this.dbUri = "mongodb://localhost:27017";
        this.dbName = "TP_BD2";
        this.mongoClient = MongoClients.create();
        this.mongoDatabase = this.mongoClient.getDatabase(this.dbName);
        
    }

    public String getDbUri() {
        return dbUri;
    }
    
    public void setDbUri(String dbName) {
        this.dbName = dbName;
    }
    
    public String getDbName() {
        return dbName;
    }
    
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
    
    public MongoClient getMongoClient() {
        return this.mongoClient;
    }
    
    public MongoDatabase getMongoDatabase() {
        return this.mongoDatabase;
    }

}
