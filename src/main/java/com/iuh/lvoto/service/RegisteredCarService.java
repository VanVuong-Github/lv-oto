package com.iuh.lvoto.service;

import com.iuh.lvoto.model.RegisteredCar;
import com.iuh.lvoto.request.CreateRegisteredCarRequest;

public interface RegisteredCarService{
    RegisteredCar create(final CreateRegisteredCarRequest request);
    RegisteredCar update(final RegisteredCar registeredCar, final String id);
    void delete(final String id);
}
