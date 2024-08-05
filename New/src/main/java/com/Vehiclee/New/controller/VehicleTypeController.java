package com.Vehiclee.New.controller;

import com.Vehiclee.New.dto.VehicleTypeDto;
import com.Vehiclee.New.model.VehicleType;
import com.Vehiclee.New.model.VehicleYear;
import com.Vehiclee.New.service.VehicleTypeService;
import com.Vehiclee.New.service.VehicleYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleTypeController {

    @Autowired
    VehicleTypeService vehicleTypeService;

    @GetMapping("/vehicletype/getall")
    List<VehicleType> vehicleTypeGetAll(){
        return vehicleTypeService.getAll();
    }

    @GetMapping("/vehicletype/getbyid/{id}")
    VehicleType vehicleTypeGetById(@PathVariable Long id){
        return vehicleTypeService.getById(id);
    }

    @PostMapping("/vehicletype/add")
    VehicleType addVehicleType(@RequestBody VehicleTypeDto vehicleTypeDto){
        return vehicleTypeService.addVehicleType(vehicleTypeDto);
    }

    @PatchMapping("/vehicletype/update/{id}")
    VehicleType updateVehicleType(@PathVariable Long id, @RequestBody VehicleTypeDto vehicleTypeDto){
        return vehicleTypeService.updateVehicleType(id, vehicleTypeDto);
    }

    @DeleteMapping("/vehicletype/delete/{id}")
    void deleteVehicleType(@PathVariable Long id){
        vehicleTypeService.deleteVehicleType(id);
    }
}
