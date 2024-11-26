package PizzaBillGenerato;
public class DelexPizza extends pizza {
    public DelexPizza(boolean veg) {
        super(veg);
        addExtraCheese();
        addExtraToppings();
    }
}
