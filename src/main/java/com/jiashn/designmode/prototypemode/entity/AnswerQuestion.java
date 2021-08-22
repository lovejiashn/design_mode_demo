package com.jiashn.designmode.prototypemode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author jiangjs
 * @description 问答题实体
 * @date 2021-08-22 19:49
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
public class AnswerQuestion {
    private String title;
    private String answer;
}
