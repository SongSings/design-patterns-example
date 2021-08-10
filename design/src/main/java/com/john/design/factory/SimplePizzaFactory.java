package com.john.design.factory;

import com.john.design.service.impl.CheesePizza;
import com.john.design.service.impl.PepperPizza;
import com.john.design.service.Pizza;

/**
 * @author john
 * @desc 工厂模式示例
 */
public class SimplePizzaFactory {

    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;
        if (ordertype.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
