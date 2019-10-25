package week2.arrays;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = 0;
        int index = 0;

        System.out.print("Array: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The largest value is " + max);
        System.out.println("It is in slot " + index);
    }
}
