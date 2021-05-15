package ec.edu.ups.agenda.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.agenda.clases.Usuario;
import ec.edu.ups.agenda.dao.UsuarioDAO;

import ec.edu.ups.agenda.clases.Telefono;

public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, Integer> implements UsuarioDAO {

	@Override
	public void crearTabla() {
		conexion.update("DROP TABLE IF EXISTS Usuario");
		conexion.update("  CREATE TABLE Usuario(CEDULA VARCHAR(10), NOMBRE VARCHAR(255), APELLIDO VARCHAR(255) ,EMAIL VARCHAR(255) ,CONTRASENIA VARCHAR(255) ,PRIMARY KEY (CEDULA))");

	}

	@Override
	public void crear(Usuario usuario) {
		//CREATE TABLE Usuario (CEDULA VARCHAR(10),NOMBRE VARCHAR(255), APELLIDO VARCHAR(255), EMAIL VARCHAR(255),CONTRASENIA VARCHAR(255),PRIMARY KEY (CEDULA))
		conexion.update("INSERT Usuario VALUES (" + usuario.getCedula() + ", '" + usuario.getNombre() + "', '"
				+ usuario.getApellido() + "', '" + usuario.getCorreo() + "', '" + usuario.getContrasenia() + "')");

	}

	@Override
	public Usuario read(Integer cedula) {
	  Usuario usua= null;
		ResultSet rs = conexion.query("SELECT * FROM Usuario  where cedula ='" + cedula +"'");
		try { 

			while (rs.next()) {
				System.out.println("Buscando usuarios por cedula");
				usua = new Usuario(rs.getString("cedula"), rs.getString("nombre"), rs.getString("apellido"),
						rs.getString("email"), rs.getString("contrasenia"), null);
			}
	} catch (SQLException e) {
		// TODO: handle exception
		System.out.println("ERROR ENN EL LISTA DE TELEFONOS" + e.getMessage());
		return null;
	}
		return usua;
	}

	@Override
	public Usuario login(Usuario usuario) {

		// TODO Auto-generated method stub
		List<Telefono> lista = new ArrayList<Telefono>();
		Usuario tele = null;
		ResultSet rs = conexion.query("SELECT * FROM Usuario  where email ='" + usuario.getCorreo()
				+ "' and contrasenia ='" + usuario.getContrasenia() + "'");

		try {
			if (rs != null && rs.next()) {
				tele = new Usuario(rs.getString("cedula"), rs.getString("nombre"), rs.getString("apellido"),
						rs.getString("email"), rs.getString("contrasenia"), null);
				System.out.println("Valor de telefono> " + tele.toString());

			} else {
				System.out.println("no existe el usurio");
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("ERROR DE resultados" + e.getMessage());
			return null;
		}
		return tele;
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
	public List<Usuario> find(Usuario id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> find1(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
