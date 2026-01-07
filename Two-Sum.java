class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 7 };
        int target = 9;
        int[] res = TwoSumFun(arr, target);
        for (int ele : res) {
            System.out.print(ele+" ");
        }
    }

    // this is 2 sum problem for the Sorter Array [1,2,3,4] and target = 5 using 2 Pointer approach
    static int[] TwoSumFun(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
       


        while (left < right) {
             int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }

        }
        return new int[] {};
    }
}
