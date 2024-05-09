package com.lqyrmk.transportation.service;

import com.lqyrmk.transportation.entity.Shipper;

public interface ShipperService {

    Shipper login(String shipperName, String password);

    Shipper getShipperById(Integer shipperId);

    Shipper getShipperByName(String shipperName);

    void registerShipper(Shipper shipper);
}
