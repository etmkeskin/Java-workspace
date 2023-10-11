public class MinimumSwaps {
    public static int minMoves(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int swaps = 0;

        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                swaps++;
                left++;
                right--;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0};
        int minSwaps = minMoves(arr);
        System.out.println("Minimum number of swaps required: " + minSwaps);
    }
}
