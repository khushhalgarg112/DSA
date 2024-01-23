package String;

class SubStringProg {

    public static void main(String[] args) {
        String a = "helo";
        String b ="he";
        System.out.println(strStr(a,b));
    }

    static int strStr(String haystack, String needle) {
       
        // if(haystack.indexOf(needle) >= 0){
        //     return haystack.indexOf(needle);
        // }
        // return -1;

        int count  = needle.length();
        for(int i=0 ; i < haystack.length() - count+1; i++){
            String test = haystack.substring(i,i+count);
            System.out.println(test);
            if(test.equals(needle)){
                return i;
            }
        }
        return -1;

    }
}