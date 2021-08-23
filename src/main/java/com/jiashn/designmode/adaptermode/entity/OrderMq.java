package com.jiashn.designmode.adaptermode.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  16:39
 */
@Data
@Accessors(chain = true)
public class OrderMq {
    /**
     * 用户ID
     */
    private String uid;
    /**
     * 商品
     */
    private String sku;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 下单时间
     */
    private Date createOrderTime;
}
