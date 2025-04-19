package com.trident.trident_project.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
}
