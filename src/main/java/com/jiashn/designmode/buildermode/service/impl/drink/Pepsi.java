package com.jiashn.designmode.buildermode.service.impl.drink;

import com.jiashn.designmode.buildermode.service.impl.drink.ColdDrink;

import java.math.BigDecimal;

/**
 * @author jiangjs
 * @date 2021-08-22 15:47
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(7);
    }
}
