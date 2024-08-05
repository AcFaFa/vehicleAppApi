package com.Vehiclee.New.service;

import com.Vehiclee.New.model.VehicleBrand;
import com.Vehiclee.New.repository.VehicleBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleBrandServiceImpl implements VehicleBrandService{

    @Autowired
    VehicleBrandRepository vehicleBrandRepository;

    @Override
    public List<VehicleBrand> getAll() {
        return vehicleBrandRepository.findAll();
    }

    @Override
    public VehicleBrand getById(Long id) {
        return vehicleBrandRepository.findById(id).orElse(null);
    }

    @Override
    public VehicleBrand addVehicleBrand(VehicleBrand vehicleBrand) {
        return vehicleBrandRepository.save(vehicleBrand);
    }

    @Override
    public VehicleBrand updateVehicleBrand(Long id, VehicleBrand vehicleBrand) {

        VehicleBrand vehicleBrandUpdate = vehicleBrandRepository.findById(id).orElse(null);
        if (vehicleBrandUpdate!=null){
            vehicleBrandUpdate.setName(vehicleBrand.getName());
            vehicleBrandRepository.save(vehicleBrandUpdate);
            return vehicleBrandUpdate;
        }
        return null;
    }

    @Override
    public void deleteVehicleBrand(Long id) {
        vehicleBrandRepository.deleteById(id);
    }
}
