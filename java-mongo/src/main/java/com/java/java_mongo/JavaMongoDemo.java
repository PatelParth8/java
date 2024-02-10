package com.java.java_mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class JavaMongoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MongoClient mongoclient = new MongoClient("localhost", 27017);
			
			MongoDatabase db = mongoclient.getDatabase("Devarsh");
			
			MongoCollection<Document> table = db.getCollection("employee");
			
			Document doc = new Document("Name", "Utsav");
			doc.append("id", 1);
			doc.append("lname", "Patel");
			
			table.insertOne(doc);
			
			mongoclient.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
