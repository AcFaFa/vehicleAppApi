package com.Vehiclee.New.service;

import com.Vehiclee.New.dto.PriceListDto;
import com.Vehiclee.New.dto.VehicleModelDto;
import com.Vehiclee.New.model.PriceList;
import com.Vehiclee.New.model.User;
import com.Vehiclee.New.model.VehicleModel;

import java.util.List;

public interface PriceListService {

    //get all
    List<PriceList> getAll();

    //get by id
    PriceList getById(Long id);

    //add priceList
    PriceList addPriceList(PriceListDto priceListDto);

    //update priceList
    PriceList updatePriceList(Long id, PriceListDto priceListDto);

    //delete priceList
    void deletePriceList(Long id);

}
