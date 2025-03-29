package Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculate {
	
	private String birthdateInput; // Stores the birthdate as a string
	private int age;
	Scanner sc = new Scanner(System.in);// Stores the calculated age
	
	// Getter for birthdateInput
	public String getBirthdateInput() {
		return birthdateInput;
	}
	
	public void setBirthdateInput(String birthdateInput) {
		this.birthdateInput = birthdateInput;
		calculateAge();
	}
	public int getAge() {
		return age;
	}
	
	public void calculateAge() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		while (true) {
			try {
				
				LocalDate birthdate = LocalDate.parse(birthdateInput, formatter);
				
				LocalDate currentDate = LocalDate.now();
				
				Period period = Period.between(birthdate, currentDate);
				int calculatedAge = period.getYears();
				if (calculatedAge < 18) {
					System.out.println("\u001B[31m" + "Your age is under 18 years" + "\u001B[0m");
					System.exit(-1);
				} else {
					this.age = calculatedAge;
				}
				break;
			} catch (Exception e) {
				System.out.println("Invalid date format. Please use D/M/YYYY.");
				setBirthdateInput(sc.next());
				break;
			}
		}
	}
	
	void displayAge() {
		System.out.println("Age: " + age);
		
	}
}
