package Array.TwoPointerApproach;

public class MovesZerosToEndOrNonZeroToRight {
   public static void main(String[] args) {
      int arr[] = { 1, 0, 0, 3, 5 };
      int arr2[] = { 1, 0, 0, 3, 5 };
      System.out.println("First Method");
      movesZeros(arr);
      for (int elem : arr) {
         System.out.print(elem + " ");
      }
      System.out.println();
      System.out.println("Second Method using for loop");
      moveZero(arr2);
      for (int elem : arr2) {
         System.out.print(elem + " ");
      }

   }

   static void movesZeros(int arr[]) {
      int insertPosition = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] != 0) {
            arr[insertPosition++] = arr[i];

         }
      }

      while (insertPosition < arr.length) {
         arr[insertPosition++] = 0;
      }
   }

   static void moveZero(int[] arr) {
      int j = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] != 0) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
         }
      }
   }

}
