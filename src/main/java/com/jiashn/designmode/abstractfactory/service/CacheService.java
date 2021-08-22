package com.jiashn.designmode.abstractfactory.service;

import java.util.concurrent.TimeUnit;

/**
 * @author jiangjs
 * @date 2021-08-21 22:24
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
