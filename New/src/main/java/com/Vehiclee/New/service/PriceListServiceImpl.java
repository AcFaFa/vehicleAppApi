package com.Vehiclee.New.service;

import com.Vehiclee.New.dto.PriceListDto;
import com.Vehiclee.New.dto.VehicleModelDto;
import com.Vehiclee.New.model.PriceList;
import com.Vehiclee.New.model.VehicleModel;
import com.Vehiclee.New.model.VehicleType;
import com.Vehiclee.New.model.VehicleYear;
import com.Vehiclee.New.repository.PriceListRepository;
import com.Vehiclee.New.repository.VehicleModelRepository;
import com.Vehiclee.New.repository.VehicleTypeRepository;
import com.Vehiclee.New.repository.VehicleYearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceListServiceImpl implements PriceListService{

    @Autowired
    PriceListRepository priceListRepository;

    @Autowired
    VehicleModelRepository vehicleModelRepository;

    @Autowired
    VehicleYearRepository vehicleYearRepository;

    @Override
    public List<PriceList> getAll() {
        return priceListRepository.findAll();
    }

    @Override
    public PriceList getById(Long id) {
        return priceListRepository.findById(id).orElse(null);
    }

    @Override
    public PriceList addPriceList(PriceListDto priceListDto) {
        PriceList priceList = new PriceList();
        priceList.setCode(priceListDto.getCode());
        priceList.setPrice(priceListDto.getPrice());
        VehicleYear vehicleYear = vehicleYearRepository.findById(priceListDto.getYear()).orElse(null);
        VehicleModel vehicleModel = vehicleModelRepository.findById(priceListDto.getModel()).orElse(null);
        priceList.setYear(vehicleYear);
        priceList.setModel(vehicleModel);
        priceListRepository.save(priceList);
        return priceList;
    }

    @Override
    public PriceList updatePriceList(Long id, PriceListDto priceListDto) {

        PriceList priceListUpdate = priceListRepository.findById(id).orElse(null);
        if(priceListUpdate != null){
            priceListUpdate.setCode(priceListDto.getCode());
            priceListUpdate.setPrice(priceListDto.getPrice());
            priceListUpdate.setYear(vehicleYearRepository.findById(priceListDto.getYear()).orElse(null));
            priceListUpdate.setModel(vehicleModelRepository.findById(priceListDto.getModel()).orElse(null));
            return priceListRepository.save(priceListUpdate);
        }
        return null;
    }

    @Override
    public void deletePriceList(Long id) {
        priceListRepository.deleteById(id);
    }
}
