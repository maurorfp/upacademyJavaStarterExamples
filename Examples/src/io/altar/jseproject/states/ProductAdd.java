package io.altar.jseproject.states;

import java.util.List;

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
		if (productBusiness.isEmpty()) {
			productBusiness.create(product1);
		}
		else {
		
		Long shelfId = sc.getValidLong("Selecione as prateleiras onde colocar o produto", shelfBusiness.getAllIds());
		
		product1.addShelfId(shelfId);// funcao das listas para colocar o idd da lista de ids
		
		productBusiness.create(product1);
		System.out.println("Produto criado!");
		System.out.println("");
		
		
	}
	return 1;
	}
}
//TODO Adiciona IDs prateleiras?? - feito