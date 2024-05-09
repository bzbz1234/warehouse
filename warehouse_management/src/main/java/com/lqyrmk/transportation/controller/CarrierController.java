package com.lqyrmk.transportation.controller;

import com.lqyrmk.transportation.service.CarrierService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class CarrierController {

    @Autowired
    private CarrierService carrierService;

}
