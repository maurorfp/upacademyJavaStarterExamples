package io.altar.jseproject.business;

import java.util.Collection;
import java.util.Set;

import io.altar.jseproject.models.Shelf;
import io.altar.jseproject.repositories.ShelfRepository;

public class ShelfBusiness implements ShelfBusinessInterface{
	public ShelfRepository DBS = ShelfRepository.getInstance();

	@Override
	public void create(Shelf t) {
		DBS.create(t);
		
	}

	@Override
	public Collection<Shelf> consultar() {
		DBS.consultar();
		
	//que nul ??
		return null;
	}

	@Override
	public Shelf consultarId(Long id) {
		DBS.consultarId(id);
		return null;
	}

	@Override
	public void editId(Shelf entity) {
	DBS.editId(entity);
		
	}

	@Override
	public void delete(Long id) {
		DBS.delete(id);
		
	}

	@Override
	public boolean isEmpty() {
		DBS.isEmpty();
		return false;
	}

	@Override
	public Set<Long> getAllIds() {
		DBS.getAllIds();
		return null;
	}

}
