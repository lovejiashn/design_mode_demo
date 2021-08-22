package com.jiashn.designmode.abstractfactory.service.impl;

import com.jiashn.designmode.abstractfactory.service.CacheService;

import java.util.concurrent.TimeUnit;

/**
 * @author jiangjs
 * @date 2021-08-21 22:24
 */
public class CacheServiceImpl implements CacheService {
    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {

    }

    @Override
    public void del(String key) {

    }
}
