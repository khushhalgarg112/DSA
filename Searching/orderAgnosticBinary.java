public class orderAgnosticBinary {
    public static void main(String[] args) {
        // int[] arr = { -12, -6, -1, 3, 12, 23, 45, 76, 89, 99 };
        int[] arr = {98,67,56,45,34,34,23,12,2,-1,-23,-45,-67};
        int target = -1;

        int ans = binary(arr, target);
        System.out.println(ans);
    }

    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] < arr[end]) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
