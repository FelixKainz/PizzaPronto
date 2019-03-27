package pizzaPronto;

import java.awt.Color;
import java.time.LocalDate;

import valueObjects.ChefVO;
import valueObjects.CustomerVO;
import valueObjects.PizzaVO;

public class Main {

	public static void main(String[] args) {
		testDriver();
	}
	
	public static void testDriver() {
		// Date testing
		LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.of(1990,  05,  24);
		
		// Radnom Objects to test
		ChefVO chef1 = new ChefVO();
		ChefVO chef2 = new ChefVO("Kleve", "Klaus", Color.BLACK);
		
		CustomerVO customer1 = new CustomerVO();
		CustomerVO customer2 = new CustomerVO("Feuerstein", "Fred", LocalDate.now().minusYears(18));
		CustomerVO customer3 = new CustomerVO("Panzer", "Paul", "Male", LocalDate.of(1997, 7, 19));
		
		PizzaVO pizza1 = new PizzaVO();
		PizzaVO pizza2 = new PizzaVO("Pizza Conchita", new String[] {"BBQ-Sauce", "Rinderhack", "Bacon", "rote Zwiebeln", "Mozzarella-Kugeln"} , 9.99f);
		
		//TEST
		//Test 2
		//Test 3 3
		//test 4
	}
}
