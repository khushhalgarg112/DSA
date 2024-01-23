
import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 2,1 };
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] selection(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int max = -1;
            int index = -1;
            len--;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index =j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[len];
            arr[len] = temp;
            
        }

        return arr;
    }
}