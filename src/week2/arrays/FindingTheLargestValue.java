package week2.arrays;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = 0;

        System.out.print("Array: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
            if (arr[i] > max) {
                max = arr[i];
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The largest value is " + max);
    }
}
