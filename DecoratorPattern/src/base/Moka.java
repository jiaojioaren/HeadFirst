package base;

public class Moka extends Beverage{
    @Override
    public double cost() {
        return 9.9;
    }

    @Override
    public String getDescription() {
        return "摩卡咖啡";
    }
}
