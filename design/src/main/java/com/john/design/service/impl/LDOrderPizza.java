package com.john.design.service.impl;

import com.john.design.service.OrderPizza;
import com.john.design.service.Pizza;

/**
 * @author john
 * @desc 伦敦披萨订单
 */
public class LDOrderPizza implements OrderPizza {

    Pizza createPizza(String ordertype) {
        Pizza pizza = null;
        if (ordertype.equals("cheese")) {
            pizza = new LDPepperPizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

    @Override
    public Pizza createPizza() {
        return createPizza("pepper");
    }

    @Override
    public void bake() {

    }

    @Override
    public void box() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void prepare() {

    }
}
