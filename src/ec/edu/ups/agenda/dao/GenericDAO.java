package ec.edu.ups.agenda.dao;

import java.util.List;

import ec.edu.ups.agenda.clases.Telefono;
import ec.edu.ups.agenda.clases.Usuario;

public interface GenericDAO <T, ID>{
	
	public void crearTabla();
	
	public void crear(T entity);
	
	public T read (ID id);
	
	public T login (T entity);
	
	public void update (T entity);
	
	public void delete (T entity);
	
	public List<T> find(ID id); 
}
