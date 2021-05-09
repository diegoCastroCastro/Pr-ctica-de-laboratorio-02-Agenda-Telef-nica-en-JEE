package ec.edu.ups.agenda.clases;

import java.util.List;

public class Usuario {
	
	private String cedula;
	private String nombre;
	private String apellido;
	private String correo;
	private String contrasenia;
	private List<Telefono>listaTelefono;
	
	public Usuario() {
		
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public List<Telefono> getListaTelefono() {
		return listaTelefono;
	}

	public void setListaTelefono(List<Telefono> listaTelefono) {
		this.listaTelefono = listaTelefono;
	}

}
