package duck;

import behavior.fly.FlyWithWings;
import behavior.quack.Quack;

public class GreenHeadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I'm a green duck!");
    }

    public GreenHeadDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }
}
