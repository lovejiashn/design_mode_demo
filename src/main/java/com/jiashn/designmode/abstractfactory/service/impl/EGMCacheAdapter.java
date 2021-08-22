package com.jiashn.designmode.abstractfactory.service.impl;

import com.jiashn.designmode.abstractfactory.service.ICacheAdapter;
import com.jiashn.designmode.abstractfactory.utils.EGM;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

/**
 * @author jiangjs
 * @description EGM集群-实现定义的适配接口
 * @date 2021-08-21 21:29
 */
public class EGMCacheAdapter implements ICacheAdapter {

    EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
