package flyweight;

import java.util.ArrayList;
import java.util.List;

public class TeaShop {
    private TeaMaker teaMaker;
    private List<Tea> orders;

    public TeaShop() {
        this.teaMaker = new TeaMaker();
    }

    public List<Tea> takeOrder(String teaType, int table) {
        orders = new ArrayList<>();
        for (int i = 0; i < table; i++) {
            orders.add(teaMaker.make(teaType));
        }
        return orders;
    }
}
