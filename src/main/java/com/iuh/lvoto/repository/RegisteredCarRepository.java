package com.iuh.lvoto.repository;

import com.iuh.lvoto.model.RegisteredCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisteredCarRepository extends JpaRepository<RegisteredCar, String> {
}
