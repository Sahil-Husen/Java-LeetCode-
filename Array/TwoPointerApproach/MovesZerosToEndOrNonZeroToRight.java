package Array.TwoPointerApproach;

public class MovesZerosToEndOrNonZeroToRight {
    public static void main(String[] args) {
            int arr []  ={1,0,0,3,5};
             movesZeros(arr);
             for(int elem : arr){
                System.out.print(elem+" ");
             }
    }


    static void movesZeros(int arr[]){
         int insertPosition = 0;
             for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    arr[insertPosition++] = arr[i];

                }
             }


             while(insertPosition < arr.length){
                arr[insertPosition++] = 0;
             }
    }
}
