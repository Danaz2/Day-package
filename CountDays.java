package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CountDays extends Remain {
	public void countDays() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		
		try {
			LocalDate counter = LocalDate.parse(getStartTime(), formatter);
			LocalDate nextDay = counter.plusDays(1);
			System.out.println("The next day is: " + nextDay.format(formatter));
		} catch (DateTimeParseException e) {
			System.err.println("Invalid date format. Use d/M/yyyy.");
		}
	}
}
