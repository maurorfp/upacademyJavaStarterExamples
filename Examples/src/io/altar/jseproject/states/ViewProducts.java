package io.altar.jseproject.states;

public class ViewProducts extends State {

	@Override
	public int run() {
		
		System.out.println("Id dos produtos "+DBP.getAllIds());
		//descricao do produto??
		System.out.println(DBP);
		
// qual e o return?
		return 0;
	}

}
//TODO identificar em quantas prateleiras esta o produto