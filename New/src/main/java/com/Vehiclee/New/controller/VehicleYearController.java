package com.Vehiclee.New.controller;

import com.Vehiclee.New.model.VehicleBrand;
import com.Vehiclee.New.model.VehicleYear;
import com.Vehiclee.New.service.VehicleBrandService;
import com.Vehiclee.New.service.VehicleYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleYearController {

    @Autowired
    VehicleYearService vehicleYearService;

    @GetMapping("/vehicleyear/getall")
    List<VehicleYear> vehicleYearGetAll(){
        return vehicleYearService.getAll();
    }

    @GetMapping("/vehicleyear/getbyid/{id}")
    VehicleYear vehicleYearGetById(@PathVariable Long id){
        return vehicleYearService.getById(id);
    }

    @PostMapping("/vehicleyear/add")
    VehicleYear addVehicleYear(@RequestBody VehicleYear vehicleYear){
        return vehicleYearService.addVehicleYear(vehicleYear);
    }

    @PatchMapping("/vehicleyear/update/{id}")
    VehicleYear updateVehicleYear(@PathVariable Long id, @RequestBody VehicleYear vehicleYear){
        return vehicleYearService.updateVehicleYear(id, vehicleYear);
    }

    @DeleteMapping("/vehicleyear/delete/{id}")
    void deleteVehicleYear(@PathVariable Long id){
        vehicleYearService.deleteVehicleYear(id);
    }
}
