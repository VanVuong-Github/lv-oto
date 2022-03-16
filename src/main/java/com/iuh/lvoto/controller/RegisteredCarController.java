package com.iuh.lvoto.controller;

import com.iuh.lvoto.service.RegisteredCarService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisteredCarController {

    private RegisteredCarService carService;

    public RegisteredCarController(RegisteredCarService carService) {
        this.carService = carService;
    }
}
