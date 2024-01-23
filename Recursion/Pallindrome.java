package Recursion;

public class Pallindrome {
    public static void main(String[] args) {
        String a = new String("mdnam");
        System.out.println(palli(a, 0));
        
    }

    static boolean palli(String a, int s){
        // if(s < a.length()/2 ){
        //     if(a.charAt(s) == a.charAt(a.length()-1-s)){
        //         return palli(a,s+1);
        //     }else{
        //         return false;
        //     }
        // }else{
        //     return true;
        // }

        if(s >= a.length()/2 ) return true;
        if(a.charAt(s) != a.charAt(a.length()-1-s)) return false;

        return palli(a, s+1);
    }
}
