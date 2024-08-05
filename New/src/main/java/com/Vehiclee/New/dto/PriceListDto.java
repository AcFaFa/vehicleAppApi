package com.Vehiclee.New.dto;

import lombok.Data;

@Data
public class PriceListDto {

    private String code;

    private Integer price;

    private Long year;

    private Long model;
}
