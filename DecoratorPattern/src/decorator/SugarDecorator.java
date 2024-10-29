package decorator;

import base.Beverage;

public class SugarDecorator extends CondimentDecorator{
    private final Beverage beverage;
    public SugarDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "加糖";
    }
}
