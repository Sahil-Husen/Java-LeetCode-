package Placement_DSA.TwoPointer;

public class TargetSum {
    public static int[] targetSum(int arr[], int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if(sum == target){
                return new int[]{i+1,j+1};
            }
            else if(sum < target){
                i++;
            }
            else if(sum > target){
                j--;
            }
            

             
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 9;
        int res[] = targetSum(arr, target);
        
            if(res.length== 0){
                System.out.println("No matching indices found");
            }
            else{
                for (int elem : res) {
                System.out.print(elem + " ");
                }
            }
        }
    
}

