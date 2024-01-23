package conditional;

import java.util.Scanner;

public class digitcount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number:- ");
        long input = in.nextLong();
        System.out.print("Number you want to find:- ");
        int num = in.nextInt();

        int count = 0;
        while(input >0){
            int check = (int) (input % 10);
            if (check == num) {
                count++;
            }

            input = input/10;
        }

        System.out.println("This number occurs "+ count + " times");
    }
    
}
