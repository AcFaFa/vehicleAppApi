package com.Vehiclee.New.controller;

import com.Vehiclee.New.dto.PriceListDto;
import com.Vehiclee.New.model.PriceList;
import com.Vehiclee.New.model.User;
import com.Vehiclee.New.service.PriceListService;
import com.Vehiclee.New.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PriceListController {

    @Autowired
    PriceListService priceListService;

    @GetMapping("/pricelist/getall")
    List<PriceList> priceListGetAll(){
        return priceListService.getAll();
    }

    @GetMapping("/pricelist/getbyid/{id}")
    PriceList priceListGetById(@PathVariable Long id){
        return priceListService.getById(id);
    }

    @PostMapping("/pricelist/add")
    PriceList addPriceList(@RequestBody PriceListDto priceListDto){
        return priceListService.addPriceList(priceListDto);
    }

    @PatchMapping("/pricelist/update/{id}")
    PriceList updatePriceList(@PathVariable Long id, @RequestBody PriceListDto priceListDto){
        return priceListService.updatePriceList(id, priceListDto);
    }

    @DeleteMapping("/pricelist/delete/{id}")
    void deletePriceList(@PathVariable Long id){
        priceListService.deletePriceList(id);
    }
}
