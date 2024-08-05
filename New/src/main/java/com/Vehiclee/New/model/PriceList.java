package com.Vehiclee.New.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PriceList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "year_id", referencedColumnName = "id")
    private VehicleYear year;

    @ManyToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private VehicleModel model;
}
