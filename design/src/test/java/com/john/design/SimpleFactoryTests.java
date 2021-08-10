package com.john.design;

import com.john.design.factory.SimplePizzaFactory;
import com.john.design.service.OrderPizza;
import com.john.design.service.Pizza;
import com.john.design.service.impl.LDFactory;
import com.john.design.service.impl.LDOrderPizza;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * junit 单元测试简单工厂
 */
@SpringBootTest
@Slf4j
public class SimpleFactoryTests {

    /**
     * 简单工厂模式 test
     */
    @Test
    public void simpleFactoryTest() {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pepper = simplePizzaFactory.CreatePizza("pepper");
        pepper.prepare();
    }

    /**
     * 工厂方法模式 test
     */
    @Test
    public void functionFactoryTest() {
        OrderPizza orderPizza = new LDOrderPizza();
        Pizza pizza = orderPizza.createPizza();
        pizza.prepare();
    }

    /**
     * 抽象工厂模式 test
     */
    @Test
    public void absFactoryTest() {
        LDFactory ldFactory = new LDFactory();
        Pizza pepper = ldFactory.CreatePizza("pepper");
        pepper.prepare();
    }
}
