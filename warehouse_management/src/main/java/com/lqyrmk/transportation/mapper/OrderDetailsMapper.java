package com.lqyrmk.transportation.mapper;

import com.lqyrmk.transportation.entity.GoodsList;
import com.lqyrmk.transportation.entity.Order;
import com.lqyrmk.transportation.entity.OrderDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDetailsMapper {

    List<OrderDetails> getOrderDetailsByOrderId(@Param("orderId") Integer orderId);

    void insertOrderDetails(@Param("order") Order order, @Param("goodsList") GoodsList goodsList);

    void deleteOrderDetails(@Param("orderId") Integer orderId);
}
