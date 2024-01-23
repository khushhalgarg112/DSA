package conditional;

import java.util.Scanner;

public class fiboonaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count =2;

        while(count <= n){
            int sum = a+b;
            a = b;
            b = sum;
            count++;
        }
        System.out.println(b);
    }
}
