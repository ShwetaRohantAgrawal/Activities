package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        Random indexGen = new Random();

        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        Integer nums[] = list.toArray(new Integer[0]);
        int randomInt = indexGen.nextInt(nums.length);
        System.out.println("Index value : "+ randomInt+"\nArray Value: "+nums[randomInt]);
        scan.close();
    }
}
