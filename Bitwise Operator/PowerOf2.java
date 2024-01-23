public class PowerOf2 {
    public static void main(String[] args) {
        int count = 0;
        int n =16;
        while(n!=0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        if (count==1) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
