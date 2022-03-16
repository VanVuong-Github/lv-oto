package com.iuh.lvoto.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String name;
    private String color;
    private String licensePlate;
    private String brand;
    private String fuel;
    private String transmission;
    private int seat;
    private List<String> images;
}
