/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class EstudianteDAO {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    public List listar() {
        List<Estudiante>lista =  new ArrayList<>();
        String sql = "select * from student";
        try{
            Statement st = c.conn();
            ResultSet resultset = st.executeQuery(sql);
            
            while (resultset.next()){
                Estudiante e = new Estudiante();
                e.setId(resultset.getString(1));
                e.setNombre(resultset.getString(2));
                e.setApellidos(resultset.getString(3));
                lista.add(e);
            }
            return lista;
            
        }catch (Exception e){
            System.out.println("no sirvio");
            return null;
        }
        
    }
    
}
