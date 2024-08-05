package com.Vehiclee.New.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class VehicleYear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "year")
    private Integer year;
}
