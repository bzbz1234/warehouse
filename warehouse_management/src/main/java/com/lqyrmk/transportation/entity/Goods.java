package com.lqyrmk.transportation.entity;

import lombok.Data;

@Data
public class Goods {

    private Integer goodsId;

    private String goodsName;

    private Double price;

    private Double weight;

    private Integer stock;

}
