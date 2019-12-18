package io.altar.jseproject.states;

public class ProductDelete extends State {

	@Override
	public int run() {
		System.out.println("Remover produto");
		long productId = sc.getValidLong("Introduzir ID do produt que quer remover : ", DBP.getAllIds());
		DBP.delete(productId);
		
	// qual e o return??
		return System.out.println("Produto removido");
	}
	

}
