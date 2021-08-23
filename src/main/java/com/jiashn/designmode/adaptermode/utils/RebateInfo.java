package com.jiashn.designmode.adaptermode.utils;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  16:54
 */
@Data
@Accessors(chain = true)
public class RebateInfo {
    /**
     * 用户Id
     */
    private String userId;
    /**
     * 业务Id
     */
    private String bizId;
    /**
     * 业务时间
     */
    private Date bizTime;
    /**
     * 描述
     */
    private String desc;

    public void setBizTime(String bizTime) {
        this.bizTime = new Date(Long.parseLong("1591077840669"));
    }
}
