package com.jiashn.designmode.abstractfactory.service;

import java.util.concurrent.TimeUnit;

/**
 * @author jiangjs
 * @description 适配类，适配不同接口，存在不同的方法
 * @date 2021-08-21 21:23
 */
public interface ICacheAdapter {

    /**
     * 获取数据
     * @param key 查询key
     * @return 查询结果
     */
    String get(String key);

    /**
     * 设置参数信息
     * @param key 保存的key
     * @param value 保存的值
     */
    void set(String key, String value);

    /**
     * 保存数据-设置过期时间
     * @param key 保存的key
     * @param value 保存的值
     * @param timeout 过期时间
     * @param timeUnit 时间单元
     */
    void set(String key, String value, long timeout, TimeUnit timeUnit);

    /**
     * 删除数据
     * @param key key
     */
    void del(String key);
}
