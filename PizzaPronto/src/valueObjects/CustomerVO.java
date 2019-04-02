package valueObjects;

import java.time.LocalDate;

public class CustomerVO {
	private String		firstName,
						lastName,
						gender;
	private LocalDate 	dateOfBirth;
	
	
	
//	public static void main(String[] args) {
//		LocalDate today = LocalDate.now();
//		LocalDate dob = LocalDate.of(1990,  05,  24);
//	}
	
	
	
	public CustomerVO(String lastName, String firstName, String gender, LocalDate dob) {
		this.setFirstName(firstName);
		this.setLastName(lastName);;
		this.setGender(gender);
		this.setDateOfBirth(dob);
	}
	
	public CustomerVO(String lastName, String firstName, LocalDate dob) {
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setDateOfBirth(dob);
	}

	public CustomerVO() {
		this(null, null, null, null);
	}
	
	
	
	public String dobToString() {
		if(this.dateOfBirth == null)
			return "";
		return this.dateOfBirth.toString();
	}

	public String getFirstName() {
		if(this.firstName == null)
			return "";
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		if(this.lastName == null)
			return "";
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		if(this.gender == null)
			return "undefined";
		return gender;
	}

	public void setGender(String gender) {
//		if(gender == "Male" || gender == "Female" || gender == "undefined")				// ??
			this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
