package com.jiashn.designmode.abstractfactory.utils;

import com.jiashn.designmode.abstractfactory.service.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author jiangjs
 * @description 实现JDK动态代理
 * @date 2021-08-21 21:44
 */
public class JDKInvocationHandler implements InvocationHandler {

    private final ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter){
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       return ICacheAdapter.class.getMethod(method.getName(),getClazzByArgs(args)).invoke(cacheAdapter,args);
    }

    public static Class<?>[] getClazzByArgs(Object[] args) {
        Class<?>[] parameterTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof ArrayList) {
                parameterTypes[i] = List.class;
                continue;
            }
            if (args[i] instanceof LinkedList) {
                parameterTypes[i] = List.class;
                continue;
            }
            if (args[i] instanceof HashMap) {
                parameterTypes[i] = Map.class;
                continue;
            }
            if (args[i] instanceof Long){
                parameterTypes[i] = long.class;
                continue;
            }
            if (args[i] instanceof Double){
                parameterTypes[i] = double.class;
                continue;
            }
            if (args[i] instanceof TimeUnit){
                parameterTypes[i] = TimeUnit.class;
                continue;
            }
            parameterTypes[i] = args[i].getClass();
        }
        return parameterTypes;
    }
}
