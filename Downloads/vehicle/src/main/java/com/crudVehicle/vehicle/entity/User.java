// src/main/java/com/example/demo/entity/User.java
package com.crudVehicle.vehicle.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean isAdmin;

    // Getters and Setters
}
