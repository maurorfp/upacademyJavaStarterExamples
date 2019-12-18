package io.altar.jseproject.states;

import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;
import io.altar.jseproject.textinterface.ScannerUtils.ScannerUtils;

public abstract class  State {
	
	public static final ScannerUtils sc = new ScannerUtils();
	
	//era private mudei para public porque a classe ProductAdd nao conseguia aceder ??
	public ProductRepository DBP= ProductRepository.getInstance();
	public ShelfRepository DBS = ShelfRepository.getInstance();

	public abstract int run();

}
