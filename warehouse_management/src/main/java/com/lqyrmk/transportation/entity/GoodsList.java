package com.lqyrmk.transportation.entity;

import lombok.Data;

@Data
public class GoodsList {

    private Integer id;

    private Integer goodsId;

    private String goodsName;

    private Double price;

    private Double weight;

    private Integer num;

}
