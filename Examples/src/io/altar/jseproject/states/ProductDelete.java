package io.altar.jseproject.states;

public class ProductDelete extends State {

	@Override
	public int run() {
		System.out.println("Remover produto");
		long productId = sc.getValidLong("Introduzir ID do produto que quer remover : ", productBusiness.getAllIds());
		productBusiness.delete(productId);
		
//		productBusiness.setProductId(productId);//nao e remove mas sim set para 0 no parametro produts ids. Com o remove eliminava a prateleira
		
//no git do Joao ele nao tem o set das prateleiras??
		return 1;
	}
	

}
//TODO remover o produto de todas as prateleiras