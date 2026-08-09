package Sliding_Window;

public class MinSubArray {

    public static int minSizeSubArray(int[] arr,int target){

        int low =0;
        

        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int res = 0;
        for(int high = 0;high<arr.length;high++){

            sum+=arr[high];
            

            while(sum>=target){
                    minLen = high-low+1;
                    res = Math.min((minLen), res);
                    sum-=arr[low++];
            }



        }

        return minLen == Integer.MAX_VALUE  ? 0 :minLen; 
    }

    public static void main(String[] args) {
        int[] arr ={2,3,1,2,4,3};
        int target  = 7;
        System.out.println(minSizeSubArray(arr, target));
    }
    
}
