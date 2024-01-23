package conditional;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number:- ");
        long num = in.nextLong();

        int ans = 0;

        while (num > 0) {
            int rem = (int) (num % 10);
            ans = ans * 10 + rem;

            num = num / 10;

        }
        System.out.println("Reverse of the number:- "+ans);
    }
}
