package com.example.svankayalapati.ssos.db;

import java.util.HashMap;

public class ItemDetails {

HashMap <String, Item> itemMap = new HashMap<>();

public void init(){
    itemMap.put ("Butter", new Item("Carrington", 250, "2lb", ContainerType.JAR,"Butter"));
    itemMap.put ("Cane Sugar", new Item("Florida Crystals", 250, "2lb", ContainerType.JAR,"Butter"));
    itemMap.put ("Cheese", new Item("Velvetta", 250, "2lb", ContainerType.JAR,"Butter"));
    itemMap.put ("Eggs", new Item("Roland", 250, "2lb", ContainerType.JAR,"Butter"));
    itemMap.put ("Milk", new Item("Kirkland", 250, "2lb", ContainerType.JAR,"Butter"));
    itemMap.put ("Nescafe", new Item("Nescafe", 250, "2lb", ContainerType.JAR,"Butter"));
    itemMap.put ("Oil", new Item("Wesson", 250, "2lb", ContainerType.JAR,"Butter"));
    itemMap.put ("Pasta", new Item("Barilla", 250, "2lb", ContainerType.JAR,"Butter"));
    itemMap.put ("Rice", new Item("Royal", 250, "2lb", ContainerType.JAR,"Butter"));
    itemMap.put ("Salt", new Item("Morton", 250, "2lb", ContainerType.JAR,"Butter"));
    itemMap.put ("Sugar", new Item("Splenda", 250, "2lb", ContainerType.JAR,"Butter"));
    itemMap.put ("Wheat Bread", new Item("Nature's Own", 250, "2lb", ContainerType.JAR,"Butter"));
}

public HashMap <String, Item> getItemMap(){

    return itemMap;

}

}

