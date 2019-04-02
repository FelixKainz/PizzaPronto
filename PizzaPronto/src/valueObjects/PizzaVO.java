package valueObjects;

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
	
	public String toString() {
		String data = this.getName() + '\t' + this.getPrice() + '\t' + listToString(this.getIngredients());
		
		return data;
	}
	
	private static String listToString(String[] list) {
		String listAsString = "";
		
		for(String entry : list) {
			listAsString = listAsString + entry + '\t';
		}
		
		return listAsString;
	}
	
	
	public void testDriver() {
		System.out.println("PizzaVO.testDriver".toUpperCase());
		
		this.setPrice(0.0f);
		System.out.println(this.toString());
		
		System.out.println("/PizzaVO.testDriver".toUpperCase());
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