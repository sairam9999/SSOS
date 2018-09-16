package com.example.svankayalapati.ssos.db;

import com.example.svankayalapati.ssos.PlaceOrder;

import java.util.HashMap;

public class ItemDetails {

    HashMap<String, Item> itemMap = new HashMap<>();

    public void init() {
        itemMap.put("Butter", new Item("Carrington", 250, "2lb",
                ContainerType.JAR, "Butter", PlaceOrder.imageId_butter,
                "Description 1", "Description 2"));

        itemMap.put("Cane Sugar", new Item("Florida Crystals", 250, "2lb",
                ContainerType.JAR, "Cane Sugar", PlaceOrder.imageId_cane_sugar,
                "Description 1", "Description 2"));

        itemMap.put("Cheese", new Item("Velvetta", 250, "2lb",
                ContainerType.JAR, "Cheese", PlaceOrder.imageId_cheese,
                "Description 1", "Description 2"));

        itemMap.put("Eggs", new Item("Roland", 250, "2lb",
                ContainerType.JAR, "Eggs", PlaceOrder.imageId_eggs,
                "Description 1", "Description 2"));

        itemMap.put("Milk", new Item("Carrington", 250, "2lb",
                ContainerType.JAR, "Butter", PlaceOrder.imageId_butter,
                "Description 1", "Description 2"));

        itemMap.put("Nescafe", new Item("Florida Crystals", 250, "2lb",
                ContainerType.JAR, "Cane Sugar", PlaceOrder.imageId_cane_sugar,
                "Description 1", "Description 2"));

        itemMap.put("Oil", new Item("Velvetta", 250, "2lb",
                ContainerType.JAR, "Cheese", PlaceOrder.imageId_cheese,
                "Description 1", "Description 2"));

        itemMap.put("Pasta", new Item("Roland", 250, "2lb",
                ContainerType.JAR, "Eggs", PlaceOrder.imageId_eggs,
                "Description 1", "Description 2"));

        itemMap.put("Rice", new Item("Carrington", 250, "2lb",
                ContainerType.JAR, "Butter", PlaceOrder.imageId_butter,
                "Description 1", "Description 2"));

        itemMap.put("Salt", new Item("Florida Crystals", 250, "2lb",
                ContainerType.JAR, "Cane Sugar", PlaceOrder.imageId_cane_sugar,
                "Description 1", "Description 2"));

        itemMap.put("Sugar", new Item("Velvetta", 250, "2lb",
                ContainerType.JAR, "Cheese", PlaceOrder.imageId_cheese,
                "Description 1", "Description 2"));

        itemMap.put("Wheat Bread", new Item("Roland", 250, "2lb",
                ContainerType.JAR, "Eggs", PlaceOrder.imageId_eggs,
                "Description 1", "Description 2"));

    }

    public HashMap<String, Item> getItemMap() {

        return itemMap;

    }

}

