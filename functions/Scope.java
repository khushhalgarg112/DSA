package functions;

public class Scope {
    public static void main(String[] args) {

        /* Block Scoping */

        // int a = 12;
        // int b = 43;
        // {
        //     // int a =22; Gives error
        //     a = 212;
        //     int c = 3232;
        //     System.out.println(a);
        // }

        // System.out.println(a);


        /* Method Scoping */

        String name = "Ramse";
        changeName(name);
    }

    static void changeName(String naam) {

        naam = "Hasmukh";
        // System.out.println(name);      We cannot access name variable here in this function
        
    }
}
