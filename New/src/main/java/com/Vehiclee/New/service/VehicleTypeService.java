package com.Vehiclee.New.service;

import com.Vehiclee.New.dto.VehicleTypeDto;
import com.Vehiclee.New.model.VehicleType;
import com.Vehiclee.New.model.VehicleYear;

import java.util.List;

public interface VehicleTypeService {

    //get all
    List<VehicleType> getAll();

    //get by id
    VehicleType getById(Long id);

    //add vehicleType
    VehicleType addVehicleType(VehicleTypeDto vehicleTypeDto);

    //update vehicleType
    VehicleType updateVehicleType(Long id, VehicleTypeDto vehicleTypeDto);

    //delete vehicleType
    void deleteVehicleType(Long id);

}
