package com.crudVehicle.vehicle.entity;

import javax.persistence.*;

@Entity
public class VehicleYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "year")
    private Integer year;

    // Getters and Setters
}