/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Student
 */
public class ContohMap {

    public static void main(String[] args) {
        Map<String, Integer> mapUmur = new HashMap<>();

        mapUmur.put("Budi", 20);
        mapUmur.put("Susi", 25);
        mapUmur.put("Susi", 29);

        System.out.println("Umur Susi : " + mapUmur.get("Susi"));
        mapUmur.remove("Susi");
        mapUmur.containsKey("Susi");
        
        mapUmur.put("Budi", 20);
        mapUmur.put("Susi", 29);
        for (String key: mapUmur.keySet()){
            System.out.println(key + " " + mapUmur.get(key));
        }
        
        for (Integer value: mapUmur.values()){
            System.out.println(value);
        }
        
        for (Entry<String, Integer> item: mapUmur.entrySet()){
            System.out.println(item.getKey() +" "+ item.getValue());
        }
        
    }

}
