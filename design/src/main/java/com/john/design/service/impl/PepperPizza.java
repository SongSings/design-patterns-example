package com.john.design.service.impl;

import com.john.design.service.Pizza;
import lombok.extern.slf4j.Slf4j;

/**
 * @author john
 * @desc 胡椒披萨
 */
@Slf4j
public class PepperPizza implements Pizza {
    public void PepperPizza() {
        log.info("pepper");
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
        log.info("pepper");
    }
}
