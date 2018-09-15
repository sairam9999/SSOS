package com.example.svankayalapati.ssos.db;

import com.example.svankayalapati.ssos.PlaceOrder;

import java.util.HashMap;

public class ItemDetails {

HashMap <String, Item> itemMap = new HashMap<>();

public void init(){
    itemMap.put ("Butter", new Item("Carrington", 250, "2lb", ContainerType.JAR,"Butter", PlaceOrder.imageId_butter));
    itemMap.put ("Cane Sugar", new Item("Florida Crystals", 250, "2lb", ContainerType.JAR,"Cane Sugar", PlaceOrder.imageId_cane_sugar));
    itemMap.put ("Cheese", new Item("Velvetta", 250, "2lb", ContainerType.JAR,"Cheese", PlaceOrder.imageId_cheese));
    itemMap.put ("Eggs", new Item("Roland", 250, "2lb", ContainerType.JAR,"Eggs", PlaceOrder.imageId_eggs));
//    itemMap.put ("Milk", new Item("Kirkland", 250, "2lb", ContainerType.JAR,"Milk"));
//    itemMap.put ("Nescafe", new Item("Nescafe", 250, "2lb", ContainerType.JAR,"Nescafe"));
//    itemMap.put ("Oil", new Item("Wesson", 250, "2lb", ContainerType.JAR,"Butter"));
//    itemMap.put ("Pasta", new Item("Barilla", 250, "2lb", ContainerType.JAR,"Butter"));
//    itemMap.put ("Rice", new Item("Royal", 250, "2lb", ContainerType.JAR,"Butter"));
//    itemMap.put ("Salt", new Item("Morton", 250, "2lb", ContainerType.JAR,"Butter"));
//    itemMap.put ("Sugar", new Item("Splenda", 250, "2lb", ContainerType.JAR,"Butter"));
//    itemMap.put ("Wheat Bread", new Item("Nature's Own", 250, "2lb", ContainerType.JAR,"Butter"));
}

public HashMap <String, Item> getItemMap(){

    return itemMap;

}

}

