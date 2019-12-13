package io.altar.jseproject.repositories;

import java.util.Collection;
import java.util.Map;

import io.altar.jseproject.models.Entity;

public abstract class EntityRepository <T extends Entity>  {
	
	//Cria uma metodo hash map para identificar todos os elementos da base de dados
	
	Map<Long, T> myMap = new HashMap<Long, T>();
	
	long nextId= 0;
	
	private long netxIdNext() {
		return nextId = netxIdNext();
	}
	
	public long create(T entity){
		long nextId =  netxIdNext();
		myMap.put(entity.getId(), entity);
	}
	
	
//consultar sem criterio o tipo objecto - nao leva parametros de entrada porque queremos todos
	public Collection<T> consultar () {
		return myMap.values();
		
	}
	
//consultar por Id - o metodo .get vai buscr os elementos do objecto
	public T consultarId(Long id) {
		return myMap.get(id);
			
	}
	
// editar os elementos por Id
	public Collection<T>  editId(T entity) {
		myMap.put(entity.getId(), entity);
			
	}
	
//eliminar as variaveis --nao esta a funcionar...
public Collection<T> delete(T entity) {
		myMap.remove(entity.getId(), entity);	

	}
	
	}




