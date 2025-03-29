package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Remain {
	private String startTime;
	private String endTime;
	private int remain;
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public int calculateRemain() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		while (true) {
			try {
				LocalDate from = LocalDate.parse(startTime, formatter);
				LocalDate to = LocalDate.parse(endTime, formatter);
				long daysDifference = ChronoUnit.DAYS.between(from, to);
				
				System.out.println(daysDifference + " days remaining");
				 return this.remain = (int) daysDifference;
				
				
			} catch (DateTimeParseException e) {
				System.err.println("Invalid date format. Use D/M/YYYY");
				return -1;
			}
		}
	}
	

}
