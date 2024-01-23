import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] ans = cyclic(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i != arr[i] - 1) {
                swap(arr,i, arr[i]-1);
            }else{
                i++;
            }
        }
        return arr;
    }

    static void swap(int[] arr,int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
