package valueObjects;

import java.awt.Color;

public class ChefVO {
	private String 	firstName,
					lastName;
	private Color 	colorApron;
	
	
	
	public ChefVO(String firstName, String lastName, Color colorApron) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.colorApron = colorApron;
	}
	
	public ChefVO() {
		this(null, null, null);
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

	public Color getColorApron() {
		return colorApron;
	}

	public void setColorApron(Color colorApron) {
		this.colorApron = colorApron;
	}
}
