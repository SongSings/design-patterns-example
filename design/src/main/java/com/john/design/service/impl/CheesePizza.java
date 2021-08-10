package com.john.design.service.impl;

import com.john.design.service.Pizza;
import lombok.extern.slf4j.Slf4j;

/**
 * @author john
 * @desc 芝士披萨
 */
@Slf4j
public class CheesePizza implements Pizza {

    @Override
    public void bake() {

    }

    @Override
    public void box() {

    }

    @Override
    public void cut() {
        log.info("cut");
    }

    @Override
    public void prepare() {
        log.info("cheese");
    }
}
