package clases;

import java.util.List;
import java.util.ArrayList;


public class Usuario {
	 private String nombre;
	 private String apellido;
	 private int cedula;
	 private String correo;
	 private int celular;
	 private Pedido unPedido;
	 private List<Carrito> carritos;

	 
	 public Usuario() {
		 this.carritos = new ArrayList<>();
	 }


	public Usuario(String nombre, String apellido, int cedula, String correo, int celular, Pedido unPedido, List<Carrito> carritos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.correo = correo;
		this.celular = celular;
		this.unPedido = unPedido;
		this.carritos = new ArrayList<>();	}


	public Usuario(String nombre,String apellido, int cedula, String correo, int celular) {
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getCedula() {
		return cedula;
	}


	public void setCedula(int cedula) {
		this.cedula = cedula;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public int getCelular() {
		return celular;
	}


	public void setCelular(int celular) {
		this.celular = celular;
	}


	public Pedido getUnPedido() {
		return unPedido;
	}


	public void setUnPedido(Pedido unPedido) {
		this.unPedido = unPedido;
	}
	
	public List<Carrito> getCarritos() {
		return carritos;
	}
	public List<Carrito> setCarritos() {
		return carritos;
	}

 public String getDireccion() {
		return getDireccion() ;
	}

 public String setDireccion() {
		return setDireccion() ;
	}
	
	
	
	public void registrarUsuario() {
        System.out.println("Usuario registrado con éxito:\nNombre: " + nombre + "\nApellido: " + apellido + "\nNumeroCedula" + celular + "\nCorreo"+ correo+ "\nCelular"+ celular);
	}


}

