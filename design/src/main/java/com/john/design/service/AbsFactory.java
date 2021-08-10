package com.john.design.service;

/**
 * @author john
 * @desc 抽象工厂类
 */
public interface AbsFactory {

    /**
     * 制作披萨
     *
     * @param orderType
     * @return
     */
    Pizza CreatePizza(String orderType);
}
