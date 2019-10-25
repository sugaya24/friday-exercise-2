package week2.arrayLists;

import java.util.ArrayList;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }

        System.out.println( "ArrayList: " + nums);
    }
}
