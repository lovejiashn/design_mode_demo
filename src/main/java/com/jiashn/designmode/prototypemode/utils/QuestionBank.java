package com.jiashn.designmode.prototypemode.utils;

import com.jiashn.designmode.prototypemode.entity.AnswerQuestion;
import com.jiashn.designmode.prototypemode.entity.ChoiceQuestion;
import com.jiashn.designmode.prototypemode.entity.Topic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author jiangjs
 * @description 克隆对象处理类
 * @date 2021-08-22 20:14
 */
public class QuestionBank implements Cloneable {
    /**
     * 考生
     */
    private String candidate;
    /**
     * 学号
     */
    private String stuNumber;

    private ArrayList<ChoiceQuestion> choiceQuestions = new ArrayList<>();
    private ArrayList<AnswerQuestion> answerQuestions = new ArrayList<>();

    public QuestionBank append(ChoiceQuestion choiceQuestion){
        choiceQuestions.add(choiceQuestion);
        return this;
    }
    public QuestionBank append(AnswerQuestion answerQuestion){
        answerQuestions.add(answerQuestion);
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank)super.clone();
        //克隆选择题
        questionBank.choiceQuestions = (ArrayList<ChoiceQuestion>) choiceQuestions.clone();
        //克隆选择题
        questionBank.answerQuestions = (ArrayList<AnswerQuestion>) answerQuestions.clone();
        //题目乱序
        Collections.shuffle(questionBank.choiceQuestions);
        Collections.shuffle(questionBank.answerQuestions);
        //答案乱序
        List<ChoiceQuestion> choiceQuestions = questionBank.choiceQuestions;
        for (ChoiceQuestion choiceQuestion : choiceQuestions) {
            Topic random = TopicRandomUtil.random(choiceQuestion.getOption(), choiceQuestion.getAnswer());
            choiceQuestion.setOption(random.getOption()).setAnswer(random.getAnswer());
        }
        return questionBank;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public String toString(){
        StringBuilder detail = new StringBuilder("考生：" + candidate + "\r\n" +
                "考号：" + stuNumber + "\r\n" +
                "--------------------------------------------\r\n" +
                "一、选择题" + "\r\n\n");
        int titleNum = 1;
        for (ChoiceQuestion choiceQuestion : choiceQuestions) {
            detail.append("第").append(titleNum).append("题：").append(choiceQuestion.getTitle()).append("\r\n");
            Map<String, String> option = choiceQuestion.getOption();
            for (String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");
            }
            detail.append("答案：").append(choiceQuestion.getAnswer()).append("\r\n\n");
            titleNum++;
        }

        detail.append("二、问答题" + "\r\n\n");

        int answerTitleNum = 1;
        for (AnswerQuestion answerQuestion : answerQuestions) {
            detail.append("第").append(answerTitleNum).append("题：").append(answerQuestion.getTitle()).append("\r\n");
            detail.append("答案：").append(answerQuestion.getAnswer()).append("\r\n\n");
            answerTitleNum++;
        }
        return detail.toString();
    }
}
