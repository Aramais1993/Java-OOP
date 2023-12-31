import java.util.ArrayList;

import HW_2.Proposal.HotBeverage;
import HW_2.Proposal.Product;

public class HotAutomat extends Automat {

    public Product findProduct(ArrayList<Product> list_products, String name, double volume, int temperature) {
        for (Product el : list_products) {
            if (el instanceof HotBeverage) {
                if ((((HotBeverage) el).getName().equals(name)) &&
                        (((HotBeverage) el).getVolume() == (volume)) &&
                        (((HotBeverage) el).getTemperature() == temperature)) {
                    return el;
                }
            }
        }
        return null;
    }
}