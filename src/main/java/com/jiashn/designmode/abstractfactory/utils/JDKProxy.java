package com.jiashn.designmode.abstractfactory.utils;

import com.jiashn.designmode.abstractfactory.service.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author jiangjs
 * @date 2021-08-21 21:55
 */
public class JDKProxy {

    public static <T> T getProxy(Class<T> interfaceClazz, ICacheAdapter cacheAdapter){
        //定义的增强功能，定义方法的增强规则
        InvocationHandler invocationHandler = new JDKInvocationHandler(cacheAdapter);
        //类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        //被代理的对象实现所有的接口的字节码数组
        Class<?>[] interfaces = interfaceClazz.getInterfaces();
        return  (T) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
