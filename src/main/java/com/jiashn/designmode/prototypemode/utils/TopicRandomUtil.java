package com.jiashn.designmode.prototypemode.utils;

import com.jiashn.designmode.prototypemode.entity.Topic;

import java.util.*;

/**
 * @author jiangjs
 * @date 2021-08-22 19:58
 */
public class TopicRandomUtil {

    public static Topic random(Map<String,String> option, String answer){
        Set<String> entries = option.keySet();
        ArrayList<String> keys = new ArrayList<>(entries);
        Collections.shuffle(keys);
        Map<String, String> optionNew = new HashMap<>();
        int idx = 0;
        String keyNew = "";
        for (String key : entries) {
            String randomKey = keys.get(idx++);
            if (Objects.equals(key,answer)){
                keyNew = randomKey;
            }
            optionNew.put(randomKey,option.get(key));
        }
        return new Topic(optionNew,keyNew);
    }
}
