package com.jiashn.designmode.adaptermode.utils;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  16:58
 */

public class MQAdapter {

    public static RebateInfo adapter(String strJson, Map<String,String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException{
        return adapter(JSONObject.parseObject(strJson),link);
    }
    
    public static RebateInfo adapter(Map<String, Object> objMap, Map<String,String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object o = objMap.get(link.get(key));
            RebateInfo.class.getMethod("set"+key.substring(0,1).toUpperCase()+ key.substring(1),String.class)
                    .invoke(rebateInfo,o.toString());
        }
        return rebateInfo;
    }
}
