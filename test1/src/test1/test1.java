package test1;


import com.mongodb.MongoClientSettings;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.model.CreateCollectionOptions;
import com.mongodb.client.model.ValidationOptions;

import com.mongodb.MongoClientURI;

import java.util.Arrays;

import org.bson.Document;

public class test1 {

	public void run() {
		System.out.println("Start");
		
		MongoClientURI  uri = new MongoClientURI ("mongodb+srv://clay1:E5lM5qwrLYSrFo29@crb-cluster-pnwbv.gcp.mongodb.net/test?authSource=admin&replicaSet=CRB-Cluster-shard-0&readPreference=primary&appname=MongoDB%20Compass&ssl=true");
		
		MongoClient mongoClient = new MongoClient(uri);
		
		MongoDatabase database = mongoClient.getDatabase("MayTest");
		
		
		for (String name : database.listCollectionNames()) {
		    System.out.println(name);
		}
		
		
		MongoCollection<Document> coll = database.getCollection("MayCol");
		
		System.out.println("Count=" + coll.countDocuments());
		
		int counter=0;
	    MongoCursor cursor = coll.find().iterator();
	    while(cursor.hasNext()){
	        Document document = (Document)cursor.next();
	        System.out.println(String.format("Doc[%d]: %s %s ",++counter,document.get("name"),document.toString()));
//	        if(document != null){
//	            Filters.add(document.get(Constants.MONGO_ELEMENT_URL_FIELD_NAME).toString());
	        }
		
		
		
		
//		Object coll = database.getCollection("MayCol");
		
//		System.out.println(coll.toString());
		
				
//		MongoClient mongoClient = new MongoClient();
//		
//		CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
//                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
//		
//		MongoClient mc = new MongoClien
//				
//				("localhost", 27017);
//		
		
		System.out.println("Done");
	}

}
