package clases;

import java.util.ArrayList;
import java.util.List;

public class Ropa extends Producto {
    private String caracteristicas;

    public  Ropa(int opcion, String nombre, double precio, String caracteristicas) {
        super(opcion, nombre, precio);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public static List<Producto> obtenerProductosRopa() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Ropa(4, "Camiseta ", 25.0, ", Tallas disponibles"));
        productos.add(new Ropa(5, "Jeans", 60.0, "Tallas y colores variados"));
        productos.add(new Ropa(6, "Zapatos", 70.0, "Disponible en varias tallas"));
        return productos;
    }

	@Override
	public String toString() {
		return super.toString() + "\n"+"Ropa [caracteristicas=" + caracteristicas + "]";
	}

	
}