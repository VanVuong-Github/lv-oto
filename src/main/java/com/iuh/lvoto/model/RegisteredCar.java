package com.iuh.lvoto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.iuh.lvoto.base.JPACustomType;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SQLDelete(sql = "UPDATE claim_request SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class RegisteredCar extends BaseModel{
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    private String carCode;

    @Type(type = JPACustomType.JSONB)
    @Column(columnDefinition = JPACustomType.JSONB_DEF)
    private Car car;

    private float discount;
    private String address;

    private boolean delivery;
    private double maxDistance;
    private double feePerKm;
    private double freeRange;

    private boolean limitKm;
    private double limitKmPerDay;
    private double feeOverLimit;
    private String compliant;

    private String ownerId;

    @JsonIgnore
    private boolean deleted = Boolean.FALSE;
}
