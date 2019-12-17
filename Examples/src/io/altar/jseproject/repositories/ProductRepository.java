package io.altar.jseproject.repositories;

import io.altar.jseproject.models.Product;

//duvida na uilitzacao dos <>??
// esta class cria o singleton - encapsula a criacao unica de elementos deste tipo
public class ProductRepository extends EntityRepository <Product> {
	
//o que significa a palavra final?? - o que estou a fazer aqui?
	
	private static final ProductRepository INSTANCE= new ProductRepository();
	
	
//o que faz este metodo?
	private ProductRepository() {
		
	}
	
		
	public static  ProductRepository getInstance () {
	
	return INSTANCE;
	
}
}
