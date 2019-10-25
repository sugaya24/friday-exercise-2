package week2.arrayLists;

import java.util.ArrayList;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int max = 0;
        int index = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }

        System.out.println( "ArrayList: " + nums);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
                index = i;
            }
        }
        
        System.out.println("The largest value is " + max + ", which is in slot " + index);
    }
}
