package test;
	import java.util.List;
import java.util.Scanner;

import clases.Carrito;
import clases.Electronicos;
import clases.Juguetes;
import clases.Pedido;
import clases.Producto;
import clases.Ropa;
import clases.Usuario;
	
	public class Principal {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        Usuario usuario = null;
	
	        while (true) {
	            System.out.println("Bienvenido");
	            System.out.println("1. Registrarse");
	            System.out.println("2. Iniciar sesión");
	            System.out.println("3. Salir");
	            System.out.print("Seleccione una opción: ");
	
	            int opcion = scanner.nextInt();
	
	            switch (opcion) {
	                case 1:
	                    System.out.print("Ingrese su nombre: ");
	                    String nombre = scanner.next();
	                    System.out.print("Ingrese su apellido: ");
	                    String apellido = scanner.next();
	                    System.out.print("Ingrese su cedula: ");
	                    int cedula = scanner.nextInt();
	                    System.out.print("Ingrese su numero de telefono: ");
	                    int celular = scanner.nextInt();
	                    System.out.print("Ingrese su correo: ");
	                    String correo = scanner.next();
	                    usuario = new Usuario(nombre, apellido,cedula,correo,celular);
	                    System.out.println("¡Registro exitoso!");
	                    break;
	
	                case 2:
	                    if (usuario == null) {
	                        System.out.println("Por favor, regístrese primero.");
	                    } else {
	                        mostrarMenuPrincipal(usuario, scanner);
	                    }
	                    break;
	
	                case 3:
	                    System.out.println("¡Gracias por usar el programa!");
	                    System.exit(0);
	                    break;
	
	                default:
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	            }
	        }
	    }
	
	    private static void mostrarMenuPrincipal(Usuario usuario, Scanner scanner) {
	        while (true) {
	            System.out.println("\nMenú principal");
	            System.out.println("1. Ver productos");
	            System.out.println("2. Agregar producto al carrito");
	            System.out.println("3. Ver carrito");
	            System.out.println("4. Realizar pedido");
	            System.out.println("5. Cerrar sesión");
	            System.out.print("Seleccione una opción: ");
	
	            int opcion = scanner.nextInt();
	
	            switch (opcion) {
	                case 1:
	                	System.out.println("\nProductos disponibles:");
	                    System.out.println("Electronicos:");
	                    for (Producto electronico : Electronicos.obtenerProductosElectronicos()) {
	                        System.out.println(electronico);
	                    }
	                    
	                    System.out.println("Juguetes:");
	                    for (Producto juguete : Juguetes.obtenerProductosJuguete()) {
	                        System.out.println(juguete);
	                    }
	                    
	                    System.out.println("Ropa:");
	                    for (Producto ropa : Ropa.obtenerProductosRopa()) {
	                        System.out.println(ropa);
	                    }
	                    break;
	
	                case 2:
	                	System.out.println("\nSeleccione una categoría:");
	                    System.out.println("1. Electronicos");
	                    System.out.println("2. Juguetes");
	                    System.out.println("3. Ropa");
	                    int categoria = scanner.nextInt();

	                    switch (categoria) {
	                        case 1:
	                            System.out.println("\nProductos electrónicos:");
	                            for (Producto electronico : Electronicos.obtenerProductosElectronicos()) {
	                                System.out.println(electronico);
	                            }
	                            break;
	                        case 2:
	                            System.out.println("\nJuguetes:");
	                            for (Producto juguete : Juguetes.obtenerProductosJuguete()) {
	                                System.out.println(juguete);
	                            }
	                            break;
	                        case 3:
	                            System.out.println("\nRopa:");
	                            for (Producto ropa : Ropa.obtenerProductosRopa()) {
	                                System.out.println(ropa);
	                            }
	                            break;
	                        default:
	                            System.out.println("Opción no válida. Inténtelo de nuevo.");
	                            continue;
	                    }
	                    System.out.print("Seleccione un producto por su opción: ");
	                    int opcionProducto = scanner.nextInt();
	                    List<Producto> productos = null;

	                    switch (categoria) {
	                        case 1:
	                            productos = Electronicos.obtenerProductosElectronicos();
	                            break;
	                        case 2:
	                            productos = Juguetes.obtenerProductosJuguete();
	                            break;
	                        case 3:
	                            productos = Ropa.obtenerProductosRopa();
	                            break;
	                    }

	                    if (opcionProducto >= 1 && opcionProducto <= productos.size()) {
	                        Producto productoSeleccionado = productos.get(opcionProducto - 1);
	                    }
	                	 
	                   break;
	
	                case 3:
	                	 System.out.println("\nCarrito actual:");
	                	    for (Carrito carrito : usuario.getCarritos()) {
	                	        System.out.println(carrito);
	                	    }
	                    break;
	
	                case 4:
	                	double totalPedido = 0.0;
	                    System.out.println("\nProductos en el carrito:");
	                    for (Carrito carrito : usuario.getCarritos()) {
	                        totalPedido += carrito.getProductos().stream().mapToDouble(Producto::getPrecio).sum();
	                    }
	                    Pedido pedido = new Pedido(usuario.getNombre(), usuario.getDireccion(), totalPedido);
	                    usuario.getUnPedido().agregarPedido(pedido);
	                    usuario.getCarritos().clear();
	                    System.out.println("Pedido realizado con éxito.");
	                    break;

	
	                case 5:
	                    System.out.println("Sesión cerrada. ¡Hasta luego!");
	                    break;
	
	                default:
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	            }
	        }
	    
	    }
	 }