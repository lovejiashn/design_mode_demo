package com.jiashn.designmode.buildermode.service.impl.burger;

import com.jiashn.designmode.buildermode.service.Packing;

/**
 * @author jiangjs
 * @date 2021-08-22 15:34
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
