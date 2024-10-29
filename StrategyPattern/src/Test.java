import duck.GreenHeadDuck;
import duck.RubberDuck;
import java.util.concurrent.Semaphore;

public class Test {
    public static void main(String[] args) {
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        greenHeadDuck.fly();
        greenHeadDuck.quack();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.quack();
    }
}
