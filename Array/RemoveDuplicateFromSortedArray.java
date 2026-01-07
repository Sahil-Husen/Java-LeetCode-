package Array;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 2, 2, 3 };
      int k =   removeDuplicate(arr);

      for(int i=0;i<k;i++){
        System.out.print(arr[i]+" ");
      }
        
    }

    // this is 2 Pointer approach problem with sorted array
    static int removeDuplicate(int nums[]) {
        int left = 0;
        
        if(nums.length==0) return 0;
        for(int right=1;right<nums.length;right++){
            if(nums[right]!=nums[left]){
                left++;
                nums[left] = nums[right];
            }
        }
        return left+1;

    }

}
