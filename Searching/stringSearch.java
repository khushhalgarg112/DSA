public class stringSearch {
    public static void main(String[] args) {
        
        String temp = "Friend";
        char target = 'i';

        boolean ans = strSearch(temp, target);
        System.out.println(ans);
    }

    // static boolean strSearch(String word, char target){
    //     if (word.length() == 0) {
    //         return false;
    //     }

    //     for (int i = 0; i < word.length(); i++) {
    //         if (target == word.charAt(i)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }


    static boolean strSearch(String word, char target){
        if (word.length() == 0) {
            return false;
        }

        for (char ans : word.toCharArray()) {
            if (target == ans) {
                return true;
            }
        }
        return false;
    }
}
