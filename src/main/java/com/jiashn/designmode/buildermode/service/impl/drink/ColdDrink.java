package com.jiashn.designmode.buildermode.service.impl.drink;

import com.jiashn.designmode.buildermode.service.Item;
import com.jiashn.designmode.buildermode.service.Packing;

import java.math.BigDecimal;

/**
 * @author jiangjs
 * @date 2021-08-22 15:43
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract BigDecimal price();
}
