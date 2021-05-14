package ec.edu.ups.agenda.dao;

import ec.edu.ups.agenda.mysql.jdbc.JDBCTelefonoDAO;
import ec.edu.ups.agenda.mysql.jdbc.JDBCUsuarioDAO;

public class JDBCFactoryDAO extends DAOFactory {

	@Override
	public void createTables() {
		
	}
	
	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new JDBCUsuarioDAO();
	}
	@Override
	public TelefonoDAO getTelefonoDAO() {
		// TODO Auto-generated method stub
		return new JDBCTelefonoDAO();
	}
}
