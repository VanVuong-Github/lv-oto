package com.iuh.lvoto.service.impl;

import com.iuh.lvoto.utils.MappingUtils;
import com.iuh.lvoto.model.RegisteredCar;
import com.iuh.lvoto.repository.RegisteredCarRepository;
import com.iuh.lvoto.request.CreateRegisteredCarRequest;
import com.iuh.lvoto.service.RegisteredCarService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;
import java.util.logging.Logger;

@Service
@RequestMapping("/registered-car")
public class RegisteredCarServiceImpl implements RegisteredCarService {

    private static final Logger logger = Logger.getLogger(RegisteredCarServiceImpl.class.getName());

    private RegisteredCarRepository repository;

    public RegisteredCarServiceImpl(RegisteredCarRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public RegisteredCar create(CreateRegisteredCarRequest request) {
        logger.info(">>>>>>>>>>>>>> Create new registered car");
        RegisteredCar registeredCar = MappingUtils.mapObject(request, RegisteredCar.class);
        return repository.save(registeredCar);
    }

    @Override
    @Transactional
    public RegisteredCar update(RegisteredCar registeredCar, String id) {
        logger.info(">>>>>>>>>>>>>> Update registered car");
        return null;
    }

    @Override
    @Transactional
    public void delete(String id) {
        logger.info(">>>>>>>>>>>>>> Delete registered car");
    }
}
