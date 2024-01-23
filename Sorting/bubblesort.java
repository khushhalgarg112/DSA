
import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4 };
        bub(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] bub(int[] arr) {
        boolean count;
        for (int i = 0; i < arr.length; i++) {
            count = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    count = true;
                }
            }
            if (!count) {
                return arr;
            }
        }
        return arr;
    }
}
