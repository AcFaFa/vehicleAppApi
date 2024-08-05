package com.Vehiclee.New.controller;

import com.Vehiclee.New.dto.VehicleModelDto;
import com.Vehiclee.New.dto.VehicleTypeDto;
import com.Vehiclee.New.model.VehicleModel;
import com.Vehiclee.New.model.VehicleType;
import com.Vehiclee.New.service.VehicleModelService;
import com.Vehiclee.New.service.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleModelController {

    @Autowired
    VehicleModelService vehicleModelService;

    @GetMapping("/vehiclemodel/getall")
    List<VehicleModel> vehicleModelGetAll(){
        return vehicleModelService.getAll();
    }

    @GetMapping("/vehiclemodel/getbyid/{id}")
    VehicleModel vehicleModelGetById(@PathVariable Long id){
        return vehicleModelService.getById(id);
    }

    @PostMapping("/vehiclemodel/add")
    VehicleModel addVehicleModel(@RequestBody VehicleModelDto vehicleModelDto){
        return vehicleModelService.addVehicleModel(vehicleModelDto);
    }

    @PatchMapping("/vehiclemodel/update/{id}")
    VehicleModel updateVehicleModel(@PathVariable Long id, @RequestBody VehicleModelDto vehicleModelDto){
        return vehicleModelService.updateVehicleModel(id, vehicleModelDto);
    }

    @DeleteMapping("/vehiclemodel/delete/{id}")
    void deleteVehicleModel(@PathVariable Long id){
        vehicleModelService.deleteVehicleModel(id);
    }
}
