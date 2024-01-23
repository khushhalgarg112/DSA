package Recursion;

import java.util.Arrays;

/**
 * ReverseArray
 */
public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int s, int e){
        if(s>=e){
            return;
        }
        swap(arr,s,e);
        reverse(arr, s+1, e-1);
    }

    static void swap(int[] arr, int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}