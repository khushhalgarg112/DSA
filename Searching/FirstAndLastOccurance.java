import java.util.Arrays;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,7,7,7,8,9,};
        int target = 7;
        int[] result = occurance(arr, target);
        System.out.println(Arrays.toString(result));
        
    }

    static int[] occurance(int[] arr,int target){

        int[] ans = {-1,-1};

        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);

        return ans;
    }

    static int search(int[] arr, int target, boolean isStart){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                ans = mid;
                if(isStart){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }

        return ans;
    }
}
