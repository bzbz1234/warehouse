package com.lqyrmk.transportation.mapper;

import com.lqyrmk.transportation.entity.Order;
import com.lqyrmk.transportation.entity.Shipper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> getAllOrders();

    List<Order> getOrdersByInfo(@Param("keywords") String keywords);

    Order getOrderById(@Param("orderId") Integer orderId);

    Order getOrderAndShipperAndCarrierByOrderIdByStepOne(@Param("orderId") Integer orderId);

    List<Order> getShipperAndOrderByShipperIdByStepTwo(@Param("shipperId") Integer shipperId);

    void insertOrder(Order order);

    void updateOrder(Order order);

    void deleteOrder(@Param("orderId") Integer orderId);

    void updateOrderPriceAndWeight(Order order);

}
