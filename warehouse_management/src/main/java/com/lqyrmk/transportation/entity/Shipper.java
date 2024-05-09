package com.lqyrmk.transportation.entity;

import lombok.Data;

import java.util.List;

@Data
public class Shipper {

    private Integer shipperId;

    private String shipperName;

    private String password;

    private String gender;

    private String email;

    private String phone;

    private List<Order> orders;

}
