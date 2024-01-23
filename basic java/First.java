import java.util.Scanner;

class First {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        /* Datatypes */

        // int a =12;
        // char character = 'a';
        // float num = 23.21f;
        // long max = 2387892372391090239L;

        // System.out.println(max);

        /* Input Programs */

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter the number:- ");
        // int number = input.nextInt();
        // System.out.println("Your Roll no is :- "+ number);

        // input.close();

        /* TypeCasting */

        int a = 133;
        short b = 23432;
        char c = 'A';
        float d = 32.32f;
        double f = 2.34323;
        byte g = 32;
        double ans = (a * c) + (d / g) - (b - f);
        System.out.println((a * c) + "  " + (d / g) + "  " + (b - f));
        System.out.println(ans);
    }
}