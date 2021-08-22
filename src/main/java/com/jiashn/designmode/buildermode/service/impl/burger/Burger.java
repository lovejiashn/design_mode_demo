package com.jiashn.designmode.buildermode.service.impl.burger;

import com.jiashn.designmode.buildermode.service.Item;
import com.jiashn.designmode.buildermode.service.Packing;

import java.math.BigDecimal;

/**
 * @author jiangjs
 * @description 静态类实现共用接口，只实现包装信息，即建造者实现最初的接口（第一步）
 * @date 2021-08-22 15:36
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract  BigDecimal price();
}
