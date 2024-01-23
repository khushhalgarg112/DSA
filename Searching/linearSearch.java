public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 12, 8, 32, 65, 23, 76, 88 };

        int ans = linear(arr, 32);
        System.out.println("This element is present at "+ ans+ " index." );

    }

    static int linear(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1;
    }
}
