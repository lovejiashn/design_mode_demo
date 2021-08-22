package com.jiashn.designmode.abstractfactory.utils;

import com.jiashn.designmode.abstractfactory.service.ICacheAdapter;
import com.jiashn.designmode.abstractfactory.service.impl.EGMCacheAdapter;
import com.jiashn.designmode.abstractfactory.service.impl.IIRCacheAdapter;

import java.util.Objects;

/**
 * @author jiangjs
 */

public enum ClusterEnum {

    /**
     * 集群EGM
     */
    EGM("egm",new EGMCacheAdapter()),
    /**
     * 集群IIR
     */
    IIR("iir",new IIRCacheAdapter());

    private final String type;
    private final ICacheAdapter cacheAdapter;

    ClusterEnum(String type,ICacheAdapter cacheAdapter){
        this.type = type;
        this.cacheAdapter = cacheAdapter;
    }

    public static ClusterEnum match(String type){
        ClusterEnum[] clusterEnums = ClusterEnum.values();
        for (ClusterEnum clusterEnum : clusterEnums) {
            if (Objects.equals(clusterEnum.type,type)){
                return clusterEnum;
            }
        }
        return null;
    }

    public ICacheAdapter getCacheAdapter() {
        return cacheAdapter;
    }
}
