package functions;

public class Shadowing {
    static int  x =12;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        // System.out.println(x) Gives error to me;

        x =23;
        System.out.println(x);

        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
