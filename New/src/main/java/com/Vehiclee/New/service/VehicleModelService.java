package com.Vehiclee.New.service;


import com.Vehiclee.New.dto.VehicleModelDto;
import com.Vehiclee.New.dto.VehicleTypeDto;
import com.Vehiclee.New.model.VehicleModel;
import com.Vehiclee.New.model.VehicleType;

import java.util.List;

public interface VehicleModelService {
    //get all
    List<VehicleModel> getAll();

    //get by id
    VehicleModel getById(Long id);

    //add vehicleModel
    VehicleModel addVehicleModel(VehicleModelDto vehicleModelDto);

    //update vehicleModel
    VehicleModel updateVehicleModel(Long id, VehicleModelDto vehicleModelDto);

    //delete vehicleType
    void deleteVehicleModel(Long id);
}
