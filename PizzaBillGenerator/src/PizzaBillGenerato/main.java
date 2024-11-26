package PizzaBillGenerato;

public class main {
    public static void main(String[] args) {
        // Create a regular veg pizza
    	pizza vegPizza = new pizza(true);
        vegPizza.addExtraCheese(); 
        vegPizza.addExtraToppings(); 
        vegPizza.takeAway(); 
        vegPizza.getBill(); 
        System.out.println("************************************************");
        DelexPizza deluxeNonVegPizza = new DelexPizza(false);
        deluxeNonVegPizza.getBill(); 
    }
}
