package com.lqyrmk.transportation.entity;

import lombok.Data;

@Data
public class OrderDetails {

    private Integer id;

    private Integer orderId;
//    private Order order;

    private String goodsName;

    private Goods goods;

    private Integer goodsNum;

}
