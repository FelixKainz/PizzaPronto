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
		System.out.println("### TESTDRIVER ###");
		
		// Date testing
		LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.of(1990,  05,  24);
		
		// Random Objects to test
		ChefVO chef1 = new ChefVO();
		ChefVO chef2 = new ChefVO("Kleve", "Klaus", Color.BLACK);
		
		System.out.println(chef2.toString() + '\n');
		
		CustomerVO customer1 = new CustomerVO();
		CustomerVO customer2 = new CustomerVO("Feuerstein", "Fred", LocalDate.now().minusYears(17));
		CustomerVO customer21 = new CustomerVO("Feuerstein2", "Fred2", LocalDate.now().minusYears(16));
		CustomerVO customer3 = new CustomerVO("Panzer", "Paul", "Male", LocalDate.of(1997, 7, 19));
		
		System.out.println(customer1.toString() + '\n' + customer2 + '\n' + customer21 + '\n' + customer3 + '\n');
		
		PizzaVO pizzaVO1  = new PizzaVO();
		PizzaVO pizzaVO2  = new PizzaVO("Pizza Conchita", new String[] {"BBQ-Sauce", "Rinderhack", "Bacon", "rote Zwiebeln", "Mozzarella-Kugeln"} , 9.99f);
		PizzaVO pizzaVO3  = new PizzaVO("Dutchman", new String[] {"Prosciutto Cotto", "Tomaten", "Broccoli-Röschen", "Sauce hollondaise"} , 5.00f);
		PizzaVO pizzaVO31 = new PizzaVO("Dutchman", new String[] {"Prosciutto Cotto", "Tomaten", "Broccoli-Röschen", "Sauce hollondaise"} , 5.00f);
		PizzaVO pizzaVO32 = new PizzaVO("Dutchman", new String[] {"ProsciuttoCotto" , "Tomaten", "Broccoli-Röschen", "Sauce hollondaise"} , 5.00f);
		
		System.out.println("pizzaVO2 == pizzaVO3: " + pizzaVO2.equals(pizzaVO3));
		System.out.println("pizzaVO3 == pizzaVO31: " + pizzaVO3.equals(pizzaVO31));
		System.out.println("pizzaVO2 == ChefVO: " + pizzaVO2.equals(chef2));
		
		System.out.println("pizzaVO3 clone of pizzaVO31: " + pizzaVO3.equals(pizzaVO3.clone()));
		System.out.println("pizzaVO3 clone of pizzaVO32: " + pizzaVO3.equals(pizzaVO32.clone()) + '\n');
		
		pizzaVO2.testDriver();
		
		System.out.println("### /TESTDRIVER ###");
	}
}
