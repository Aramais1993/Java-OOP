package HW_6;

import java.util.Calendar;

public class Beverage extends Product { // Принцип единственной ответственности, Принцип открытости/закрытости

    private Double volume;

    public Beverage(String name, int price, int quantity, Calendar bestBefore, Double volume) {
        super(name, price, quantity, bestBefore);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume=" + volume;

    }

}