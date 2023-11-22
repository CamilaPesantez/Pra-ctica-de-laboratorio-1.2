package clases;

import java.util.ArrayList;
import java.util.List;

public class Juguetes extends Producto {
    private String caracteristicas;

    public Juguetes(int opcion, String nombre, double precio, String caracteristicas) {
        super(opcion, nombre, precio);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public static List<Producto> obtenerProductosJuguete() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Juguetes(7, "Muñeca Barbie", 15.0, "Con accesorios"));
        productos.add(new Juguetes(8, "Carro de Control Remoto", 30.0, "Batería recargable"));
        productos.add(new Juguetes(9, "Rompecabezas Disney", 10.0, "100 piezas"));
        return productos;
    }

	@Override
	public String toString() {
		return super.toString() + "\n"+"Juguetes [caracteristicas=" + caracteristicas + "]";
	}
    
}