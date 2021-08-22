package com.jiashn.designmode.abstractfactory.service.impl;

import com.jiashn.designmode.abstractfactory.service.AbstractFactoryModeService;
import com.jiashn.designmode.abstractfactory.service.CacheService;
import com.jiashn.designmode.abstractfactory.service.ICacheAdapter;
import com.jiashn.designmode.abstractfactory.utils.ClusterEnum;
import com.jiashn.designmode.abstractfactory.utils.JDKProxy;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author jiangjs
 * @date 2021-08-21 20:55
 */
@Service
public class AbstractFactoryModeServiceImpl implements AbstractFactoryModeService {
    @Override
    public void abstractFactoryModeTest(String type) {
        ClusterEnum clusterEnum = ClusterEnum.match(type);
        if (Objects.nonNull(clusterEnum)){
            ICacheAdapter cacheAdapter = clusterEnum.getCacheAdapter();
            CacheService proxy = JDKProxy.getProxy(CacheServiceImpl.class, cacheAdapter);
            proxy.set("测试001","我是谁?");
        }
    }
}
