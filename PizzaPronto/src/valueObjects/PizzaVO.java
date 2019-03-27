package valueObjects;

public class PizzaVO {
	public String 		name;
	public float 		price;
	private String[] 	ingredients;
	
	
	
	public PizzaVO(String name, String[] ingredients, float price) {
		this.name = name;
		this.ingredients = ingredients;
		this.price = price;
	}

	public PizzaVO() {
		
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}
	
	
}
