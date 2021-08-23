package com.jiashn.designmode.adaptermode.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author jiangjs
 * @description
 * @date 2021-08-23  16:51
 */
@Data
@Accessors(chain = true)
public class POPOrderDelivered {

    /**
     * 用户ID
     */
    private String uId;
    /**
     * 订单号
     */
    private String orderId;
    /**
     *下单时间
     */
    private Date orderTime;
    /**
     * 商品
     */
    private Date sku;
    /**
     * 商品名称
     */
    private Date skuName;
    /**
     * 金额
     */
    private BigDecimal decimal;
}
