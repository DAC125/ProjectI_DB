/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author Diego
 */
public class Conexion {
    //Connection con;
    String url = "jdbc:oracle:thin:@192.168.0.26:1521:diego";
    String user = "diego";
    String pass = "dac1701998";
   /*
    public Connection conectar(){
        try{
            System.out.println("hola");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url,user,pass);
        }catch (Exception e) {
            System.out.println("F");
        }
        return con;
    }*/
    
    
    public Statement conn() {
        try{
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Connecting..");
            Connection connection = DriverManager.getConnection(url,user,pass);
            Statement statement = connection.createStatement();
            return statement;   
        }catch (Exception e){
            System.out.println("The exception raiced is:" + e);
            return null;
        }
    }
}
