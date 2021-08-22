package com.jiashn.designmode.abstractfactory.controller;

import com.jiashn.designmode.abstractfactory.service.AbstractFactoryModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangjs
 * @description 测试抽象工厂，抽象工厂：提供一个中心工厂来实现其他工厂
 * @date 2021-08-21 20:52
 */
@RestController
@RequestMapping("/abstract/factory")
public class AbstractFactoryModeController {
    @Autowired
    private AbstractFactoryModeService factoryModeService;

    @GetMapping("/test/{type}")
    public void abstractFactoryModeTest(@PathVariable("type") String type){
        factoryModeService.abstractFactoryModeTest(type);
    }
}
