package io.altar.jseproject.states;

public class ProductDelete extends State {

	@Override
	public int run() {
		System.out.println("Remover produto");
		long productId = sc.getValidLong("Introduzir ID do produto que quer remover : ", DBP.getAllIds());
		DBP.delete(productId);
		

		return 1;
	}
	

}
//TODO remover o produto de todas as prateleiras