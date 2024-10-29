import base.Beverage;
import base.Moka;
import decorator.MilkDecorator;
import decorator.SugarDecorator;

public class Test {
    public static void main(String[] args) {
        Beverage beverage = new Moka();

        beverage = new SugarDecorator(beverage);

        beverage = new MilkDecorator(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
