package io.altar.jseproject.states;

public class MenuProducts extends State{

	@Override
	public int run() {
		int[] options;
		options = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("1)\t Criar Produto");
		System.out.println("2)\t Editar produto");
		System.out.println("3)\t Consultar produto");
		System.out.println("4)\t Remover produto");
		System.out.println("5)\t Voltar");
		
		return sc.getValidInt("Selecionar opção : ", options);
	}
	

}
