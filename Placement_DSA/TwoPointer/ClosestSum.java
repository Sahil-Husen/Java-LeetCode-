package Placement_DSA.TwoPointer;

import java.util.*;
public class ClosestSum {


public static int threeSumClosest(int[] arr, int target) {

        int n = arr.length;
        int res = arr[0] + arr[1] + arr[2];
        int max_diff = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1, right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                int diff = Math.abs(sum - target);

                if (diff < max_diff) {
                    max_diff = diff;
                    res = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;  
                }
            }
        }

        return res;
    }


    public static void main(String[] args) {
            int arr[] = {-1,2,1,-4};
            int res = threeSumClosest(arr, 1);
            System.out.println(res);
    }
}


 