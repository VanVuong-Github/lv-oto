package com.iuh.lvoto.request;

import com.iuh.lvoto.model.Car;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateRegisteredCarRequest {
    private Car car;

    private float discount;

    @NotBlank(message = "Địa chỉ xe không được để trống")
    private String address;

    @NotNull(message = "Phương thức giao nhận không được rỗng")
    private boolean delivery;
    private double maxDistance;
    private double feePerKm;
    private double freeRange;

    @NotNull(message = "Giới hạn số km không được rỗng")
    private boolean limitKm;
    private double limitKmPerDay;
    private double feeOverLimit;
    private String compliant;

    private String ownerId;
}
