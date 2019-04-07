package valueObjects;

import java.util.Arrays;

public class PizzaVO {
	private String 		name;
	private float 		price;
	private String[] 	ingredients;
	
	
	
	public PizzaVO(String name, String[] ingredients, float price) {
		this.setName(name);
		this.setIngredients(ingredients);
		this.setPrice(price);
	}

	public PizzaVO() {
		this(null, null, 0.0f);
	}
	
	@Override
	public String toString() {
		String string = this.getName() + '\t' + this.getPrice() + '\t' + listToString();
		
		return string;
	}
	
	private String listToString() {
		String listAsString = "";
		
		for(String entry : this.getIngredients()) {
			listAsString = listAsString + entry + ", ";
		}
		
		return listAsString.substring(0, listAsString.length() - 2);
	}
	
	
	public void testDriver() {
		System.out.println("### PizzaVO.testDriver ###".toUpperCase());
		
		this.setPrice(0.0f);
		System.out.println(this.toString());
		
		System.out.println("### /PizzaVO.testDriver ###".toUpperCase());
	}
	
	
	@Override
	public boolean equals(Object obj) {
		try {
		PizzaVO pizza = (PizzaVO) obj;
		
		if(this == obj)
			return true;
		if(this.getName() != pizza.getName())
			return false;
		if(this.getPrice() != pizza.getPrice())
			return false;
		if(!Arrays.equals(this.ingredients, pizza.getIngredients()))
			return false;
		
		return true;
		}
		catch(Exception ex) {
			System.out.println("PizzaVO.equals: Object can not be casted to PizzaVO." + '\t' + ex);
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(ingredients);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}
	
	@Override
	public Object clone() {
		return new PizzaVO(this.name, this.ingredients, this.price);
	}

	public String getName() {
		if(this.name == null)
			return "";
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if(price <= 0.0f) {
			//System.out.println("PizzaVO.setPrice: price <= 0.0f");
			System.out.println(this.toString());
		}
		else
			this.price = price;
	}

	public String[] getIngredients() {
		if(this.ingredients == null || this.ingredients.length == 0) {
			String[] empty = {""};
			return empty;
		}
		
		return ingredients;
	}

	public void setIngredients(String[] ingredients) {
		if(ingredients != null)
			this.ingredients = ingredients;
		
	}	
}