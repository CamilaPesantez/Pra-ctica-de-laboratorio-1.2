package clases;
import java.util.ArrayList;
import java.util.List;


public class Carrito {
	private String direccion;
    private static List<Producto> productos;

    public Carrito() {
    	Carrito.productos = new ArrayList<>();
    }
    public Carrito(String direccion) {
        this.direccion=direccion;
    	Carrito.productos = new ArrayList<>();
    }

    public void agregarProducto(int opcion,String nombre, double precio) {
        productos.add(new Producto(opcion,nombre,precio));
        System.out.println("Producto agregado al carrito: "+ Producto.getNombre());
    }

    public static List<Producto> getProductos() {
        return productos;
    }

    public void vaciarCarrito() {
        productos.clear();
        System.out.println("Carrito vaciado.");
    }
	
	public String toString() {
		return "Carrito [direccion=" + direccion + ", productos=" + productos + "]";
	}
    
}
