package com.crudVehicle.vehicle.entity;

import javax.persistence.*;

@Entity
public class VehicleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private VehicleType type;

    // Getters and Setters
}
