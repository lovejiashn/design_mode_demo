package com.jiashn.designmode.prototypemode.controller;

import com.jiashn.designmode.prototypemode.service.PrototypeModeRandomQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangjs
 * @date 2021-08-22 20:47
 */
@RestController
@RequestMapping("/prototype")
public class PrototypeModeRandomQuestionController {

    @Autowired
    private PrototypeModeRandomQuestionService randomQuestionService;
    @GetMapping("/test")
    public void prototypeModeRandomQuestion(){
        randomQuestionService.randomQuestion();
    }
}
