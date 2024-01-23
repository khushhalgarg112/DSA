package Recursion;

public class fiboonaci {
    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println("Fibbonaci Number is " + ans);
    }

    static int fibo(int n) {
       if(n<=1){
        return n;
       }
       return fibo(n-1) + fibo(n-2);
    }
}
