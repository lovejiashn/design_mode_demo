package com.jiashn.designmode.factorymode.utils;

import java.util.Map;

/**
 * @author jiangjs
 * @description 奖品兑换工厂接口
 * @date 2021-08-20  14:29
 */
public interface ExchangePrizeFactory {

    /**
     * 兑换奖品
     * @param userId 用户Id
     * @param prizeId 奖品Id
     * @param busId 业务Id
     * @param exMap 其他参数
     */
    void exchangePrize(String userId, String prizeId, String busId, Map<String,Object> exMap);
}
