import java.util.Arrays;

public class NumberGame {

    public static int[] numberGame(int[] nums) {

        // Step 1: Sort the array
        Arrays.sort(nums);

        int[] arr = new int[nums.length];
        int index = 0;

        // Step 2: Process in pairs
        for (int i = 0; i < nums.length; i += 2) {
            // Bob appends first (larger in the pair)
            arr[index++] = nums[i + 1];

            // Alice appends later (smaller in the pair)
            arr[index++] = nums[i];
        }

        return arr;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {5, 4, 2, 3};

        int[] result = numberGame(nums);

        System.out.println(Arrays.toString(result));
        // Output: [3, 2, 5, 4]
    }
}
