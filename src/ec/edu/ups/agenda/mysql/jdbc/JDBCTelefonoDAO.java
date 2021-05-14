package ec.edu.ups.agenda.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.agenda.clases.Telefono;
import ec.edu.ups.agenda.dao.TelefonoDAO;

public class JDBCTelefonoDAO extends JDBCGenericDAO<Telefono, Integer> implements TelefonoDAO {

	@Override
	public void crearTabla() {
		conexion.update("DROP TABLE IF EXISTS Telefono");
		conexion.update("CREATE TABLE Telefono ( CODIGO INT NOT NULL, NUMERO VARCHAR(10), OPERADORA VARCHAR(20),CEDULA VARCHAR(10),PRIMARY KEY(CODIGO))");

	}

	@Override
	public List<Telefono> find(Integer id) {

		// TODO Auto-generated method stub
		List<Telefono> lista = new ArrayList<Telefono>(); 
		Telefono tele = null;
		
		ResultSet rs = conexion.query("SELECT * FROM Telefono  where cedula ='0" + id +"'");
		 
		
		try { 
/*
			if (rs != null && rs.next()) { 
				tele = new Telefono(rs.getInt("codigo"), rs.getString("numero"), rs.getString("tipo"),
						rs.getString("operadora"), rs.getString("cedula"));
				System.out.println("Valor de telefono> "+tele.toString());
				*/
				while (rs.next()) {
					System.out.println("bucle while");
					lista.add(new Telefono(rs.getInt("codigo"), rs.getString("numero"), rs.getString("tipo"),
							rs.getString("operadora"), rs.getString("cedula")));
				}
				/*
			}else {
				System.out.println("falsoooooo");
			}
*/
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("ERROR ENN EL LISTA DE TELEFONOS" + e.getMessage());
			return null;
		}
		return lista;
	}

	@Override
	public void crear(Telefono telefono) {
		// TODO Auto-generated method stub
		//INSERT INTO telefono VALUE(001,'098745878','celular','claro','0706680055')
		conexion.update("INSERT Telefono VALUES (" + telefono.getCodigo() + ", '" + telefono.getNumero() + "', '"
				+ telefono.getTipo() + "', '" + telefono.getOperadora() + "', '"+telefono.getUsuario()+"')");

	}

	@Override
	public Telefono read(Integer id) {
		// TODO Auto-generated method stub
		return null;
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


}
