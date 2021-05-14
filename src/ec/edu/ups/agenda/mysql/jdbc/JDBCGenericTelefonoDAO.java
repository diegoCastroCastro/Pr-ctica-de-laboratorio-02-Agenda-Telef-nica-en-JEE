package ec.edu.ups.agenda.mysql.jdbc;

import ec.edu.ups.agenda.dao.GenericDAO;

public abstract class JDBCGenericTelefonoDAO <T, ID> implements GenericDAO<T, ID>{
	
	protected ContextJDBC conexion = ContextJDBC.getJDBC1();

}
