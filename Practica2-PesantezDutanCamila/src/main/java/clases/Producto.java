package clases;

public class Producto {
    private int opcion;
	private static String nombre;
    private double precio;
	
    public Producto() {	
	}

	public Producto(int opcion,String nombre, double precio) {
		this.opcion = opcion;
		Producto.nombre = nombre;
		this.precio = precio;
	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	public static  String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		Producto.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	public String toString() {
		return "Producto [opcion=" + opcion + ", nombre=" + nombre + ", precio=" + precio + "]";
	}	
}
