package pt.upacademy.desafios.desafio2;

import java.util.ArrayList;
import java.util.List;

public class Desafio {

	public static String order(String string) {
		
		String [] arrayStrings = string.split(" ");
//		List<String> arrayOrder= new ArrayList<String>();
		
		String text ="";
		
		for (int i= 0; i<9; i++) {
			String istring= String.valueOf(i);
			for (String word : arrayStrings) {
				
				if(word.contains(istring)) {
					text+=word+" ";
				}
			}
			 	
			
		}
		return text.trim();
	}

}
