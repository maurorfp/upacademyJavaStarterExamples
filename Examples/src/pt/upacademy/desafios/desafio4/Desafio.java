package pt.upacademy.desafios.desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

private static Scanner sc;

public class Desafio {
//
public static int[] ints(String msg) {
	List<Integer> result = new ArrayList<Integer>();
	
	sc = new Scanner(msg);
	while (sc.hasNext()) {
		result.add(sc.nextInt());
	}else {
		sc.next();
	}
	return result.stream().mapToInt(i->i).toArray();
}
}