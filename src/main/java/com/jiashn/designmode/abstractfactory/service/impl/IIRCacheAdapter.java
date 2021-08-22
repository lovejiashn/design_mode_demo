package com.jiashn.designmode.abstractfactory.service.impl;

import com.jiashn.designmode.abstractfactory.service.ICacheAdapter;
import com.jiashn.designmode.abstractfactory.utils.IIR;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

/**
 * @author jiangjs
 * @description IIR集群-实现定义的适配接口
 * @date 2021-08-21 21:31
 */
public class IIRCacheAdapter implements ICacheAdapter {

     IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
