package pt.upacademy.desafios.desafio5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


//tenho erro 
public class Desafio {

	public static long countDays(String stringDate1, String stringDate2) {
		DateTimeFormatter formatter = new DateTimeFormatter.ofPattern("dd MM yyyy");
		
		LocalDate date1 = LocalDate.parse(stringDate1, formatter);
		LocalDate date2 = LocalDate.parse(stringDate2, formatter);
		
		return date1.until(date2, ChronoUnit.DAYS);
	}

}
