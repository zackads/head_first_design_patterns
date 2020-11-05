public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly(); // Delegate to the behaviour class
    }

    public void performQuack() {
        quackBehaviour.quack(); // Delegate to the behaviour class
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }
}