package com.example.svankayalapati.ssos.db;

import java.util.HashMap;

public class ItemDetails {

HashMap <String, String> itemMap = new HashMap<>();

public void init(){
    itemMap.put ("Butter", "Butter");
    itemMap.put ("Cane Sugar", "Cane Sugar");
    itemMap.put ("Butter", "Butter");
    itemMap.put ("Butter", "Butter");
    itemMap.put ("Butter", "Butter");
    itemMap.put ("Butter", "Butter");
}

public HashMap <String, String> getItemMap(){

    return itemMap;

}

}

