package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Voilet");
        map.put(2,"Indigo");
        map.put(3,"Blue");
        map.put(4,"Green");
        map.put(5,"Yellow");

        System.out.println("Map Created with values: "+map);

        System.out.println("Remove element Yellow:"+map.remove(5));

        System.out.println("Hash Map contains value Blue:"+map.containsValue("Blue"));

        System.out.println("Number os elements in map :"+map.size());

        System.out.println("Updated MAp : "+map);

    }
}
