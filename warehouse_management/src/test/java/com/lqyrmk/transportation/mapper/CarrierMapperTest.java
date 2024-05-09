package com.lqyrmk.transportation.mapper;

import com.lqyrmk.transportation.WarehouseManagementApplication;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = WarehouseManagementApplication.class)
class CarrierMapperTest {

    @Autowired
    private CarrierMapper carrierMapper;

    private Integer carrierId;

    @BeforeEach
    void setUp() {
        carrierId = 1;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getOrderAndShipperAndCarrierByOrderIdByStepTwo() {
        carrierMapper.getOrderAndShipperAndCarrierByOrderIdByStepTwo(carrierId);
    }
}
