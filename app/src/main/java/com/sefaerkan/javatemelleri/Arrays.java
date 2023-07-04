package com.sefaerkan.javatemelleri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {

        //Array

        String[] dizi = new String[3];
        dizi[0] = "James";
        dizi[1] = "Erkan";
        dizi[2] = "Deneme";

        //System.out.println(dizi[0]);

        int[] dizi2 = new int[3];
        dizi2[0] = 50;
        dizi2[1] = 60;
        dizi2[2] = 60;

        //System.out.println(dizi2[0]);

        int[] dizi3 = {1,2,3};
        //System.out.println(dizi3[2]);

        //Lists

        ArrayList<String> myList = new ArrayList<>();
        myList.add("James");
        myList.add("Erkan");
        myList.add(1,"Kirk");
        //System.out.println(myList.get(0));
        //System.out.println(myList.get(1));
        //System.out.println(myList.get(2));

        //Set => Her eleman bir kere yer alabiliyor

        HashSet<String> set = new HashSet<>();

        set.add("Sefa");
        set.add("Sefa");

        //System.out.println(set.size());

        //HashMap

        HashMap<String, String > map = new HashMap<>();

        map.put("name", "Sefa");
        map.put("instrument", "Guitar");

        //System.out.println(map.get("name"));
        //System.out.println(map.get("instrument"));

        HashMap<String, Integer > map2 = new HashMap<>();
        map2.put("run", 100);
        map2.put("futbol",200);

        //System.out.println(map2.get("run"));
        //System.out.println(map2.get("futbol"));

    }
}
