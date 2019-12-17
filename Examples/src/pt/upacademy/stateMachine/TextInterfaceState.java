package pt.upacademy.stateMachine;

import pt.upacademy.stateMachine.states.*; // com este asterisco importo todas as classes que estao no packgage

//copiado do modelo singleton indicado do enunciado da pratica
public class TextInterfaceState {
	
		private State[] states = {
				new MenuInit(),    				//0
				new MenuShelves(), 				//1
				new ProductAdd(),				//2
				new MenuProducts()};			//3
	    
		// 4. transitions-  indica as opcoes do menu
		
	    private int[][] transition = {
	    		{1,2}, 						//State0
	    		{1,1,1,1,0}, 				//State1
	    		{2,2,2,2,0}					//State2
	    		};				
	    
	    
	    // 3. current
	    private int current = 0;
	    
	    public void start() {
	    	while (true) {
	    		int option =states[current].run(); // selecionamo os states com base no valor indicado no current
	    		
	    		if(current==0 && option ==3) {
	    			System.out.println("Saida");
	    			break;
	    		}
	    	}
	    }

	    private void next(int msg) {
	        current = transition[current][msg];
	}
	
	

}
