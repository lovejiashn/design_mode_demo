package com.jiashn.designmode.buildermode.service.impl.drink;

import com.jiashn.designmode.buildermode.service.impl.drink.ColdDrink;

import java.math.BigDecimal;

/**
 * @author jiangjs
 * @date 2021-08-22 15:46
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(6);
    }
}
