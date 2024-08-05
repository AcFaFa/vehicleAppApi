package com.Vehiclee.New.dto;

import com.Vehiclee.New.model.VehicleBrand;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class VehicleTypeDto {

    private String name;

    private Long brand;
}
