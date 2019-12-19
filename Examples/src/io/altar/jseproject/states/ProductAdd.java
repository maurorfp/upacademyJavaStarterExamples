package io.altar.jseproject.states;

import io.altar.jseproject.models.Product;

public class ProductAdd extends State {

	@Override
	public int run() {
		System.out.println("Criar produto:");
		int discount = sc.getInt("Indique o desconto associado ao produto");
		int[] options = {6, 13, 23};
		int iva = sc.getValidIvas("Coloque o valor do IVA (6%,13% ou 23%)", options);
		float pvp = sc.getFloat("Coloque o PVP");
		Product product1 = new Product(discount, iva,pvp);
		productBusiness.create(product1);
		System.out.println("Produto criado");
		System.out.println("");
		
		return 1;
	}

}
//TODO 