package com.jiashn.designmode.adaptermode.controller;

import com.jiashn.designmode.adaptermode.service.AdapterModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  17:12
 */
@RestController
@RequestMapping("/adapter")
public class AdapterModeController {

    @Autowired
    private AdapterModeService adapterModeService;

    @GetMapping("/test")
    public void adapterModeTest(){
        adapterModeService.adapterMode();
    }

    @GetMapping("/player/{type}/{fileName}")
    public void playerAdapterModeTest(@PathVariable("type") String type,@PathVariable("fileName") String fileName){
        adapterModeService.playerAdapterModeTest(type,fileName);
    }
}
