package String;

public class Pallindrome {
    public static void main(String[] args) {
        String name = "NAman";
        System.out.println(palli(name));

    }

    static boolean palli(String a) {
        a = a.toLowerCase();
        int s = 0;
        int e = a.length() - 1;
        while (e > s) {
            if (a.charAt(e) == a.charAt(s)) {
                s++;
                e--;
            } else {
                return false;
            }
        }
        return true;
    }
}
