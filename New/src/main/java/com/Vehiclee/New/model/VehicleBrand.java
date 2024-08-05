package com.Vehiclee.New.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class VehicleBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
