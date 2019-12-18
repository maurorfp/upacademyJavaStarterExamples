package io.altar.jseproject.states;

import java.util.Set;

public class MenuShelf extends State{

	@Override
	public int run() {
		System.out.println("1)\t Criar Shelves");
		System.out.println("2)\t Editar Shelves");
		System.out.println("3)\t Consultar Shelves");
		System.out.println("4)\t Remover Shelves");
		System.out.println("5)\t Voltar");
		int[] options = { 1, 2, 3, 4, 5 };
		return sc.getValidInt("Selecionar opcao : ", options);
	
	
	}

}

//private void ecraLShelves() {
//	int option = 0;
//	do {
//		
//		Set<Long> shelfsIds = DBS.getAllIds();
//		for (Long id : shelfsIds) {
//			System.out.println("ID da prateleira : " + id);
//		}
//		int[] options;
//		if (DBS.isEmpty()) {
//			options = new int[] { 1, 5 };
//			System.out.println("1)\t Criar Prateleira");
//			System.out.println("5)\t Voltar");
//		} else {
//			options = new int[] { 1, 2, 3, 4, 5 };
//			System.out.println("1)\t Criar Prateleira");
//			System.out.println("2)\t Editar Prateleira");
//			System.out.println("3)\t Consultar Prateleira");
//			System.out.println("4)\t Remover Prateleira");
//			System.out.println("5)\t Voltar");
//		}
//
//		option = sc.getValidInt("Selecionar opção : ", options);
//		switch (option) {
//		case 1:
//			//criar prateleira
//			ecraNewShelf();
//			break;
//		case 2:
//			//editar prateleira
//			editShefl();
//			break;
//		case 3:
//			//consultar prateleira
//			viewShefl();
//			break;
//		case 4:
//			//remover prateleira
//			ecraDeleteShelf();
//			break;
//		}
//	} while (option != 5);
//}
