package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();

        myList.add("Mango");
        myList.add("Apple");
        myList.add("guava");
        myList.add("WaterMelon");
        myList.add("Grapes");

        for (String name:myList
             ) {
            System.out.println(name);

        }
        System.out.println("the third name in list : "+myList.get(2));
        System.out.println("Check if Apple is in the list : "+myList.contains("Apple"));
        System.out.println("Size of the list is : "+myList.size());
        System.out.println("Remove Watermelon from the list : "+myList.remove(3));
        System.out.println("Now size of the list is : "+myList.size());
        for (String name:myList
        ) {
            System.out.println(name);

        }
    }


}
