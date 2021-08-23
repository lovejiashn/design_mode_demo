package com.jiashn.designmode.adaptermode.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  16:03
 */
@Data
@Accessors(chain = true)
public class CreateAccount {
    /**
     * 账户编码
     */
    private String accountNum;
    /**
     * 地址
     */
    private String address;
    /**
     * 开户时间
     */
    private Date accountDate;
    /**
     * 描述
     */
    private String desc;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
