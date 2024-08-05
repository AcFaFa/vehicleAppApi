package com.Vehiclee.New.service;

import com.Vehiclee.New.dto.VehicleModelDto;
import com.Vehiclee.New.dto.VehicleTypeDto;
import com.Vehiclee.New.model.VehicleBrand;
import com.Vehiclee.New.model.VehicleModel;
import com.Vehiclee.New.model.VehicleType;
import com.Vehiclee.New.repository.VehicleModelRepository;
import com.Vehiclee.New.repository.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleModelServiceImpl implements VehicleModelService{

    @Autowired
    VehicleModelRepository vehicleModelRepository;

    @Autowired
    VehicleTypeRepository vehicleTypeRepository;

    @Override
    public List<VehicleModel> getAll() {
        return vehicleModelRepository.findAll();
    }

    @Override
    public VehicleModel getById(Long id) {
        return vehicleModelRepository.findById(id).orElse(null);
    }

    @Override
    public VehicleModel addVehicleModel(VehicleModelDto vehicleModelDto) {
        VehicleModel vehicleModel = new VehicleModel();
        vehicleModel.setName(vehicleModelDto.getName());
        VehicleType vehicleType = vehicleTypeRepository.findById(vehicleModelDto.getType()).orElse(null);
        vehicleModel.setType(vehicleType);
        return vehicleModelRepository.save(vehicleModel);
    }

    @Override
    public VehicleModel updateVehicleModel(Long id, VehicleModelDto vehicleModelDto) {

        VehicleModel vehicleModelUpdate = vehicleModelRepository.findById(id).orElse(null);
        if(vehicleModelUpdate != null){
            vehicleModelUpdate.setName(vehicleModelDto.getName());
            vehicleModelUpdate.setType(vehicleTypeRepository.findById(vehicleModelDto.getType()).orElse(null));
            return vehicleModelRepository.save(vehicleModelUpdate);
        }
        return null;
    }

    @Override
    public void deleteVehicleModel(Long id) {
        vehicleModelRepository.deleteById(id);
    }

}
