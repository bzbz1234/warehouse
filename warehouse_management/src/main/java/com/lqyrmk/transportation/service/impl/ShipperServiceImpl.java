package com.lqyrmk.transportation.service.impl;

import com.lqyrmk.transportation.entity.Shipper;
import com.lqyrmk.transportation.mapper.ShipperMapper;
import com.lqyrmk.transportation.service.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipperServiceImpl implements ShipperService {

    @Autowired
    private ShipperMapper shipperMapper;

    @Override
    public Shipper login(String shipperName, String password) {
        Shipper shipper = shipperMapper.getShipperByShippernameAndPassword(shipperName, password);
        return shipper;
    }

    @Override
    public Shipper getShipperById(Integer shipperId) {
//        Shipper shipper = shipperMapper.getShipperById(shipperId);
        Shipper shipper = shipperMapper.getShipperAndOrderByShipperIdByStepOne(shipperId);
        return shipper;
    }

    @Override
    public Shipper getShipperByName(String shipperName) {
        Shipper shipper = shipperMapper.getShipperByName(shipperName);
        return shipper;
    }

    @Override
    public void registerShipper(Shipper shipper) {
        shipperMapper.insertShipper(shipper);
    }
}
