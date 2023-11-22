package clases;

import java.util.ArrayList;
import java.util.List;

public class Electronicos extends Producto{
    private String caracteristicas;
 
    public Electronicos(int opcion,String nombre, double precio, String caracteristicas) {
        super(opcion,nombre,precio);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public static List<Producto> obtenerProductosElectronicos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Electronicos(1,"Teléfono Samsung",800.0, "Cámara de 48MP"));
        productos.add(new Electronicos(2, "Laptop HP", 1200.0, "Procesador Intel i7"));
        productos.add(new Electronicos(3, "Auriculares Bluetooth", 50.0, "Batería de larga duración"));
        return productos;
    }

	@Override
	public String toString() {
		return super.toString() + "\n"+"Electronicos [caracteristicas=" + caracteristicas + "]";
	}
    
}
	
