package com.crudVehicle.vehicle.entity;

import javax.persistence.*;

@Entity
public class Pricelist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "year_id")
    private VehicleYear year;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private VehicleModel model;

    // Getters and Setters
}