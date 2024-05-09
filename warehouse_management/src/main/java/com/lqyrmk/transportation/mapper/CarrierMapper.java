package com.lqyrmk.transportation.mapper;

import com.lqyrmk.transportation.entity.Carrier;
import com.lqyrmk.transportation.entity.Shipper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarrierMapper {

    Carrier getOrderAndShipperAndCarrierByOrderIdByStepTwo(@Param("carrierId") Integer carrierId);

}
