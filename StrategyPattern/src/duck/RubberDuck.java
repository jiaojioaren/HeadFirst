package duck;

import behavior.fly.FlyNoWay;
import behavior.quack.MuteQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
