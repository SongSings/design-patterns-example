package com.john.design.service.impl;

import com.john.design.service.AbsFactory;
import com.john.design.service.Pizza;

/**
 * @author john
 * @desc 伦敦工厂类
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza CreatePizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
