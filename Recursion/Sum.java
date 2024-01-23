package Recursion;

public class Sum {
    public static void main(String[] args) {
        add(5,0);
    }

    // static int add(int i){
    //     if(i==1){
    //         return 1;
    //     }
    //     return i + add(i-1);
    //  }


    // My one this is sort of backtracking
    // static int add(int i, int sum){
    //     if(i ==1){
    //         return i;
    //     }
    //     sum = i + add(i-1,sum);
    //     return sum;
    // }

    // Tutorial one parametric
    static void add(int i, int sum){
        if(i == 0){
            System.out.println(sum);
            return ;
        }
        add(i-1,sum+i);
    }

}
