package com.jiashn.designmode.buildermode.service.impl;

import com.jiashn.designmode.buildermode.service.BuilderModeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author jiangjs
 * @date 2021-08-22 16:12
 */
@Service
public class BuilderModeServiceImpl implements BuilderModeService {
    private static final Logger logger = LoggerFactory.getLogger(BuilderModeServiceImpl.class);
    @Override
    public void builderModeTest() {
        MealBuilder mealBuilder = new MealBuilder();
        logger.info("----------------订餐---------------------");
        Meal meal = mealBuilder.prepareVegMeal();
        meal.showItems();
        logger.info("总价:{}",meal.getCost());
        logger.info("======================================================================");
        MealBuilder builder = new MealBuilder();
        logger.info("----------------订餐---------------------");
        Meal chickenMeal = builder.prepareChickenMeal();
        chickenMeal.showItems();
        logger.info("总价:{}",chickenMeal.getCost());
    }
}
