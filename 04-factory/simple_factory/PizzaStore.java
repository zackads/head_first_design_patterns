public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

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