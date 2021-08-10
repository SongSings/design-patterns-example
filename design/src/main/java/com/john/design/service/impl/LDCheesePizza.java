package com.john.design.service.impl;


import com.john.design.service.OrderPizza;
import com.john.design.service.Pizza;
import lombok.extern.slf4j.Slf4j;

/**
 * @author john
 * @desc 伦敦芝士披萨
 */
@Slf4j
public class LDCheesePizza implements OrderPizza {

    String name;

    @Override
    public Pizza createPizza() {
        return null;
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
        log.info(this.getClass().getName());
    }
}
