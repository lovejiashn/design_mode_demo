package com.jiashn.designmode.buildermode.service.impl;

import com.jiashn.designmode.buildermode.service.impl.burger.ChickenBurger;
import com.jiashn.designmode.buildermode.service.impl.burger.VegBurger;
import com.jiashn.designmode.buildermode.service.impl.drink.Coke;
import com.jiashn.designmode.buildermode.service.impl.drink.Pepsi;

/**
 * @author jiangjs
 * @description 菜单组合的建造类
 * @date 2021-08-22 16:14
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareChickenMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
