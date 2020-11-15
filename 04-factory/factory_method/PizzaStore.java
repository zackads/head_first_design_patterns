public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);

    public static void main(String[] args) {
        System.out.println("Creating a new PizzaStore...");
        PizzaStore store;
        store = new PizzaStore(new SimplePizzaFactory());
        
        System.out.println("Ordering a cheese pizza, a clam pizza, a pepperoni pizza and a veggie pizza.");
        store.orderPizza("cheese");
        store.orderPizza("clam");
        store.orderPizza("pepperoni");
        store.orderPizza("veggie");
    }
}