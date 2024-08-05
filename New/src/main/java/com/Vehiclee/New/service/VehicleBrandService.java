package com.Vehiclee.New.service;

import com.Vehiclee.New.model.User;
import com.Vehiclee.New.model.VehicleBrand;

import java.util.List;

public interface VehicleBrandService {

    //get all
    List<VehicleBrand> getAll();

    //get by id
    VehicleBrand getById(Long id);

    //add vehiclebrand
    VehicleBrand addVehicleBrand(VehicleBrand vehicleBrand);

    //update vehiclebrand
    VehicleBrand updateVehicleBrand(Long id, VehicleBrand vehicleBrand);

    //delete VehicleBrand
    void deleteVehicleBrand(Long id);

}
