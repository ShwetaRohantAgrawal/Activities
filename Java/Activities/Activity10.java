package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");

        System.out.println("Data in Hashset: "+hs);

        System.out.println("Size: "+hs.size());

        System.out.println("Remove Element: "+hs.remove("C"));

        System.out.println("Remove non existing element: "+hs.remove("X"));

        System.out.println("Check is A is present: "+hs.contains("A"));

        System.out.println("HAshset : "+hs);

    }
}
