package com.Vehiclee.New.service;

import com.Vehiclee.New.dto.VehicleTypeDto;
import com.Vehiclee.New.model.VehicleBrand;
import com.Vehiclee.New.model.VehicleType;
import com.Vehiclee.New.model.VehicleYear;
import com.Vehiclee.New.repository.VehicleBrandRepository;
import com.Vehiclee.New.repository.VehicleTypeRepository;
import com.Vehiclee.New.repository.VehicleYearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleTypeServiceImpl implements VehicleTypeService{

    @Autowired
    VehicleTypeRepository vehicleTypeRepository;
    @Autowired
    VehicleBrandRepository vehicleBrandRepository;

    @Override
    public List<VehicleType> getAll() {
        return vehicleTypeRepository.findAll();
    }

    @Override
    public VehicleType getById(Long id) {
        return vehicleTypeRepository.findById(id).orElse(null);
    }

    @Override
    public VehicleType addVehicleType(VehicleTypeDto vehicleTypeDto) {
        VehicleType vehicleType = new VehicleType();
        vehicleType.setName(vehicleTypeDto.getName());
        VehicleBrand vehicleBrand = vehicleBrandRepository.findById(vehicleTypeDto.getBrand()).orElse(null);
        vehicleType.setBrand(vehicleBrand);
        return vehicleTypeRepository.save(vehicleType);
    }

    @Override
    public VehicleType updateVehicleType(Long id, VehicleTypeDto vehicleTypeDto) {

        VehicleType vehicleTypeUpdate = vehicleTypeRepository.findById(id).orElse(null);
        if(vehicleTypeUpdate != null){
            vehicleTypeUpdate.setName(vehicleTypeDto.getName());
            VehicleBrand vehicleBrand = vehicleBrandRepository.findById(vehicleTypeDto.getBrand()).orElse(null);
            vehicleTypeUpdate.setBrand(vehicleBrand);
            vehicleTypeRepository.save(vehicleTypeUpdate);
            return vehicleTypeUpdate;
        }
        return null;
    }

    @Override
    public void deleteVehicleType(Long id) {
        vehicleTypeRepository.deleteById(id);
    }
}
