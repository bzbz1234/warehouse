package com.lqyrmk.transportation.mapper;

import com.lqyrmk.transportation.entity.Shipper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShipperMapper {

    Shipper getShipperByShippernameAndPassword(@Param("shipperName") String shipperName,
                                         @Param("password") String password);

    Shipper getShipperById(@Param("shipperId") Integer shipperId);

    Shipper getShipperByName(@Param("shipperName") String shipperName);

    Shipper getShipperAndOrderByShipperIdByStepOne(@Param("shipperId") Integer shipperId);

    Shipper getOrderAndShipperAndCarrierByOrderIdByStepTwo(@Param("shipperId") Integer shipperId);

    void insertShipper(Shipper shipper);
}
