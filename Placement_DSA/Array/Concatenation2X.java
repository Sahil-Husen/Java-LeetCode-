public class Concatenation2X {
    

     public static int[] concatenateArray(int arr[],int n){

        int newArr[] = new int[2*n];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
            newArr[i+n] = arr[i];
        }

        return newArr;

     }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int size = arr.length;
         int newArr []= concatenateArray(arr, size);
         for(int i:newArr){
            System.out.print(i+", ");
         }

    }

}
