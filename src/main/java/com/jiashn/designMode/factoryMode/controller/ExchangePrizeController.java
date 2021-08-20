package com.jiashn.designMode.factoryMode.controller;

import com.jiashn.designMode.factoryMode.service.ExchangePrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangjs
 * @description
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
