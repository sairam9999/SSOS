package com.example.svankayalapati.ssos.db;

public class Item {

    String brand;
    float price;
    String weight;
    ContainerType containerType;
    String description;
    String description1;
    String description2;



    public Item(String brand, float price, String weight,
                ContainerType containerType, String description, int imageId,
                String description1, String description2) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.containerType = containerType;
        this.description = description;
        this.imageId = imageId;

        this.description1 = description1;
        this.description2 = description2;
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

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    int imageId;

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }
}
