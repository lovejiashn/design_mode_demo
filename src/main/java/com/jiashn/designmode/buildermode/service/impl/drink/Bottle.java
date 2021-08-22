package com.jiashn.designmode.buildermode.service.impl.drink;

import com.jiashn.designmode.buildermode.service.Packing;

/**
 * @author jiangjs
 * @date 2021-08-22 15:35
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
