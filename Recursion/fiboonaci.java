package Recursion;

public class fiboonaci {
    public static void main(String[] args) {
        int ans = fibo(30);
        System.out.println("Fibbonaci Number is " + ans);
    }

    static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
