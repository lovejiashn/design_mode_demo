package com.jiashn.designmode.prototypemode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * @author jiangjs
 * @description 选项与答案实体
 * @date 2021-08-22 19:56
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
public class Topic {
    private Map<String, String> option;
    private String answer;
}
