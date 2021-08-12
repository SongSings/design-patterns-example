package com.john.design;

import com.john.design.service.Pizza;
import com.john.design.service.impl.CheesePizza;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class ProxyTests {

    /**
     * JDK动态代理 test
     * 通过接口类实现
     */
    @Test
    public void jdkProxyTest() {
        //参数说明
        // 1. 类加载器ClassLoader:借用类加载器，创建代理类的Class对象
        // 2. 原始类的getClass().getInterfaces()方法 获取方法
        // 3. 额外功能
        final Pizza pizza = new CheesePizza(); //Pizza接口类  CheesePizza 接口实现类
        Object o = Proxy.newProxyInstance(ProxyTests.class.getClassLoader(), pizza.getClass().getInterfaces(), new InvocationHandler(){
            //1: 实现类
            //2：执行的方法
            //3: 方法参数
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                //方法执行前可操作的内容
                System.out.println("proxy [[begin]]");
                //原始方法运行
                Object invoke = method.invoke(pizza, objects);

                System.out.println("[[end]]");
                //方法执行结果
                return invoke;
            }
        });
        Pizza pizza2 = (Pizza) o;
        pizza2.prepare();
        pizza.cut();
    }

    /**
     * CGlib动态代理 test
     * 原理: 通过父子继承关系实现
     */
    @Test
    public void cglibProxyTest() {
        CheesePizza pizza = new CheesePizza();
        Enhancer enhancer = new Enhancer();
        //1.类加载器
        enhancer.setClassLoader(this.getClass().getClassLoader());
        //2.父类
        enhancer.setSuperclass(CheesePizza.class);
        //3.额外功能
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("[[begin]]");
            Object invoke = method.invoke(pizza, objects);
            System.out.println("[[end]]");
            return invoke;
        });
        //代理创建
        CheesePizza cheesePizza = (CheesePizza) enhancer.create();
        cheesePizza.cut();
    }
}
