/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class ConexionMongo {
    
    DB db;
    DBCollection estudiantes;
    public ConexionMongo() {
        try {
            
           Mongo mongo = new Mongo("LocalHost",27017);
           db = mongo.getDB("prueba");
           estudiantes = db.getCollection("estudiantes");
           DBCursor  cursor = estudiantes.find();
           while(cursor.hasNext()){
               System.out.println(cursor.next());
           }
        } catch (UnknownHostException ex) {
            Logger.getLogger(ConexionMongo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
