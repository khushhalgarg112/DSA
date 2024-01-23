package functions;

public class Overiding {
    public static void main(String[] args) {
        fun(12);
        fun("HeLlO BrO!");
        fun(23,44);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String b){
        System.out.println(b);
    }

    static void fun(int a, int b){
        System.out.println(a+b);
    }
}
