package ec.edu.ups.agenda.mysql.jdbc;


import java.sql.ResultSet;
import java.util.List;

import ec.edu.ups.agenda.clases.Usuario;
import ec.edu.ups.agenda.dao.UsuarioDAO;

public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, Integer> implements UsuarioDAO{

	@Override
	public void crearTabla() {
		conexion.update("DROP TABLE IF EXISTS Usuario");
		conexion.update("CREATE TABLE Usuario (" + "ID INT NOT NULL, " + "CEDULA VARCHAR(10),"
						+ "NOMBRE VARCHAR(255), APELLIDO VARCHAR(255)" + "EMAIL VARCHAR(255)" + "CONTRASEÑA VARCHAR(255)" + "PRIMARY KEY (CEDULA))");
		
	}

	@Override
	public void crear(Usuario usuario) {
		conexion.update("INSERT Usuario VALUES (" + usuario.getCedula() + ", '" + usuario.getNombre()+ "', '"
						+ usuario.getApellido() + "', '" + usuario.getCorreo() + "', '" + usuario.getContrasenia()+ "')");
		
	}

	@Override
	public Usuario read(Integer cedula) {
	
		
		return null;
	}

	@Override
	public void update(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
