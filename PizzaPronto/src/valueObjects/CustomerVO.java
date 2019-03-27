package valueObjects;

import java.time.LocalDate;

public class CustomerVO {
	public String		firstName,
						lastName,
						gender;
	public LocalDate 	dateOfBirth;
	
	
	
//	public static void main(String[] args) {
//		LocalDate today = LocalDate.now();
//		LocalDate dob = LocalDate.of(1990,  05,  24);
//	}
	
	
	
	public CustomerVO(String lastName, String firstName, String gender, LocalDate dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dob;
	}
	
	public CustomerVO(String lastName, String firstName, LocalDate dob) {
		
	}

	public CustomerVO() {
		
	}
	
	
	
	private String dobToString() {
		return this.dateOfBirth.toString();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
