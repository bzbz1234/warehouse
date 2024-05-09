package com.lqyrmk.transportation.entity;

import lombok.Data;

import java.util.List;

@Data
public class Order {

    // 订单编号
    private Integer orderId;

    // 订单信息
    private List<OrderDetails> orderDetailsList;

    // 托运人
    private Shipper shipper;

    // 承运商
    private Carrier carrier;

    // 收货人
    private String consignee;

    // 收获人电话
    private String consigneePhone;

    // 发货地
    private String shipmentPlace;

    // 目的地
    private String destination;

    // 运输重量
    private Double totalWeight;

    // 运输总价
    private Double totalPrice;

    // 订单状态
    private String state;

}
