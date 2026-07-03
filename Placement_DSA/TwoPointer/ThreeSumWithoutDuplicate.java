package Placement_DSA.TwoPointer;

import java.util.*;

public class ThreeSumWithoutDuplicate {

   public static List<List<Integer>> threeSum(int[] arr) {

    Arrays.sort(arr);

    int n = arr.length;
    List<List<Integer>> res = new ArrayList<>();

    for (int i = 0; i < n - 2; i++) {

        if (i > 0 && arr[i] == arr[i - 1])
            continue;

        int left = i + 1;
        int right = n - 1;

        while (left < right) {

            int sum = arr[i] + arr[left] + arr[right];

            if (sum == 0) {

                res.add(Arrays.asList(arr[i], arr[left], arr[right]));

                left++;
                right--;

                while (left < n && arr[left] == arr[left - 1])
                    left++;

                while ( right >=0 && arr[right] == arr[right + 1])
                    right--;

            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }

    return res;
}

    public static void main(String[] args) {
       
        
        List<List<Integer>> res = new ArrayList<>();

        int arr[] = { -1, 0, 1, 2, -1, -4 };
        res = threeSum(arr);

        for (List<Integer> ele : res) {
            System.out.println(ele);
        }

    }
}