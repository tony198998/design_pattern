package com.design.order;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        this.orderList.add(order);
    }

    public void palceOrder(){
        for (Order order:orderList) {
            order.execute();
        }
        //执行完list清空
        orderList.clear();
    }

}
