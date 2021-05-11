package ec.edu.ups.agenda.dao;

import java.util.List;

public interface GenericDAO <T, ID>{
	
	public void crearTabla();
	
	public void crear(T entity);
	
	public T read (ID id);
	
	public void update (T entity);
	
	public void delete (T entity);
	
	public List<T> find();
}
