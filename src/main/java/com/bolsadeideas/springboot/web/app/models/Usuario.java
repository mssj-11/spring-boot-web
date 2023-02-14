//	Ejemplo: Objeto Model
package com.bolsadeideas.springboot.web.app.models;

//	Pojo: Clase de Java, Atributos para sus datos
public class Usuario {
	
	private String nombre;
	private String apellido;
	private String email;
	
	
	
	//	Constructor con los parametros
	public Usuario(String nombre, String apellido, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	//	Constructor Vacio
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	//	Getter and Setter
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
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}