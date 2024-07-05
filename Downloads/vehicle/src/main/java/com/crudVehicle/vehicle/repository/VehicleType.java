package com.crudVehicle.vehicle.repository;

import com.crudVehicle.vehicle.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleType extends JpaRepository<User, Long> {
}
