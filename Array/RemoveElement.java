package Array;

public class RemoveElement {
     public static void main(String[] args) {
        int arr [ ] = {3,2,2,3};
        int elem = 3;
       int res =  removeElement(arr, elem);
       System.out.println(res);

     }
         /*  here we are using the two pointer approach to solve the problem.
             with concept of if any element of the array matched with the given value then We are swapping the current element of the array and the Last value of the array using 2 Pointer.        
     */
     
     static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

     }

     static int removeElement(int arr[],int elem){
        int i=0;
        int j = arr.length-1;

        while(i<j){
            if(arr[i]==elem){
                swap(arr, i, j);
                j--;

            }
            else{
                i++;
            }
        }
        return i;
     }
}
