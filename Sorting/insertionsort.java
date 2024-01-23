import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 4 };
        int[] b = insertion(arr);
        System.out.println(Arrays.toString(b));
    }

    static int[] insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
