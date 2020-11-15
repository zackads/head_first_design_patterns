public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    };

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    };

    public Cheese createCheese() {
        return new MozzarellaCheese();
    };

    public Veggies[] createVieggies() {
        Veggies veggies[] = { new Spinach(); new BlackOlives(); new EggPlant(); }
    };

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    };

    public Clams createClam() {
        return new FrozenClam();
    };
}