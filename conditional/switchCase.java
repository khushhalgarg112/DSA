package conditional;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        // switch (num) {
        //     case 1:
        //         System.out.println("Day1");
        //         break;
        //     case 2:
        //         System.out.println("Day2");
        //         break;
        //     case 3:
        //         System.out.println("Day3");
        //         break;
        //     case 4:
        //         System.out.println("Day4");
        //         break;

        //     default:
        //         System.out.println("Completed");
        //         break;
        // }


        /* Enhanced switch Case */
        switch (num) {
            case 1 -> System.out.println("Day1"); 
            case 2 -> System.out.println("Day1");
            case 3 -> System.out.println("Day1");
            case 4 -> System.out.println("Day1");
            default ->  System.out.println("Completed");
               
        }
    }
}
