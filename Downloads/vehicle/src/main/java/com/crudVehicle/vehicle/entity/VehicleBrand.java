package com.crudVehicle.vehicle.entity;

import javax.persistence.*;

@Entity
public class VehicleBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Getters and Setters
}
