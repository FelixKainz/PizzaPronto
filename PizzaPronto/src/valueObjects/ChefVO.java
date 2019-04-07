package valueObjects;

import java.awt.Color;

public class ChefVO {
	private String 	firstName,
					lastName;
	private Color 	colorApron;
	
	
	
	public ChefVO(String lastName, String firstName, Color colorApron) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.colorApron = colorApron;
	}
	
	public ChefVO() {
		this(null, null, null);
	}
	
	@Override
	public String toString() {
		String string = this.getLastName() + '\t' + this.getFirstName() + '\t' + this.getColorApron().toString();				//TODO Farbformat?
		
		return string;
	}
	
	
	@Override
	public boolean equals(Object obj) {								//TODO Why not PizzaVO?
		ChefVO chef = (ChefVO) obj;
		
		if(this == chef)
			return true;
		if(this.getFirstName() != chef.getFirstName())
			return false;
		if(this.getLastName() != chef.getLastName())
			return false;
		if(!this.getColorApron().equals(chef.getColorApron()))
			return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colorApron == null) ? 0 : colorApron.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	
	@Override
	public Object clone() {
		return new ChefVO(this.lastName, this.firstName, this.colorApron);
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
