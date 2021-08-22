package com.jiashn.designmode.factorymode.utils;

import java.util.Objects;

/**
 * @author jiangjs
 * @description 奖品兑换枚举
 */
public enum PrizeEnum {
    /**
     * 优惠券
     */
    COUPON("coupon",new CouponPrizeService()),
    /**
     * 实物商品
     */
    GOODS("goods",new GoodsPrizeService()),
    /**
     * 购物卡
     */
    CARD("card",new CardPrizeService());

    /**
     * 类型名称
     */
    private final String name;
    /**
     * 工厂实体
     */
    private final ExchangePrizeFactory prizeFactory;

    PrizeEnum(String name,ExchangePrizeFactory prizeFactory){
        this.name = name;
        this.prizeFactory = prizeFactory;
    }

    public static PrizeEnum match(String name){
        PrizeEnum[] values = PrizeEnum.values();
        for (PrizeEnum prize : values) {
            if (Objects.equals(prize.name,name)){
                return prize;
            }
        }
        return null;
    }

    public ExchangePrizeFactory getPrizeFactory() {
        return prizeFactory;
    }
}
