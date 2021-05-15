package ec.edu.ups.agenda.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.agenda.clases.Telefono;
import ec.edu.ups.agenda.clases.Usuario;
import ec.edu.ups.agenda.dao.TelefonoDAO;

public class JDBCTelefonoDAO extends JDBCGenericDAO<Telefono, String> implements TelefonoDAO {

	@Override
	public void crearTabla() {
		conexion.update("DROP TABLE IF EXISTS Telefono");
		conexion.update("CREATE TABLE Telefono ( NUMERO VARCHAR(10),TIPO VARCHAR(255), OPERADORA VARCHAR(20),CEDULA VARCHAR(10),PRIMARY KEY(NUMERO),FOREIGN KEY (CEDULA) REFERENCES usuario (cedula))");

	}

	@Override
	public List<Telefono> find(Telefono tel) {

		// TODO Auto-generated method stub
		List<Telefono> lista = new ArrayList<Telefono>(); 
		Telefono tele = new Telefono();
		Usuario usua =  new Usuario(); 
		ResultSet rs = conexion.query("SELECT * FROM Usuario u ,Telefono t where cedula ='" + tel.getUsuario().getCedula() +"' or correo ='"+tel.getUsuario().getCorreo()+"'");
		
		/*ResultSet rs2 = conexion.query("SELECT * FROM Telefono  where cedula ='" + usu +"' or correo ='"+usu+"'");
		 */
		
		
		
		try { 

				while (rs.next()) {
					System.out.println("bucle while");
					tele.setNumero(rs.getString("numero"));
					tele.setOperadora(rs.getString("operadora"));
					tele.setTipo(rs.getString("tipo"));			
					
					//SE BUSCA AL USUARIO POR CEDULA
					
					ResultSet usuconsu = conexion.query("SELECT * FROM Usuario  WHERE cedula ='"+rs.getString("cedula")+"'");
					while(usuconsu.next()) {
						usua.setApellido(usuconsu.getString("apellido"));
						usua.setNombre(usuconsu.getString("apellido"));
						usua.setCorreo(usuconsu.getString("correo"));
						usua.setContrasenia(usuconsu.getString("contrasenia")); 
						
					}
					tele.setUsuario(usua);
					
					lista.add(tele);
				
				}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("ERROR ENN EL LISTA DE TELEFONOS" + e.getMessage());
			return null;
		}
		return lista;
	}

	@Override
	public void crear(Telefono telefono) {

		System.out.println("VALORES "+ telefono.getUsuario().getCedula());
		System.out.println("VA : "+telefono.getUsuario().getCedula());
		conexion.update("INSERT Telefono VALUES ('" + telefono.getNumero() + "', '"
				+ telefono.getTipo() + "', '" + telefono.getOperadora() + "', '"+telefono.getUsuario().getCedula()+"')");

	}
 

	@Override
	public void update(Telefono entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Telefono entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Telefono login(Telefono entity) {
		// TODO Auto-generated method stub
		return null;
	}
 

	@Override
	public Telefono read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Telefono> find1(String usu) {
		// TODO Auto-generated method stub
				List<Telefono> lista = new ArrayList<Telefono>(); 
				Telefono tele = null;
				Usuario usua =  new Usuario();
				
				/*
				ResultSet rs = conexion.query("SELECT * FROM Usuario u ,Telefono t where cedula ='" + tel.getUsuario().getCedula() +"' or correo ='"+tel.getUsuario().getCorreo()+"'");
				*/
				ResultSet rs = conexion.query(" SELECT * FROM Telefono t , Usuario u  where t.cedula = u.cedula and u.cedula = '"+usu+"' or u.email='"+usu+"'");
				 
				
				
				
				try { 

						while (rs.next()) {
							System.out.println("bucle while");
							lista.add(new Telefono(  rs.getString("numero"), rs.getString("tipo"),rs.getString("operadora"),usua));
						}
				} catch (SQLException e) {
					// TODO: handle exception
					System.out.println("ERROR ENN EL LISTA DE TELEFONOS" + e.getMessage());
					return null;
				}
				return lista;

	}


}
