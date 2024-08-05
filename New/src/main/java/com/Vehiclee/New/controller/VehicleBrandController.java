package com.Vehiclee.New.controller;

import com.Vehiclee.New.model.User;
import com.Vehiclee.New.model.VehicleBrand;
import com.Vehiclee.New.service.UserService;
import com.Vehiclee.New.service.VehicleBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleBrandController {

    @Autowired
    VehicleBrandService vehicleBrandService;

    @GetMapping("/vehiclebrand/getall")
    List<VehicleBrand> vehicleBrandGetAll(){
        return vehicleBrandService.getAll();
    }

    @GetMapping("/vehiclebrand/getbyid/{id}")
    VehicleBrand vehicleBrandGetById(@PathVariable Long id){
        return vehicleBrandService.getById(id);
    }

    @PostMapping("/vehiclebrand/add")
    VehicleBrand addVehicleBrand(@RequestBody VehicleBrand vehicleBrand){
        return vehicleBrandService.addVehicleBrand(vehicleBrand);
    }

    @PatchMapping("/vehiclebrand/update/{id}")
    VehicleBrand updateVehicleBrand(@PathVariable Long id, @RequestBody VehicleBrand vehicleBrand){
        return vehicleBrandService.updateVehicleBrand(id, vehicleBrand);
    }

    @DeleteMapping("/vehiclebrand/delete/{id}")
    void deleteVehicleBrand(@PathVariable Long id){
        vehicleBrandService.deleteVehicleBrand(id);
    }
}
