package com.Vehiclee.New.service;

import com.Vehiclee.New.model.VehicleYear;
import com.Vehiclee.New.repository.VehicleBrandRepository;
import com.Vehiclee.New.repository.VehicleYearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleYearServiceImpl implements VehicleYearService {

    @Autowired
    VehicleYearRepository vehicleYearRepository;

    @Override
    public List<VehicleYear> getAll() {
        return vehicleYearRepository.findAll();
    }

    @Override
    public VehicleYear getById(Long id) {
        return vehicleYearRepository.findById(id).orElse(null);
    }

    @Override
    public VehicleYear addVehicleYear(VehicleYear vehicleYear) {
        return vehicleYearRepository.save(vehicleYear);
    }

    @Override
    public VehicleYear updateVehicleYear(Long id, VehicleYear vehicleYear) {

        VehicleYear vehicleYearUpdate = vehicleYearRepository.findById(id).orElse(null);
        if(vehicleYearUpdate != null){
            vehicleYearUpdate.setYear(vehicleYear.getYear());
            return vehicleYearRepository.save(vehicleYearUpdate);
        }
        return null;
    }

    @Override
    public void deleteVehicleYear(Long id) {
        vehicleYearRepository.deleteById(id);
    }
}
