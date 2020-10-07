/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class ProductoDAO {

    ResultSet resultSet;
    Conexion conexion = new Conexion();
    ConexionMongo conexionMongo = new ConexionMongo();

    public List listarProducto() {
        List<Producto> lista = new ArrayList<>();
        String sql = "select * from producto";
        try {
            Statement statement = conexion.conn();
            ResultSet resultset = statement.executeQuery(sql);

            while (resultset.next()) {
                Producto producto = new Producto();
                producto.setId(resultset.getString(1));
                producto.setNombre(resultset.getString(2));
                producto.setPrecio(resultset.getInt(3));
                
                producto.setUrlImagen();
                lista.add(producto);
            }
            statement.close();
            return lista;

        } catch (Exception e) {
            System.out.println("Hubo un error inesperado en la consulta. El error es: " + e);
            return null;
        }

    }

}
