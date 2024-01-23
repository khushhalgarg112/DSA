public class magicnumber {
    public static void main(String[] args) {
        int ans  = magicnum(8);
        System.out.println(ans);
    }

    private static int magicnum(int i) {
        int count = 0;
        int sum= 0;
        int num = 0;
        if (i==1) {
            return 1;
        }
        while(i!=1){
            num = i%2;
            sum = sum + (num * (int)Math.pow(5, count));
            count++;
            i = i/2;
        }
        sum = sum + (int)Math.pow(5, count);
        return sum;
    }
}
