package com.Vehiclee.New.service;

import com.Vehiclee.New.model.VehicleYear;

import java.util.List;

public interface VehicleYearService {

    //get all
    List<VehicleYear> getAll();

    //get by id
    VehicleYear getById(Long id);

    //add vehicleyear
    VehicleYear addVehicleYear(VehicleYear vehicleYear);

    //update vehicleYear
    VehicleYear updateVehicleYear(Long id, VehicleYear vehicleYear);

    //delete vehicleYear
    void deleteVehicleYear(Long id);
}
