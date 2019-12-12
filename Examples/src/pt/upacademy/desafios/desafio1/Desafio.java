package pt.upacademy.desafios.desafio1;

public class Desafio {
	
	private int count;
	private int big3;
	private int big5;

	public Desafio(int i) {
		this.count = i;
		
		
	}

	public void run() {
		for (int i=1; i<= count; i++) {
			if(i%3==0) {
				big3++;}
			if(i%5==0) {
				big5++;}
			}
		}
	

	public int getBig3Count() {
		// TODO Auto-generated method stub
		return this.big3;
	}

	public int getBig5Count() {
		// TODO Auto-generated method stub
		return this.big5;
	}

}
