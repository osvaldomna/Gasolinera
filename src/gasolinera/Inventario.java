package conector;

import java.util.ArrayList;

public class Inventario {
    public int numeroProductos;
    private ArrayList<Producto> listaProductos;
    private ConectorProductos c;
    
    public Inventario(){
	c = new ConectorProductos();
	
	c.iniciarConexion();
	recuperarInventario();
    }

	 public Inventario(ConectorProductos cn){
	c = cn;
	
	c.iniciarConexion();
	recuperarInventario();
    }
    
    public void recuperarInventario(){
        this.listaProductos = c.obtenerProductos();
    }
    
    public ArrayList<Producto> obtenerProductos(){
        return this.listaProductos;
    }
    
    public Producto obtenerProducto(String nombreProducto){
        return this.c.obtenerProducto(nombreProducto);
    }
    
    public Producto obtenerProducto(int codigoProducto){
        return this.c.obtenerProducto(codigoProducto);
    }
    
    public void retirarProductos(ArrayList<Producto> listaProductos){
        
    }
    

}
