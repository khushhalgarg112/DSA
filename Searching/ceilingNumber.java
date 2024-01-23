public class ceilingNumber {
    public static void main(String[] args) {
        int[] arr = {-13,-2,2,4,8,12,34,56,78,90,102};
        int target = 10;
        System.out.println(ceilNumber(arr, target));
        
    }

    static int ceilNumber( int[] arr,int target){

        if (target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = (start+end)/2;
            if(arr[mid] == target ){
                return target;
            }
            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid +1;
            }
        }
        return arr[start];
    }
}
