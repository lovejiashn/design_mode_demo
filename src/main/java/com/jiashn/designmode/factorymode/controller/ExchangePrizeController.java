package com.jiashn.designmode.factorymode.controller;

import com.jiashn.designmode.factorymode.service.ExchangePrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangjs
 * @description 工厂方法模式：提供一个公共接口，其他子类进行实现，减少ifelse
 * @date 2021-08-20  15:39
 */
@RestController
@RequestMapping("/factory")
public class ExchangePrizeController {

    @Autowired
    private ExchangePrizeService prizeService;

    @GetMapping("/test/{type}")
    public void exchangePrize(@PathVariable("type") String type){
        prizeService.exchangePrize(type);
    }
}
