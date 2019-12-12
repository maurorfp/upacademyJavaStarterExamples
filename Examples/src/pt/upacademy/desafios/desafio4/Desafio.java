package pt.upacademy.desafios.desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

private static Scanner scanner;

public class Desafio {

public static int[] ints(String msg) {
	List<Integer> result = new ArrayList<Integer>();
	
	scanner =new Scanner(msg);
	while (scanner.hasNext()) {
		result.add(scanner.nextInt());
	}else {
		scanner.next();
	}
	return result.stream().mapToInt(i->i).toArray();
}
}