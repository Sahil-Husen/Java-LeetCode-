// package Placement_DSA.Sliding_Window;

// /**
//  * MaxSubArrSizeK
//  * Sliding Window Pattern
//  */

// /**
//     * Template for fixed size Sliding
//     * 1. Build the First Window
//     * 2. Process the first Window/ Calculate First Answer;
//     *   e.g:- answer = ... or sum = ...
//     * 3. Slide the Remaining Window
//     *   for(int i= k.....){
//     *   // Remove Outgoing element
//     *   // Add Incoming Element
//     *   // Update Answer  
//     * }
//     * 
//  */

// public class MaxSubArrSizeK {

//     public static int maximumSubArrSizeK(int arr[], int k){
//         int n = arr.length;
//         int sum = 0;
//         int res = Integer.MIN_VALUE;
//         int low = 0;
//         int high = k-1;

//         // Calculated the first window
//         for(int i=low;i<=high;i++){
//             sum+=arr[i]; // process the answer or result
//         }

//         // Slide the window and {Remove or Add the Outgoing and Incoming element respectively}

//         while(high<n-1){
//             low++;
//             high++;

//             if(high== n) break;

//             sum+=arr[high]-arr[low-1];
//             res = Math.max(res, sum);
//         }
//         return res;

//     }

//     public static void main(String[] args) {
//         int arr [] = {100,200,300,400};
//         int k = 3;
//         int res= maximumSubArrSizeK(arr, k);
//         System.out.println(res);
//     }
// }

public class Solution {

    public static int MaxSub(int arr[], int k) {

        int len = arr.length;
        

        int low = 0;
        int high = k - 1;
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += arr[i];
        }

        int res = sum;

        while (high < len-1) {
                low++;
                high++;
                if(high==len) break;
                
                sum+=arr[high]-arr[low-1];
                res = Math.max(sum, res);
        }
        return res;

    }


    public static void main(String[] args) {
        int arr[] = {100,200,300,400};
        int k = 2;
        System.out.println(MaxSub(arr,k));
    }
}