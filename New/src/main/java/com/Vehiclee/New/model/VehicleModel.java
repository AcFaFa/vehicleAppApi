package com.Vehiclee.New.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id" ,referencedColumnName = "id")
    private VehicleType type;
}
