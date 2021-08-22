package com.jiashn.designmode.buildermode.service;

import java.math.BigDecimal;

/**
 * @author jiangjs
 * @description 食物基本信息接口
 * @date 2021-08-22 15:23
 */
public interface Item {

    /**
     * 食物名称
     * @return 名称
     */
    String name();

    /**
     * 事务包装：纸包，瓶装
     * @return 包装信息
     */
    Packing packing();

    /**
     * 价格
     * @return 价格
     */
     BigDecimal price();

}
