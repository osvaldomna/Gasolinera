package conector;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ConectorProductos extends Conector{
	public String nombreBD = "gasolinera";

	public ConectorProductos(){
		iniciarConexion();
		crearBD();
		cerrarConexion();
	}

	public int insertarProducto(String nombre, Double precio, String descripcion, int existencia){
		Statement stmt = null;

		if(existeProducto(nombre)){
			System.out.println("el producto ya existe");
			return -1;
		}

		try{
			c.setAutoCommit(false);
			stmt = c.createStatement();
			String sql = "insert into productos(nombre,precio,descripcion,existencia) values('"+nombre+"',"+precio+",'"+descripcion+"',"+existencia+");";
			stmt.execute(sql);

			stmt.close();
			c.commit();

		}catch(SQLException e){
			System.out.println(e.getMessage());
		}

		return 1;
	}

	public boolean existeProducto(String nombre){
		Statement stmt = null;
		try{
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery( "SELECT nombre FROM productos where nombre='"+nombre+"';" );

			/*if(rs == null){
			rs.close();
			stmt.close();
			System.out.println("El producto ya existe!");
			return true;*/
			String nom = rs.getString("nombre");

			if(nom.isEmpty()){
				return false;
			}

			return true;


		} catch ( Exception e ) {
			System.out.println("ConectorProductos -> existeProducto(string nombre)");
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			return false;
		}
	}

	public boolean existeProducto(int codigo){
		Statement stmt = null;
		try {
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery( "SELECT nombre FROM productos where codigo='"+codigo+"';" );

			String nom = rs.getString("nombre");

			if(nom.isEmpty()){
				return false;
			}

			return true;
			} catch ( Exception e ) {
				System.out.println("ConectorProductos -> existeProducto(int codigo)");
				System.err.println( e.getClass().getName() + ": " + e.getMessage() );
				return false;

			}        
	}

	public Producto obtenerProducto(String nombre){
		Statement stmt = null;
		Producto producto = null;
		ResultSet rs = null;

		if(!existeProducto(nombre)) return null;

		try {
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			rs = stmt.executeQuery( "SELECT * FROM productos where nombre='"+nombre+"';" );

			producto = new Producto();

			producto.codigo = rs.getInt("codigo");
			producto.nombre = rs.getString("nombre");
			producto.precio = rs.getDouble("precio");
			producto.descripcion = rs.getString("descripcion");
			producto.existencia = rs.getInt("existencia");

		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			return null;
		}

		return producto;
	}

	public Producto obtenerProducto(int codigo){
		Statement stmt = null;
		Producto producto = null;
		ResultSet rs = null;

		if(!existeProducto(codigo)) return null;

		try {
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			rs = stmt.executeQuery( "SELECT * FROM productos where codigo='"+codigo+"';" );

			producto = new Producto();

			producto.codigo = rs.getInt("codigo");
			producto.nombre = rs.getString("nombre");
			producto.precio = rs.getDouble("precio");
			producto.descripcion = rs.getString("descripcion");
			producto.existencia = rs.getInt("existencia");

		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			return null;
		}

		return producto;
	}

	public int modificarProducto(Producto nuevo){
		Statement stmt = null;

		try {
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "UPDATE productos set " +
					"nombre='"+nuevo.nombre +
					"', precio="+nuevo.precio+
					" , descripcion='"+nuevo.descripcion+
					"', existencia="+nuevo.existencia+
					" where codigo="+nuevo.codigo+";";
			stmt.executeUpdate(sql);
			c.commit();
			stmt.close();
		} catch ( Exception e ) {
			System.out.println("ConectorProductos -> modificarProducto(Producto nuevo)");
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			return -1;
		}

		return 1;

	}

	public ArrayList<Producto> obtenerProductos(){
		ArrayList<Producto> productos = new ArrayList<Producto>();

		Statement stmt = null;
		ResultSet rs = null;

		try {
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			rs = stmt.executeQuery( "SELECT * FROM productos;" );

			while(rs.next()){
				int codigo = rs.getInt("codigo");
				String nombre = rs.getString("nombre");
				double precio = rs.getDouble("precio");
				String descripcion = rs.getString("descripcion");
				int existencia = rs.getInt("existencia");

				productos.add(new Producto(codigo, nombre, precio, descripcion, existencia));

			}

		} catch ( Exception e ) {
			System.out.println("ConectorProductos -> obtenerProductos()");
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			return null;
		}

		return productos;
	}

	public int retirarProductos(ArrayList<Producto> listaProductos){
		Statement stmt = null;

		try {
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();

			Iterator<Producto> iter = listaProductos.iterator();

			do{
				Producto prod = iter.next();
				
				prod.existencia = (prod.existencia) - 1;
				
				System.out.println(prod);

				if (modificarProducto(prod) == -1) return -1;
				
			}while(iter.hasNext());

			stmt.close();
		} catch ( Exception e ) {
			System.out.println("ConectorProductos -> retirarProductos()");
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			return -1;
		}
			System.out.println("Operation done successfully");
			return 1;
		}
}

