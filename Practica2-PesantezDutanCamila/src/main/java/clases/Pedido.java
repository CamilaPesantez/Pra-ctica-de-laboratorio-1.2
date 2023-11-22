package clases;


public class Pedido {
	private String nombre;
	private String direccion;
    private double total;
    
	public Pedido() {
	}
	public Pedido(String nombre, String direccion, double total) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.total = total;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public String toString() {
		return "Pedido [nombre=" + nombre + ", direccion=" + direccion + ", total=" + total + "]";
	}
	public void agregarPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}   

}
