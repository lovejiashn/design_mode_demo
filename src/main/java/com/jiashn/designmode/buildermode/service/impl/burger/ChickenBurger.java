package com.jiashn.designmode.buildermode.service.impl.burger;

import com.jiashn.designmode.buildermode.service.impl.burger.Burger;

import java.math.BigDecimal;

/**
 * @author jiangjs
 * @description 实现定义的静态类Burger，即实现方法中的name，price两个方法。即建造者模式的第二步。
 * @date 2021-08-22 15:42
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(30);
    }
}
