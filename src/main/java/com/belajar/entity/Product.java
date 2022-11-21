package com.belajar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

 private Long id;
@Column(length = 150, nullable = false)
 private String brand;
 @Column(length = 10, nullable = false, unique = true)
 private String model;
 private double prince;

 public Product(){

 }

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getBrand() {
    return brand;
}

public void setBrand(String brand) {
    this.brand = brand;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public double getPrince() {
    return prince;
}

public void setPrince(double prince) {
    this.prince = prince;
}





 
 
}
