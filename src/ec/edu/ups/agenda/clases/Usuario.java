package ec.edu.ups.agenda.clases;

import java.io.Serializable;
import java.util.List;

public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String cedula;
	private String nombre;
	private String apellido;
	private String correo;
	private String contrasenia;
	private List<Telefono> listaTelefono;
	
	public Usuario() {
		
	}
	
	public Usuario(String cedula, String nombre, String apellido, String correo, String contrasenia,
			List<Telefono> listaTelefono) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.listaTelefono = listaTelefono;
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

	@Override
	public String toString() {
		return "Usuario [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", contrasenia=" + contrasenia + ", listaTelefono=" + listaTelefono + "]";
	}
	

}
