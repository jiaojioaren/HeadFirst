package decorator;

import base.Beverage;

public class MilkDecorator extends CondimentDecorator{
    Beverage beverage;
    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "加牛奶";
    }
}
