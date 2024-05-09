package com.lqyrmk.transportation.service;

import com.lqyrmk.transportation.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    List<Order> getOrdersByInfo(String keywords);

    Order getOrderById(Integer orderId);

    void saveOrder(Order order);

    void updateOrder(Order order);

    void deleteOrder(Integer orderId);
}
