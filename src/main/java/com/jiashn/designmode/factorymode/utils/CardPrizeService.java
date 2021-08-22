package com.jiashn.designmode.factorymode.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-20  14:38
 */
public class CardPrizeService implements ExchangePrizeFactory{
    private static final Logger logger = LoggerFactory.getLogger(CardPrizeService.class);
    @Override
    public void exchangePrize(String userId, String prizeId, String busId, Map<String, Object> exMap) {
        logger.info("---------------卡兑换-----------------------");
        logger.info("--------用户Id:{},奖品Id:{},业务Id:{}------",userId,prizeId,busId);
    }
}
