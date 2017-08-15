package Mongo;

import com.mongodb.*;

import java.util.ArrayList;


public class MongoConnection {
    MongoClient mongo;
    DB db;
    DBCollection table;
    public void createConnection(){
        mongo = new MongoClient("localhost",27017);
    }

    @Deprecated
    public void createDatabase(){
        db = mongo.getDB("Prueba");
        table = db.getCollection("comand");
    }

    public void createComand(String comand){
        BasicDBObject obj = new BasicDBObject();
        obj.put("Command",comand);
        table.insert(obj);
    }

    public ArrayList printHistory(){
        DBCursor cursor = table.find();
        ArrayList history = new ArrayList();
        while (cursor.hasNext()) {
            history.add(cursor.next());
        }
        return history;
    }
}
