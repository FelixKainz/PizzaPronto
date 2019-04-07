package valueObjects;

import java.time.LocalDate;
import java.time.Period;

public class CustomerVO {
	private String		firstName,
						lastName,
						gender;
	private LocalDate 	dateOfBirth;
	int id;
	static int nextID = 0;
	
	
	
//	public static void main(String[] args) {
//		LocalDate today = LocalDate.now();
//		LocalDate dob = LocalDate.of(1990,  05,  24);	
//	}
	
	
	
	public CustomerVO(String lastName, String firstName, String gender, LocalDate dob) {
		this.setFirstName(firstName);
		this.setLastName(lastName);;
		this.setGender(gender);
		this.setDateOfBirth(dob);
		
		this.id = nextID++;
	}
	
	public CustomerVO(String lastName, String firstName, LocalDate dob) {
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setDateOfBirth(dob);
		
		this.id = nextID++;
	}

	public CustomerVO() {
		this(null, null, null, null);																// TODO Why this()
	}
	
	private short calculateAge() {
		if(this.dateOfBirth != null)
			return (short) Period.between(this.dateOfBirth, LocalDate.now()).getYears();
		return -1;
	}
	
	@Override
	public String toString() {
		return ((Integer)this.getId()).toString() + '\t' + this.getLastName() + '\t' + this.getFirstName() + '\t' + this.getGender() + '\t' + this.dobToString() + '\t' + calculateAge();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		CustomerVO cust = (CustomerVO) obj;
		
		if(this.getId() == cust.getId())
			return true;
		
		return false;
	}
	
	
	
	@Override
	public Object clone() {
		return new CustomerVO(this.lastName, this.firstName, this.gender, this.dateOfBirth);
	}
	
	
		
	private String dobToString() {
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
		if(dateOfBirth != null)
			if(Period.between(dateOfBirth, LocalDate.now()).getYears() >= 17)
				this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}

	public static int getNextID() {
		return nextID;
	}
}