package Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] arr = { 23, 56, 76, 12, 34, 88 };

        reverse(arr);
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
