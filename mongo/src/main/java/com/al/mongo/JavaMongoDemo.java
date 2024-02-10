package com.al.mongo;

import com.mongodb.MongoClient;  
import com.mongodb.client.MongoCollection;  
import com.mongodb.client.MongoDatabase;  
import org.bson.Document;

public class JavaMongoDemo {
	public static void main(String[] args){  
		try{  
		//---------- Connecting DataBase -------------------------//  
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );  
		//---------- Creating DataBase ---------------------------//  
		MongoDatabase db = mongoClient.getDatabase("Parth");  


		//MongoDatabase db1 = mongoClient.getDatabase("Aryan");//  

		//---------- Creating Collection -------------------------//  
		System.out.print("abc\n\n\n\n\n");
		MongoCollection<Document> table = db.getCollection("employee");  

		System.out.print("bbb\n\n\n\n\n");
		//---------- Creating Document ---------------------------//    
		Document doc = new Document("name", "Patel Utsav");  
		doc.append("id",2);  
		//----------- Inserting Data ------------------------------//  
		table.insertOne(doc);  
		//System.out.print(db.employee.find());
		mongoClient.close();
		}catch(Exception e){  
		System.out.println(e);  
		}  
	}
}
