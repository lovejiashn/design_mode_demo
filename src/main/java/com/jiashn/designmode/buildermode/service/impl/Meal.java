package com.jiashn.designmode.buildermode.service.impl;

import com.jiashn.designmode.buildermode.service.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangjs
 * @description 创建菜单方法，实现添加Item接口信息，并实现其他操作
 * @date 2021-08-22 16:02
 */
public class Meal {
    private static final Logger logger = LoggerFactory.getLogger(Meal.class);
    List<Item> items = new ArrayList<>();
    /**
     * 添加食物基本信息
     */
    public void addItem(Item item){
        items.add(item);
    }

    /**
     * 获取总价格
     */
    public BigDecimal getCost(){
        BigDecimal cost = new BigDecimal(0);
        for (Item item : items) {
            cost = cost.add(item.price()) ;
        }
        return cost;
    }

    /**
     * 显示食物基本信息
     */
    public void showItems(){
        for (Item item : items) {
            logger.info("食物名称: {} ,  包装 : {} , 价格 : {}",item.name(),item.packing().pack(),item.price());
        }
    }
}
