package Recursion;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        int[] arr = {3,1,2};
        seq(0, a, arr, 3);
        
    }

    static void seq(int index, ArrayList<Integer> a, int[] arr, int size){
        if(index == size){
            if(a.size() == 0){
                System.out.println("{}");
            }
            for(int x: a){
                System.out.print(x);
            }
            System.out.println();
            return;
        }

        a.add(arr[index]);
        seq(index+1, a, arr, size);
        a.remove(a.size()-1);
        seq(index+1, a, arr, size);


    }
}
