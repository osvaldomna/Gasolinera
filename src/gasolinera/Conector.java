/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conector;

import java.sql.*;

public abstract class Conector {
    protected Connection c = null;
    
    protected int crearBD(){
        Statement stmt = null;

        try {
            stmt = c.createStatement();
            String sqlProductos = "CREATE TABLE productos" +
                           "(codigo integer primary key autoincrement," +
                           " nombre text, " + 
                           " precio real, " + 
                           " descripcion text, " + 
                           " existencia integer );";
            String sqlHistorial = "CREATE TABLE historial" +
                           "(folio integer primary key autoincrement," +
                           " nombre_producto text, " + 
                           " precio real, " +
                           " cantidad integer," +
                           " total real," +
                           " fecha text);";
        
            String sqlEmpleados = "CREATE TABLE empleados"+
                            "(nombre text, contrasena text, admin integer);";
         
            stmt.executeUpdate(sqlProductos);
            stmt.executeUpdate(sqlHistorial);
            stmt.executeUpdate(sqlEmpleados);
            stmt.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.out.println("las tablas ya existen");
         return -1;
      }
      System.out.println("Tablas created successfully");
      return 1;
    }
    
    public int iniciarConexion(){
        c = null;
      
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:gasolinera.db");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            return -1;
        }
        System.out.println("Opened database successfully");
        return 1;
    }
  
    public int cerrarConexion(){
        try{
                c.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
                return -1;
            }
        return 1;
    }
    
    
}
