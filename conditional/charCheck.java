package conditional;

import java.util.Scanner;

public class charCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);
        
        if (ch >= 'a' && ch <='z') {
            System.out.println("This is lower case letter");
        }else{
            System.out.println("Not Lower Case!");
        }
    }
}
