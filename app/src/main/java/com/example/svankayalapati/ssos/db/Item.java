package com.example.svankayalapati.ssos.db;

public class Item {

    String brand;
    float price;
    String weight;
    ContainerType containerType;
    String description;

    public Item(String brand, float price, String weight, ContainerType containerType, String description) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.containerType = containerType;
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public ContainerType getContainerType() {
        return containerType;
    }

    public void setContainerType(ContainerType containerType) {
        this.containerType = containerType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}