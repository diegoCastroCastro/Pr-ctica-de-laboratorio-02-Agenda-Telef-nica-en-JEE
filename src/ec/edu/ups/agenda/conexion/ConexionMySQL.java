package ec.edu.ups.agenda.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class ConexionMySQL {
	
	Connection conexion = null;
	Statement sentencia = null;
	
	
	public String db = "jee";
	public String url = "jdbc:mysql://localhost:3306/"+db;
	public String user = "root";
	public String pass = "root";
	
	public Connection Conectar() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, user, pass);
			sentencia = conexion.createStatement();
			
		} catch (ClassNotFoundException e) {
			System.out.println("Imposible cargar el driver: " + e.getMessage());
		}catch (SQLException e) {
			System.out.println("Imposible conectar: " + e.getMessage());
		}
	
		return conexion;
	}
	
}
