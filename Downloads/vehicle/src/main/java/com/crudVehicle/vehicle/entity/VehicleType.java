package com.crudVehicle.vehicle.entity;

import javax.persistence.*;

@Entity
public class VehicleType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private VehicleBrand brand;

    // Getters and Setters
}