public class psotionInInfinte {
    public static void main(String[] args) {

        int[] arr = {2,3,4,8,10,12,16,19,24,28,36,89,93};

        int target = 28;

        System.out.println(answer(arr, target));
   
    }

    static int answer(int[] arr, int target){
        int start = 0;
        int end = 1;
        
        while (target > arr[end]) {
            int temp = end +1;
            end = end + (end-start +1) *2;
            start = temp;
        }

        return binary(arr, target, start, end);
    }

    static int binary(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
