package sample;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.*;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import org.bson.BSONObject;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class MongoDBJDBC {

    public static void main( String args[] ) {

        try{

            // To connect to mongodb server
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );

            // Now connect to your databases
            DB db = mongoClient.getDB( "music" );
            System.out.println("Connect to database successfully");

           // boolean auth = db.authenticate(myUserName, myPassword);
            //System.out.println("Authentication: "+auth);

            DBCollection coll = db.createCollection("mycol", new BasicDBObject());


            System.out.println("Collection created successfully");
        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
