package conector;

public class Producto {
    public int codigo = 0;
    public String nombre = null;
    public String descripcion = null;
    public double precio = 0;
    public int existencia = 0;
       
    public Producto(){
    
    }
    
    public Producto(int c, String n, double p, String d, int e){
        this.codigo = c;
        this.nombre = n;
        this.precio = p;
        this.descripcion = d;
        this.existencia = e;
    }
    
    public Producto(Producto prod){
        this.codigo = prod.codigo;
        this.nombre = prod.nombre;
        this.descripcion = prod.descripcion;
        this.precio = prod.precio;
        this.existencia = prod.existencia;
    }
    
    @Override
    public String toString(){
        String res = "codigo: "+this.codigo+", nombre: "+this.nombre+", precio: "+this.precio+", descripcion: "+this.descripcion+", existencia: "+this.existencia;
        
        return res;
    }
	
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
}
