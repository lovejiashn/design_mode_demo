package com.jiashn.designmode.buildermode.service.impl.burger;

import com.jiashn.designmode.buildermode.service.impl.burger.Burger;

import java.math.BigDecimal;

/**
 * @author jiangjs
 * @date 2021-08-22 15:38
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(25);
    }
}
