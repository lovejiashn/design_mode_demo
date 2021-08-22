package com.jiashn.designmode.buildermode.controller;

import com.jiashn.designmode.buildermode.service.BuilderModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangjs
 * @description 建造者模式
 * @date 2021-08-22 16:10
 */
@RestController
@RequestMapping("/builder")
public class BuilderModeController {

    @Autowired
    private BuilderModeService builderModeService;

    @GetMapping("/test")
    public void builderModeTest(){
        builderModeService.builderModeTest();
    }
}
