package com.jiashn.designmode.prototypemode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * @author jiangjs
 * @description 选择题实体
 * @date 2021-08-22 19:46
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
public class ChoiceQuestion {
    private String title;
    private Map<String,String> option;
    private String answer;
}
