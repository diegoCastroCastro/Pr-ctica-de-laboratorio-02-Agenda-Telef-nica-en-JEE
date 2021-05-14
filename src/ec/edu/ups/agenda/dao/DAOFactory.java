package ec.edu.ups.agenda.dao;

public abstract class DAOFactory {
	
	protected static DAOFactory factory = new JDBCFactoryDAO();
	
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public abstract void createTables();
	
	public abstract UsuarioDAO getUsuarioDAO();

	public abstract TelefonoDAO getTelefonoDAO();
	
	
}
